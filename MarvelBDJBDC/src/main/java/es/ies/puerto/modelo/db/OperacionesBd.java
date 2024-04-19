package es.ies.puerto.modelo.db;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.imp.Personaje;
import es.ies.puerto.modelo.imp.Poder;

public class OperacionesBd extends Conexion {
    
    public OperacionesBd(String url) throws PersonajeException{
        super(url);
    }

    private void actualizar(String query) throws PersonajeException {
        Statement statement = null;


        try {
            statement = getConexion().createStatement();
            statement.executeQuery(query);
        } catch (SQLException exception) {
            throw new PersonajeException(exception.getMessage(), exception);
        }finally{
            try {
                if(statement != null && !statement.isClosed()){
                    statement.close();
                }
                if(!getConexion().isClosed()){
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new PersonajeException(e.getMessage(), e);
            }
            
        }
    }

    private Set<Personaje> obtener(String query) throws PersonajeException {
        Set<Personaje> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;

       
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while(rs.next()){
                int idName = rs.getInt("id");
                String userName = rs.getString("nombre");
                String userGenero = rs.getString("genero");
                Array arrayPoderes = rs.getArray("poderes");
                String[] poderesArray = (String[]) arrayPoderes.getArray();
                Set<String> userPoderes = new HashSet<>(Arrays.asList(poderesArray));
                Personaje personaje = new Personaje(idName, userName, userGenero, userPoderes);
                lista.add(personaje);
            }
        } catch (SQLException e) {
            throw new PersonajeException(e.getMessage(), e);
        }finally{
            try {
                if(rs != null && !rs.isClosed()){
                    rs.close();
                }
                if(statement != null && !statement.isClosed()){
                    statement.close();
                }
                if(!getConexion().isClosed()){
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new PersonajeException(e.getMessage(), e);
            }
        }
        return lista;
    }

    public Set<Personaje> obtenerPersonajes() throws PersonajeException{
        String query = "select per.id, per.nombre, per.genero, p.poder from Personajes as per, Poderes as p, Personajes_poderes as podper where per.id = podper.personaje_id and p.id = podper.poder_id; ";
        return obtener(query);
    }

    public Personaje obtenerPersonaje(Personaje personaje) throws PersonajeException{
        String query = "select per.id, per.nombre, per.alias, per.genero from Personajes as per, from poderes as p where per.id ="+personaje.getId()+"";
        Set<Personaje> lista = obtener(query);
        if(lista.isEmpty()){
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarPersonaje(Personaje personaje) throws PersonajeException{
        String query = "insert into personajes as per (nombre, genero) values ('"+personaje.getNombre()+"','"+personaje.getGenero()+"')";
        actualizar(query);
        Set<String> poderesString = personaje.getPoderes();
        Set<Poder> poderes = new HashSet<>();
        
        for (String poderString : poderesString) {
            Poder poder = new Poder(); 
            poder.setNombrePoder(poderString); 
            poderes.add(poder); 
        }
    }

    public void actualizarPersonaje(Personaje personaje) throws PersonajeException{
        String query = "update personajes set nombre='"+personaje.getNombre()+"', genero ='"+personaje.getGenero()+"' " +
        "where id="+personaje.getId()+"";
        actualizar(query);
        eliminarPoderes(personaje.getId());

        for (String poderString : personaje.getPoderes()) {
            insertarPoderes(new Poder(4, poderString));
        }
    }

    public void eliminarPersonaje(Personaje personaje) throws PersonajeException{
        String query = "delete from personajes as per where per.id = "+personaje.getId()+"";
        actualizar(query);
        eliminarPoderes(personaje.getId());
    }

    private Set<Poder> obtenerPoderes(String query) throws PersonajeException{
        Set<Poder> poderes = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try{
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while(rs.next()){
                int idPoder = rs.getInt("id");
                String nombrePoder = rs.getString("poder");
                Poder poder = new Poder(idPoder, nombrePoder);
                poderes.add(poder);
            }
        }catch (SQLException exception){
            throw new PersonajeException(exception.getMessage(), exception);
        }finally{
            try{
               if (rs != null && !rs.isClosed()){
                rs.close();
               }
               if(statement != null && !statement.isClosed()){
                statement.close();
               }
               if(!getConexion().isClosed()){
                getConexion().close();
               } 
            }catch (SQLException exception){
                throw new PersonajeException(exception.getMessage(), exception);
            }
        }
        return poderes;
    }

    public Set<Poder> obtenerPoderesPersonajes() throws PersonajeException{
        String query = "select id, personaje_id, poder from poderes";
        return obtenerPoderes(query);
    }

    public Set<Poder> obtenerPoderesPersonaje(int id) throws PersonajeException{
        String query = "select poderes.id, poderes.personaje_id, poderes.poder from poderes "+
        " inner join personajes on personajes.id = poderes.personaje_id where poderes.personaje_id = "+ id +"";
        return obtenerPoderes(query);
    }

    public void insertarPoderes(Poder poder) throws PersonajeException{
        String query = "insert into poderes (poder) values ('"+poder.getNombrePoder()+"')";
        actualizar(query);
    }

    public void actualizarPoderes(Poder poder) throws PersonajeException{
        String query = "update poderes set poder = '"+poder.getNombrePoder()+"'";
        actualizar(query);
    }

    public void eliminarPoderes(int idPersonaje) throws PersonajeException {
        String query = "delete from poderes where poderes.personaje_id = "+idPersonaje+"";
        actualizar(query);
    }
}

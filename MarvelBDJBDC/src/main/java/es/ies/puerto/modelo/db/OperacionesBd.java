package es.ies.puerto.modelo.db;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.imp.Alias;
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
            statement.executeUpdate(query);
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
                Personaje personaje = new Personaje(idName, userName, userGenero);
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
        String query = "SELECT per.id, per.nombre, per.genero FROM Personajes AS per";
        return obtener(query);
    }

    public Personaje obtenerPersonaje(Personaje personaje) throws PersonajeException{
        String query = "SELECT per.id, per.nombre, per.genero, p.poder FROM Personajes AS per " +
        "INNER JOIN Personajes_Poderes AS perpod ON perpod.personaje_id = per.id " +
        "INNER JOIN Poderes AS p ON perpod.poder_id = p.id " +
        "WHERE per.id = " + personaje.getId();
        Set<Personaje> lista = obtener(query);
        if(lista.isEmpty()){
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarPersonaje(Personaje personaje) throws PersonajeException{
        String query = "insert into Personajes as per (nombre, genero) values ('"+personaje.getNombre()+"','"+personaje.getGenero()+"')";
        actualizar(query);

    }

    public void actualizarPersonaje(Personaje personaje) throws PersonajeException{
        String query = "update Personajes set nombre='"+personaje.getNombre()+"', genero ='"+personaje.getGenero()+"' " +
        "where id="+personaje.getId()+"";
        actualizar(query);

    }

    public void eliminarPersonaje(Personaje personaje) throws PersonajeException{
        String query = "delete from Personajes as per where per.id = "+personaje.getId()+"";
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

    private Set<Poder> obtenerPoderesPorId(String query, int id) throws PersonajeException {
    Set<Poder> poderes = new HashSet<>();
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
        ps = getConexion().prepareStatement(query);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        while (rs.next()) {
            int poderId = rs.getInt("id");
            String nombrePoder = rs.getString("poder");
            Poder poder = new Poder(poderId, nombrePoder);
            poderes.add(poder);
        }
    } catch (SQLException exception) {
        throw new PersonajeException(exception.getMessage(), exception);
    } finally {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if (ps != null && !ps.isClosed()) {
                ps.close();
            }
            if (!getConexion().isClosed()) {
                getConexion().close();
            }
        } catch (SQLException exception) {
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
        String query = "SELECT p.id, p.personaje_id, p.poder " +
        "FROM poderes p INNER JOIN personajes pj ON pj.id = p.personaje_id " +
        "WHERE p.personaje_id = "+id+"";
        return obtenerPoderesPorId(query, id);
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

        public Set<Alias> obtenerAlias(String query) throws PersonajeException {
        Set<Alias> listaAlias = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;

        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                int idPersonaje = rs.getInt("personaje_id");
                String alias = rs.getString("alias");
                Alias nuevoAlias = new Alias(id, idPersonaje, alias);
                listaAlias.add(nuevoAlias);
            }
        } catch (SQLException e) {
            throw new PersonajeException(e.getMessage(), e);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new PersonajeException(e.getMessage(), e);
            }
        }

        return listaAlias;
    }

    public Set<Alias> obtenerAlias() throws PersonajeException {
        String query = "SELECT * FROM Alias";
        return obtenerAlias(query);
    }

    public Set<Alias> obtenerAliasPorPersonaje(int idPersonaje) throws PersonajeException {
        String query = "SELECT * FROM Alias WHERE personaje_id = " + idPersonaje;
        return obtenerAlias(query);
    }

    public void insertarAlias(Alias alias) throws PersonajeException {
        String query = "INSERT INTO Alias (personaje_id, alias) VALUES (" + alias.getPersonaje_id() + ", '" + alias.getAlias() + "')";
        actualizar(query);
    }
    
    public void actualizarAlias(Alias alias) throws PersonajeException {
        String query = "UPDATE Alias SET alias = '" + alias.getAlias() + "' WHERE id = " + alias.getId();
        actualizar(query);
    }

    public void eliminarAlias(int idAlias) throws PersonajeException {
        String query = "DELETE FROM Alias WHERE id = " + idAlias;
        actualizar(query);
    }
    

}

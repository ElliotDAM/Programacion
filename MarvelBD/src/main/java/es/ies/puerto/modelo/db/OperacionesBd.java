package es.ies.puerto.modelo.db;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.imp.Personaje;

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
                String userName = rs.getString("nombre");
                String userAlias = rs.getString("alias");
                String userGenero = rs.getString("genero");
                Array arrayPoderes = rs.getArray("poderes");
                String[] poderesArray = (String[]) arrayPoderes.getArray();
                List<String> userPoderes = new ArrayList<>();
                for (String poder : poderesArray) {
                    userPoderes.add(poder);
                }
                Personaje personaje = new Personaje(userName, userAlias, userGenero, userPoderes);
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
        String query = "select from personaje as per, poderes as p";
        return obtener(query);
    }

    public Personaje obtenerPersonaje(Personaje personaje) throws PersonajeException{
        String query = "select * from personajes";
        Set<Personaje> lista = obtener(query);
        if(lista.isEmpty()){
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarPersonaje(Personaje personaje) throws PersonajeException{
        String query = "";
        actualizar(query);
    }

    public void actualizarPersonaje(Personaje personaje) throws PersonajeException{
        String query = "";
        actualizar(query);
    }

    public void eliminarPersonaje(Personaje personaje) throws PersonajeException{
        String query = "";
        actualizar(query);
    }
}

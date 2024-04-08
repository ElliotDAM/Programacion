package es.ies.puerto.modelo.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
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
                String 
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return lista;
    }
}

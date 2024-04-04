package es.ies.puerto.modelo.db;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.Usuario;

public class OperacionesBdTest {
    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/usuarios.db";
    String MESSAGE_ERROR = "No se ha obtenido el resultado esperado";
    

    @BeforeEach
    public void BeforeEach() {
        operacionesBd = new OperacionesBd(urlBd);
    }

    @Test
    public void obtenerUsuariosAllTest() {
        try {
            Set<Usuario> lista = operacionesBd.obtenerUsuarios();
            Assertions.assertEquals(10, lista.size(), MESSAGE_ERROR );
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
        
    }
    
    @Test
    public void obtenerUsuarioTest() {
        Usuario usuario = new Usuario("5");
        try {
            usuario = operacionesBd.obtenerUsuario(usuario);
            Assertions.assertNotNull(usuario, MESSAGE_ERROR );
            Assertions.assertNotNull(usuario.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getEdad(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getCiudad(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
        
    }

    @Test
    public void insertarUsuarioTest() {
        Usuario usuario = new Usuario("11", "Pepe", 20, "miciudad");
        try {
            operacionesBd.insertarUsuario(usuario);
            Usuario usuarioObtenido = operacionesBd.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario, usuarioObtenido, MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
        
    }
}

package Proyecto_Aula.modulo_gestion_usuarios;

import Proyecto_Aula.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class User_ManagementTestFranky {
    @Test
    void actualizarUsuario() throws Exception {
        User usuario = new User("franchezco", "franky", "franco", 456, "frankyfranco456@gmail.com", "123456789");
        User_Management U = new User_Management();
        U.RegistrarUsuario(usuario);
        User usuarioNuevo = new User("franchezco2", "franky2", "franco2", 456, "frankyfranco4567@gmail.com", "987654321");
        boolean confirmacion = U.actualizarUsuario(usuarioNuevo);
        assertTrue(confirmacion);
    }

    @Test
    void actualizarUsuarioConNulos() throws Exception {
        User usuario = new User("franchezco", "franky", "franco", 456, "frankyfranco456@gmail.com", "123456789");
        User_Management U = new User_Management();
        U.RegistrarUsuario(usuario);
        User usuarioNuevo = new User(null, "franky2", "franco2", 0, null, null);
        Exception ex =assertThrows(Exception.class, () -> U.actualizarUsuario(usuarioNuevo));
    }

    @Test
    void actualizarUsuarioListaVacia() throws Exception {
        User usuario = new User("franchezco", "franky", "franco", 456, "frankyfranco456@gmail.com", "123456789");
        User_Management U = new User_Management();
        Exception ex =assertThrows(Exception.class, () -> U.actualizarUsuario(usuario));
    }
    @Test
    void actualizarUsuarioInexistente() throws Exception {
        User usuario = new User("franchezco", "franky", "franco", 456, "frankyfranco456@gmail.com", "123456789");
        User_Management U = new User_Management();
        U.RegistrarUsuario(usuario);
        User usuario2 = new User("frank", "frank", "franco2", 4567, "franchezco456@gmail.com", "987654321");
        Exception ex =assertThrows(Exception.class, () -> U.actualizarUsuario(usuario2));
    }
    @Test
    void eliminarUsuario()throws Exception{
        User usuario = new User("franchezco", "franky", "franco", 456, "frankyfranco456@gmail.com", "123456789");
        User_Management U = new User_Management();
        U.RegistrarUsuario(usuario);
        boolean confirmacion = U.eliminarUsuario(usuario.getId());
        assertTrue(confirmacion);
    }
    @Test
    void eliminarUsuarioListaVacia()throws Exception{
        User_Management U = new User_Management();
        Exception ex =assertThrows(Exception.class, () -> U.eliminarUsuario(456));
    }
    @Test
    void eliminarUsuarioInexistente()throws Exception{
        User usuario = new User("franchezco", "franky", "franco", 456, "frankyfranco456@gmail.com", "123456789");
        User_Management U = new User_Management();
        U.RegistrarUsuario(usuario);
        Exception ex =assertThrows(Exception.class, () -> U.eliminarUsuario(654));
    }
}
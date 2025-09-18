import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class User_ManagementTestRafa {


    @Test
    void iniciarSesion() throws Exception {
        User U = new User("RafaPro", "Rafael", "Mallarino", 7, "mellamanrafa@gmail.com", "1234");
        User_Management X = new User_Management();
        X.RegistrarUsuario(U);

        User usuarioIngresado = X.iniciarSesion("mellamanrafa@gmail.com", "1234");
        assertEquals(U, usuarioIngresado);
    }

    @Test
    void iniciarSesionNull() throws Exception {
        User U = new User("RafaPro", "Rafael", "Mallarino", 7, "mellamanrafa@gmail.com", "1234");
        User_Management X = new User_Management();
        X.RegistrarUsuario(U);


        Exception ex = assertThrows(Exception.class, () -> X.iniciarSesion(null, null));
    }

    @Test
    void IniciarSesionEmptyList() throws Exception {
        User_Management X = new User_Management();
        Exception ex = assertThrows(Exception.class, () -> X.iniciarSesion("arroba@gmail.com", "5678"));

    }


    @Test
    void registrarUsuario_Success() throws Exception {
        User nuevo = new User("NewUser", "Nombre", "Apellido", 3, "nuevo@email.com", "pass123");
        User_Management X = new User_Management();

        User registrado = X.RegistrarUsuario(nuevo);
        assertEquals(nuevo, registrado);
    }

    @Test
    void registrarUsuario_InvalidId() {
        User invalido = new User("User", "Nombre", "Apellido", 0, "email@test.com", "pass");
        User_Management X = new User_Management();

        Exception ex = assertThrows(Exception.class, () -> X.RegistrarUsuario(invalido));
        assertEquals("El ID no puede ser menor o igual a 0.", ex.getMessage());
    }



    @Test
    void registrarUsuario_DuplicateEmail() throws Exception {
        User existente = new User("User1", "Nombre", "Apellido", 1, "duplicado@test.com", "pass");
        User duplicado = new User("User2", "Nombre2", "Apellido2", 2, "duplicado@test.com", "pass2");

        User_Management X = new User_Management();
        X.RegistrarUsuario(existente);

        Exception ex = assertThrows(Exception.class, () -> X.RegistrarUsuario(duplicado));
        assertEquals("Ya existe un usuario con este correo", ex.getMessage());
    }

    @Test
    void registrarUsuario_DuplicateUsername() throws Exception {
        User existente = new User("MismoUser", "Nombre", "Apellido", 1, "email1@test.com", "pass");
        User duplicado = new User("MismoUser", "Nombre2", "Apellido2", 2, "email2@test.com", "pass2");

        User_Management X = new User_Management();
        X.RegistrarUsuario(existente);

        Exception ex = assertThrows(Exception.class, () -> X.RegistrarUsuario(duplicado));
        assertEquals("Ya existe un usuario con este nombre de usuario", ex.getMessage());
    }

    @Test
    void registrarUsuario_DuplicateId() throws Exception {
        User existente = new User("User1", "Nombre", "Apellido", 1, "email1@test.com", "pass");
        User duplicado = new User("User2", "Nombre2", "Apellido2", 1, "email2@test.com", "pass2");

        User_Management X = new User_Management();
        X.RegistrarUsuario(existente);

        Exception ex = assertThrows(Exception.class, () -> X.RegistrarUsuario(duplicado));
        assertEquals("Ya existe un usuario con este Id", ex.getMessage());
    }

    @Test
    void consultarUsuario_Success() throws Exception {
        User U = new User("RafaPro", "Rafael", "Mallarino", 7, "email@test.com", "pass");
        User_Management X = new User_Management();
        X.RegistrarUsuario(U);

        User encontrado = X.ConsultarUsuario(7);
        assertEquals(U, encontrado);
    }

    @Test
    void consultarUsuario_InvalidId() {
        User_Management X = new User_Management();

        Exception ex = assertThrows(Exception.class, () -> X.ConsultarUsuario(0));
        assertEquals("El ID no puede ser menor o igual a 0.", ex.getMessage());
    }


    @Test
    void consultarUsuario_EmptyList() {
        User_Management X = new User_Management();

        Exception ex = assertThrows(Exception.class, () -> X.ConsultarUsuario(1));
        assertEquals("Lista de usuarios vacía", ex.getMessage());
    }

    @Test
    void consultarUsuarioInexistente() throws Exception {
        User U = new User("User1", "Nombre", "Apellido", 1, "email@test.com", "pass");
        User_Management X = new User_Management();
        X.RegistrarUsuario(U);

        Exception ex = assertThrows(Exception.class, () -> X.ConsultarUsuario(99));
        assertEquals("El usuario no existe", ex.getMessage());
    }
}
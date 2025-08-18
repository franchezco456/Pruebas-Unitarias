package Proyecto_Aula;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTestRafa {
    User user = new User("RafaPro", "Rafael", "Mallarino", 7, "rafa@example.com", "contra123");

    @Test
    void getName() {
        assertEquals("Rafael", user.getName());
    }

    @Test
    void setName() {
        user.setName("Rafael Nuevo");
        assertEquals("Rafael Nuevo", user.getName());
    }

    @Test
    void getUser_name() {
        assertEquals("RafaPro", user.getUser_name());
    }

    @Test
    void setUser_name() {
        user.setUser_name("RafaNuevo");
        assertEquals("RafaNuevo", user.getUser_name());
    }

    @Test
    void getLast_name() {
        assertEquals("Mallarino", user.getLast_name());
    }

    @Test
    void setLast_name() {
        user.setLast_name("García");
        assertEquals("García", user.getLast_name());
    }
}
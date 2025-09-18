import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTestFranky {
    User U = new User("Franky F", "franky", "Franco", 456, "frankyfranco456@gmail.com", "123456789");
    @Test
    void getId() {
        assertEquals(456,U.getId());
    }

    @Test
    void setId() {
        U.setId(457);
        assertEquals(457,U.getId());
    }

    @Test
    void getEmail() {
        assertEquals("frankyfranco456@gmail.com",U.getEmail());
    }

    @Test
    void setEmail() {
        U.setEmail("franchezco456@gmail.com");
        assertEquals("franchezco456@gmail.com",U.getEmail());
    }

    @Test
    void getPassword() {
        assertEquals("123456789",U.getPassword());
    }

    @Test
    void setPassword() {
        U.setPassword("987654321");
        assertEquals("987654321",U.getPassword());
    }
}
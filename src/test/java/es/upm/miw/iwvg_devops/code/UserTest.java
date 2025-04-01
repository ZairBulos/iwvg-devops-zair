package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;

    @BeforeEach
    void before() {
        List<Fraction> fractions = List.of(
                new Fraction(4, 2),
                new Fraction(2, 2)
        );

        user = new User("1", "John", "Doe", fractions);
    }

    @Test
    void testUser() {
        assertEquals("1", user.getId());
        assertEquals("John", user.getName());
        assertEquals("Doe", user.getFamilyName());
        assertEquals(2, user.getFractions().size());
    }

    @Test
    void testEmptyConstructor() {
        User emptyUser = new User();

        assertNull(emptyUser.getId());
        assertNull(emptyUser.getName());
        assertNull(emptyUser.getFamilyName());
        assertTrue(emptyUser.getFractions().isEmpty());
        assertEquals(0, emptyUser.getFractions().size());
    }

    @Test
    void testSetFractions() {
        List<Fraction> fractions = List.of(
                new Fraction()
        );

        user.setFractions(fractions);

        assertEquals(1, user.getFractions().size());
    }

    @Test
    void testAddFraction() {
        User newUser = new User();

        newUser.addFraction(new Fraction());

        assertEquals(1, newUser.getFractions().size());
    }

    @Test
    void testFullName() {
        assertEquals("John Doe", user.fullName());
    }

    @Test
    void testChangeName() {
        user.setName("Jane");
        user.setFamilyName("Smith");

        assertEquals("Jane Smith", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("J.", user.initials());
    }
}

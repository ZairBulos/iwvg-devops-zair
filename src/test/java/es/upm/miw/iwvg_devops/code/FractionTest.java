package es.upm.miw.iwvg_devops.code;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(4, 2);
    }

    @Test
    void testFraction() {
        assertEquals(4, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testEmptyConstructor() {
        Fraction emptyFraction = new Fraction();

        assertEquals(1, emptyFraction.getNumerator());
        assertEquals(1, emptyFraction.getDenominator());
    }

    @Test
    void testSetMethods() {
        fraction.setNumerator(2);
        fraction.setDenominator(4);

        assertEquals(2, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(2.0, fraction.decimal());
    }
}

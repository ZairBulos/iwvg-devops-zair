package es.upm.miw.iwvg_devops.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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

    @Test
    void testIsProper() {
        assertFalse(fraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertTrue(fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction fraction1 = new Fraction(8, 4);
        Fraction fraction2 = new Fraction(3, 2);

        assertTrue(fraction.isEquivalent(fraction1));
        assertFalse(fraction.isEquivalent(fraction2));
    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(3, 5);

        Fraction result = fraction.multiply(fraction1);

        assertEquals(12, result.getNumerator());
        assertEquals(10, result.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction fraction1 = new Fraction(3, 5);

        Fraction result = fraction.divide(fraction1);

        assertEquals(20, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }
}

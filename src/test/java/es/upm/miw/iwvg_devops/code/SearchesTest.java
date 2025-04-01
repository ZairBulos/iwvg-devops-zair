package es.upm.miw.iwvg_devops.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SearchesTest {
    private final Searches searches = new Searches();

    @Test
    void testFindFractionDivisionByUserId_ValidFraction() {
        Fraction result = searches.findFractionDivisionByUserId("1");

        assertNotNull(result);
        assertEquals(0, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    void testFindFractionDivisionByUserId_UserNotFound() {
        Fraction result = searches.findFractionDivisionByUserId("999");

        assertNull(result);
    }
}

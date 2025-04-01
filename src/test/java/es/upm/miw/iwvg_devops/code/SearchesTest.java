package es.upm.miw.iwvg_devops.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

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

    @Test
    void testFindUserFamilyNameBySomeImproperFraction_Found() {
        List<String> familyNames;

        Stream<String> result = searches.findUserFamilyNameBySomeImproperFraction();
        familyNames = result.toList();

        assertNotNull(familyNames);
        assertTrue(familyNames.contains("Fernandez"));
        assertTrue(familyNames.contains("Blanco"));
        assertTrue(familyNames.contains("López"));
        assertTrue(familyNames.contains("Torres"));
    }
}

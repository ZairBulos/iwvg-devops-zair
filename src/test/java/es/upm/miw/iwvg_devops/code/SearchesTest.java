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

    @Test
    void testFindFractionMultiplicationByUserFamilyName_ValidFraction() {
        Fraction result = searches.findFractionMultiplicationByUserFamilyName("Fernandez");

        assertNotNull(result);
        assertEquals(0, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @Test
    void testFindFractionMultiplicationByUserFamilyName_FamilyNotFound() {
        Fraction result = searches.findFractionMultiplicationByUserFamilyName("Doe");

        assertNull(result);
    }

    @Test
    void testFindDecimalFractionByNegativeSignFraction() {
        List<Double> decimals;

        Stream<Double> result = searches.findDecimalFractionByNegativeSignFraction();
        decimals = result.toList();

        assertNotNull(decimals);
        assertTrue(decimals.contains(-0.2));
        assertTrue(decimals.contains(-0.5));
        assertTrue(decimals.contains(-0.0));
    }
}

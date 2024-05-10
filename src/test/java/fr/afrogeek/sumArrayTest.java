package fr.afrogeek;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @ Test
    public void testApp()
    {
        assertTrue(true);
        // Préparation des données d'entrée
        double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0};
        int n = arr.length;

        // Appel de la méthode à tester
        double sum = App.sumArray(arr, n);

        // Vérification du résultat attendu
        assertEquals(15.0, sum);

    }
}
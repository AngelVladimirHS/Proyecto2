/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package practica1;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VLADIMIR
 */
public class OperacionesTest {

    /**
     * Test of obtenerNumeros method, of class Operaciones.
     */
    @Test
    public void testObtenerNumeros() {
        System.out.println("obtenerNumeros");
        List<Integer> expResult = new ArrayList<>(List.of(2,3,4,5,6,7,8,9));
        List<Integer> result = Operaciones.obtenerNumeros(1, 10);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerNumeros method, of class Operaciones.
     */
    @Test
    public void testObtenerNumeros2() {
        System.out.println("obtenerNumeros");
        List<Integer> expResult = new ArrayList<>(List.of(21,22,23,24,25,26,27,28,29));
        List<Integer> result = Operaciones.obtenerNumeros(20, 30);
        assertEquals(expResult, result);
    }

}

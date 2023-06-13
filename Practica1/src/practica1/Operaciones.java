package practica1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VLADIMIR
 */
public class Operaciones {
    
    /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public static List<Integer> obtenerNumeros(int numero1, int numero2) {
        List<Integer> numeros = new ArrayList<Integer>();
        int numeroIntermedio = ++numero1;
        while (numero2 > numeroIntermedio) {
	    if (numeroIntermedio % 2 !=0) {
            	numeros.add(numeroIntermedio);
	    }
            ++numeroIntermedio;
        }
        return numeros;
    }
    
}

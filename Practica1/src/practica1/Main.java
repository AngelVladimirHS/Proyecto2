/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author VLADIMIR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        int numero1;
        int numero2;
        System.out.println("Ingrese el primer numero");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = entrada.nextInt();
        System.out.println(operaciones.obtenerNumeros(numero1, numero2).toString());
        
        
    }
    
}

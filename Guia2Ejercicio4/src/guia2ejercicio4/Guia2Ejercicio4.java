/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ejercicio4;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author Valky
 */
public class Guia2Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float c, f;
        System.out.println("Ingrese la temperatura en grados centigrados: ");
        c=leer.nextFloat();
        f=30+((c*9)/5);
        System.out.println("La temperatura ingresada es: " + c + "°C. En Fahrenheit es: " + f + "°F.");
    }
    
}

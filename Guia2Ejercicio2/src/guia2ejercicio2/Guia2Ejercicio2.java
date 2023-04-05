/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ejercicio2;

import java.util.Scanner;

/**Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 *
 * @author Valky
 */
public class Guia2Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre=leer.next();
        System.out.println("Mucho gusto " + nombre + " es un placer saludarte");
    }
    
}

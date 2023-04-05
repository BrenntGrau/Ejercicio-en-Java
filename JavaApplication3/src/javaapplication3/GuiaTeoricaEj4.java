/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Valky
 */
public class GuiaTeoricaEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       String nombre;
       int edad;
        System.out.println("Ingrese su nombre");
        nombre=leer.next();
        System.out.println("Ingrese su edad");
        edad=leer.nextInt();
        System.out.println("Hola " + nombre + " tenes " + edad + " años");
    }
    
}

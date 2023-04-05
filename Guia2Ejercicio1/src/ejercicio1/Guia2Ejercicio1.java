/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 *El programa deberá después mostrar el resultado de la suma

/**
 *
 * @author Valky
 */
public class Guia2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Ingrese dos valores:");
        num1=leer.nextInt();
        num2=leer.nextInt();
        suma=num1+num2;
        System.out.println("La suma de los valores ingresados es: " + suma);
                
    }
    
}

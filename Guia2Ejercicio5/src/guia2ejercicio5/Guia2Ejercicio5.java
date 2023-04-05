/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ejercicio5;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
 *Nota: investigar la función Math.sqrt().
 *
 * @author Valky
 */
public class Guia2Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num;
        int aux;
        System.out.println("Ingrese un numero:");
        num=leer.nextInt();
        aux=num*2;
        System.out.println("El doble del numero ingresado es: " + aux);
        aux=num*3;
        System.out.println("El triple del numero ingresado es: " + aux);
        aux=(int) Math.sqrt(num);
        System.out.println("La raiz cuadrada del numero ingresado es: " + aux);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ejercicio3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
 *Nota: investigar la función toUpperCase() y toLowerCase() en Java
 * @author Valky
 */
public class Guia2Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String frase, aux;
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        aux=toUpperCase(frase);
        System.out.println("La frase ingresada convertida en mayusculas es: " + aux);
        aux=toLowerCase(frase);
        System.out.println("La frase ingresada convertida en minuscula es: " + aux);
                
    }
    
}

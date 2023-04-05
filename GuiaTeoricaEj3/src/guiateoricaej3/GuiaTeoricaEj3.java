/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiateoricaej3;

/**
 *
 * @author Valky
 */
public class GuiaTeoricaEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=5, num2=13;
        int suma;
        suma = num1 + num2;
        double aux=num2/num1;
        boolean logic=num2<num1;
        
        System.out.println("La division de los valores " + aux);
        System.out.println("La respuesta es " + logic);
        System.out.println("La suma es: " + suma);
    }
    
}

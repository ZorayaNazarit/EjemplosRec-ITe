/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class recursivo {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int numero;
        int nFibonacci;
        System.out.println("¿qué numero de la serie desea saber?");
        numero= leer.nextInt();

        System.out.println("El numero es: "+fibonacci(numero));
    
    }
   public static int fibonacci(int numero){
        if(numero<=2){
            return 1;
        }   else {
            return fibonacci(numero-1)+fibonacci(numero-2);
        }
   }
}

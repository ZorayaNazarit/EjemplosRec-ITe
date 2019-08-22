/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividir;
import fibonacci.*;
import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class recursivo {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int dividiendo;
        int divisor;
        System.out.println("¿cual es su dividiendo?");
        dividiendo = leer.nextInt();
        System.out.println("¿cual es su divisor?");
        divisor = leer.nextInt();
        System.out.println("El resultado es: "+dividir(dividiendo, divisor));

    
    }
    public static int dividir(int dividiendo, int divisor){
        if(dividiendo>=divisor){
            return 1 + dividir((dividiendo - divisor),divisor);
        } else{
            return 0;
        }

    }

}

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
public class iterativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int dividiendo;
        int divisor;
        int numero=-1;
        System.out.println("¿cual es su dividiendo?");
        dividiendo = leer.nextInt();
        System.out.println("¿cual es su divisor?");
        divisor = leer.nextInt();

        while(dividiendo>=0){
            dividiendo = dividiendo - divisor;
            numero++;
        }
        System.out.println("El resultado es: "+numero);
    }
    
}

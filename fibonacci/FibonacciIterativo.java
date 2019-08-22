package Fibonacci;

import java.util.Scanner;

/**
 *
 * @author Zoraya
 */
public class FibonacciIterativo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int primerTermino = 1;
        int SegundoTermino = 1;
        int auxiliar = 0;
        int numero=0;
                    
        System.out.print("Ingrese el número del termino de la serie que desea consultar: ");
        numero=leer.nextInt();        
        for (int i = 1; i <= numero; i++) {            
            auxiliar = primerTermino;
            primerTermino = SegundoTermino;
            SegundoTermino = SegundoTermino + auxiliar;
        }
        System.out.println("El "+numero+" termino de la serie fibonacci es: "+ auxiliar);
    }

}


package Potenciacion;

import java.util.Scanner;

/**
 *
 * @author Zoraya
 */
public class PotenciaRecursiva {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int exponente = 0;
        int base = 0;
     
        System.out.print("ingrese la base: ");
        base = leer.nextInt();
        System.out.print("ingrese el exponente: ");
        exponente = leer.nextInt();
        System.out.println(base+" elevado a "+exponente+" es "+calcularPotencia(exponente, base));
        
    }
    
    
    public static int calcularPotencia(int exponente, int base ){
       
           if(exponente==0){
               return 1;
           }else{
               
               return base*calcularPotencia(exponente-1,base);
           }
        
        }

    }


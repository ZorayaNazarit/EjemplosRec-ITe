package Potenciacion;

import java.util.Scanner;

/**
 *
 * @author Zoraya
 */
public class PotenciaIterativa {
     public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    
   int exponente=0;
   int base=0;
   int potencia=1;
   
   System.out.print("ingrese la base: ");
   base=leer.nextInt();
   System.out.print("ingrese el exponente: ");
   exponente=leer.nextInt();
   
         for (int i = 1; i <=exponente; i++) {
             potencia= base* potencia;
             
         }
   
   System.out.println(base+" elevado a "+exponente+" es "+potencia);
   
           }
}


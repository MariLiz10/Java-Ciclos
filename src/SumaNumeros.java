/*
 Realizar un programa que pida al usuario 10 números. Debe calcular el 
resultado de sumar los números introducidos que sean mayores que el primer 
numero introducido . 
 */
package sumanumeros;

import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         
         int numero;
         int numero1;
         int suma=0;
         
         System.out.println("Ingrese el primero numero:");
         numero1=sc.nextInt();
         
         for(int i=2;i<=10;i++){
             
             System.out.println("Ingrese el numero "+i+ ":");
             numero=sc.nextInt();
             
             if (numero>numero1){
                 suma=suma+numero;
                 
             }
           
         }
         System.out.println("La suma de los numeros mayores al primer numero es: "+suma);
    }
    
}

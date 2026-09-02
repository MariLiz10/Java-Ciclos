/*
 Hacer un programa que lea un número entero por teclado y escriba los números enteros impares que
hay desde el 1 hasta el número leído (éste incluido), pero escribiendo solo 5 números por línea.
 */
package numerosimpares;

import java.util.Scanner;

public class NumerosImpares {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int numero;
        int contador =0; //contar los 5 numeros en cada fila
        
        System.out.print("Digite un numero: ");
            numero=sc.nextInt();
            
         System.out.println("Los numeros enteros impares son: ");
        
        for (int i=1;i<=numero;i++){
            
          // indicar que el numero es impar
            if (i%2==1){
                System.out.print(" " +i ); //el print para que se formen de manera horizontal 
                contador++;                 // los resultados 
                
                
                 if (contador ==5) {
                    System.out.println(); //Pa que haga salto de linea
                    contador = 0;
                }
            } 
        }
    }
    
}

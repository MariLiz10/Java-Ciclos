/*
 Pedir por teclado 10 números e indicar si cada uno de ellos es positivo
 o negativo y si es par o impar.
 */
package ciclosjava;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class CiclosJava {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int numero;
        for(int i=1; i<=10; i++){
            System.out.print("Digite un numero: ");
            numero= sc.nextInt();
            
            if (numero<0){
                System.out.println("Su numero es NEGATIVO");
                
            } else {
                System.out.println("Su numero es POSITIVO");
                
            }
            
                if (numero%2==0){
                    System.out.println("Su numero es PAR");
                    
                } else{
                    System.out.println("Su numero es IMPAR");
                
            }
        }
       
    }
    
}

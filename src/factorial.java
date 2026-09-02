/*
Pedir por teclado un número y calcular su factorial. Si el número 
introducido es negativo se seguirá pidiendo hasta que sea positivo.
 */
package factorial;

import java.util.Scanner;


public class factorial {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int numero;
        long factorial;
        String continuar="si";
        
        
        while(continuar.equalsIgnoreCase("si")){
            factorial=1;
            
        System.out.print("Digite un numero POSITIVO: ");
        numero =sc.nextInt();
        
        while(numero<0){
            System.out.print("El numero es NEGATIVO. Digite nuevamente un numero: ");
            numero=sc.nextInt();
        }
        for (int i=1;i<=numero;++i){
        factorial=factorial*i;
    }        
        
        System.out.println("El factorial del numero "+numero+  " es: "+factorial);
        
            System.out.println("");
            System.out.print("¿Quiere digitar otro numero? (si/no): ");
            continuar=sc.next();
        }
    }
    
}

/*
 Hacer un programa que pide un número al usuario,  y escribe en pantalla el mes
correspondiente a tal número (si el usuario introduce  2, el programa escribe “Febrero”). 
Si el numero no es válido, lo indica igualmente. Tras ello, se le pregunta al
usuario si quiere repetir, y si dice “si”, se vuelve a repetir el proceso anterior.
 */
package nomes;

import java.util.Scanner;

public class NoMes {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int mes;
        String repetir="si";
        
        
        while (repetir.equalsIgnoreCase("si")){
            
            System.out.print("Ingrese un numero del 1 al 12: ");
        mes=sc.nextInt();
        
            System.out.println("==EL MES ES:==");
            
            switch (mes){
                case 1 -> System.out.println("Enero");
                    
                case 2 -> System.out.println("Febrero");
                    
                case 3 -> System.out.println("Marzo");
                    
                case 4 -> System.out.println("Abril");
                    
                case 5 -> System.out.println("Mayo");
                    
                case 6 -> System.out.println("Junio");
                    
                case 7 -> System.out.println("Julio");
                    
                case 8 -> System.out.println("Agosto");
                    
                case 9 -> System.out.println("Septiembre");
                    
                case 10 -> System.out.println("Octubre");
                    
                case 11 -> System.out.println("Noviembre");
                    
                case 12 -> System.out.println("Diciembre");
                    
                default -> System.out.println("NUMERO NO VALIDO");
            }
        
            System.out.print("¿Desea intentarlo de nuevo? (si/no): "  );
            repetir=sc.next();
              
            
            }
        
        System.out.println("Eso es todo. Gracias");
        
        
        
    }
    
}

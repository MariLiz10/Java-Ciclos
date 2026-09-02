/*
 Escribir un programa que simule un juego entre el ordenador y el usuario.
Ambos van a ir simulando el lanzamiento, por turnos, de tres dados.
El lanzamiento de los dados se hace escogiendo el ordenador números al azar entre 1 y 6.
Si algún lanzamiento suma 12 entre los tres dados, se da por acabado el juego y se indica quién es el
ganador.
Si pasados 10 lanzamientos de cada uno ninguno ha acertado a sacar 12, se acaba el juego con
empate.
Ejemplo de ejecución: Turno del ordenador, su lanzamiento: 5,7,2. Falla
Turno del usuario, su lanzamiento: 1,1,2. Falla
Turno del ordenador, su lanzamiento: 3,4,1. Falla
Turno del usuario, su lanzamiento: 5,3,3. Falla
Turno del ordenador, su lanzamiento: 5,4,1. Falla
Turno del ordenador, su lanzamiento: 1,7,2. Falla
Turno del ordenador, su lanzamiento: 3,3,6. GANO !!!
 */
package juegosuma12;

import java.util.Scanner;

public class Juegosuma12 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dado1, dado2, dado3;
        boolean gano=false;
            
        System.out.println("==JUEGO==");
        System.out.println("Bienvenido al juego donde si el resultado de los 3 dados "
                + "suma 12 GANAS! ");
        System.out.println("EMPIEZA EL ORDENADOR");
        System.out.println("");
        
        
            for (int i=1; i<=10 && !gano; i++){
                    
                //turno del ordenador
            dado1 = (int)(Math.random()*6)+1;
            dado2 = (int)(Math.random()*6)+1;
            dado3 = (int)(Math.random()*6)+1;
            
            int suma=dado1+dado2+dado3;
            
           
            System.out.println("Turno del ordenador, su lanzamiento es: "+dado1+""+dado2+""+dado3+"");
            
            if (dado1+dado2+dado3==12){
                System.out.println("EL ORDENADOR GANA!");
                System.out.println("PERDISTE!");
            gano = true;
            break;
            
             }else {
                System.out.println("Falla!");
            }
            
            //turno del usuario
                System.out.println("Presione enter para tirar los dados");  
                sc.nextLine();
                
                
            dado1 = (int)(Math.random()*6)+1;
            dado2 = (int)(Math.random()*6)+1;
            dado3 = (int)(Math.random()*6)+1;
            
             suma =dado1+dado2+dado3;
            
            System.out.println("Turno del usuario, su lanzamiento es: "+dado1+""+dado2+""+dado3+"");
                        
            if (dado1+dado2+dado3==12){
                System.out.println("GANASS!");
            gano = true;
            break;
            
             }else {
                System.out.println("Falla!");
            }
        
        
        
        
            }
        
        if (!gano) {
            System.out.println("EMPATE !!!");
        }
    }
    
}

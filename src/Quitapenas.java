/*
  Vamos a escribir un programa que simule una máquina tragaperras mejorada. Las apuestas no son
con dinero sino con fichas llamadas “quitapenas”. El funcionamiento del juego debe ser el siguiente:
* El jugador indica cuántas “quitapenas” se quiere jugar.
* El programa mostrará tres números al azar entre el 1 y el 6.
* Si los tres números son distintos → el jugador pierde todas sus “quitapenas”.
* Si los tres números son 6 (6 6 6) → el jugador pierde todas sus “quitapenas” por ser “el número
del demonio”.
* Si salen dos números iguales → el jugador obtiene tantas “quitapenas” como hubiera apostado.
* Si salen tres números iguales, que no sea la combinación 6 6 6 → el jugador gana el cuadruple de lo
que había apostado .
* El jugador debe indicar si quiere realizar otra tirada → esta será posible siempre que al
jugador le queden “quitapenas”. Si no le quedan se mostrará un mensaje de error indicando que
no tiene “quitapenas” para jugar.
* El jugador debe indicar si quiere finalizar el juego → En ese momento se informará de las
“quitapenas” que tiene y de cuántas ha ganado (las que tenga menos las que haya ido apostando).

 */
package Quitapenas;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Quitapenas {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

        int quitapenas;
        int apuesta;
        int numero1;
        int numero2;
        int numero3;
        int apuestasTotales = 0;
        String continuar = "si";

        System.out.println("=== MAQUINA TRAGAPERRAS ===");

        System.out.print("¿Cuantas quitapenas tienes? ");
        quitapenas = sc.nextInt();

        while (quitapenas>0 && continuar.equals("si")) {

            System.out.print("¿Cuantas quitapenas quieres apostar? ");
            apuesta = sc.nextInt();

            if (apuesta > quitapenas || apuesta <= 0) {
                System.out.println("No puedes apostar esa cantidad.");
                continue; 
            }

            apuestasTotales = apuestasTotales + apuesta;

            numero1 = (int)(Math.random()*6)+1;
            numero2 = (int)(Math.random()*6)+1;
            numero3 = (int)(Math.random()*6)+1;

            System.out.println("");
            System.out.println("Resultado: " + numero1 + " " + numero2 + " " + numero3);

            if (numero1==6 && numero2==6 && numero3==6) {

                quitapenas = quitapenas - apuesta;
                System.out.println("¡666! Es el numero del demonio.");
                System.out.println("Has perdido la apuesta.");

            } else if (numero1 == numero2 && numero2 == numero3) {

                quitapenas = quitapenas + (apuesta *4);
                System.out.println("¡Tres numeros iguales!");
                System.out.println("Has ganado el cuádruple de tu apuesta.");

            } else if (numero1==numero2 || numero1==numero3 || numero2==numero3) {

                System.out.println("¡Dos numeros iguales!");
                System.out.println("Has recuperado tu apuesta.");

            } else {

                quitapenas = quitapenas - apuesta;
                System.out.println("Los tres numeros son diferentes.");
                System.out.println("Has perdido la apuesta.");
            }

            System.out.println("Quitapenas disponibles: " +quitapenas);

            if (quitapenas > 0) {
                System.out.println("");
                System.out.print("¿Quieres realizar otra tirada? (si/no): ");
                continuar = sc.next();
            } else {
                System.out.println("ERROR: No tienes quitapenas para seguir jugando.");
            }
        }

        System.out.println("=== JUEGO TERMINADO ===");
        System.out.println("Quitapenas que tienes: " + quitapenas);
        System.out.println("Quitapenas ganadas: " + (quitapenas - (quitapenas + apuestasTotales - apuestasTotales)));

        
    }
}


package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mazo mazo = new Mazo();
        Jugador jugador = new Jugador();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("****->Elija una opcion-<*****");
            System.out.println("1) Pedir carta");
            System.out.println("2) Calcular puntos");
            System.out.println("3) Dejar juego");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    jugador.pedirCarta(mazo);
                    System.out.println("Carta recibida: " + jugador.getMano().get(jugador.getMano().size() - 1));
                    break;
                case 2:
                    System.out.println("Tus cartas fueron: " + jugador.getMano());
                    System.out.println("Los puntos totales fueron: " + jugador.calcularPuntos());
                    break;
                case 3:
                    System.out.println("Dejando el juego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion válida");
            }
        } while (opcion != 3);


    }
}
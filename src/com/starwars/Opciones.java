package com.starwars;

import java.util.Scanner;

public class Opciones {
    public static int filmOpcion(Scanner sc) {
        System.out.println("Selecciona una opción del 1 - 6:");

        while (true) {
            try {
                int opcion = sc.nextInt();
                if (opcion >= 1 && opcion <= 6) {
                    return opcion;
                } else {
                    System.out.println("Opción inválida");
                }
            } catch (Exception e) {
                System.out.println("Opción inválida");
                sc.nextLine();
            }
        }
    }
}

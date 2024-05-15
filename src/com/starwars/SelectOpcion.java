package com.starwars;

import java.util.Scanner;

public class SelectOpcion {
    public static int selectOpcion(Scanner sc) {
        System.out.println("Selecciona una opción:");
        System.out.println("1. Ver Películas");
        System.out.println("2. Ver Personajes");
        System.out.println("3. Ver Planetas");
        System.out.println("4. Salir");

        while(true){
            try {
                int opcion = sc.nextInt();
                if(opcion >= 1 && opcion <= 4){
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

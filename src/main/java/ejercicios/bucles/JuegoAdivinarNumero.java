package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoAdivinarNumero {
    private static final int NUMERO_MAXIMO = 50;
    private static final int NUMERO_SECRETO = (int) (Math.random() * NUMERO_MAXIMO) + 1;
    private static int pistas = 3;

    protected static void jugar() {
        int intentos = 3;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina el numero entre 1 y " + NUMERO_MAXIMO);

        while (intentos > 0) {
            System.out.printf("Ingresa tu numero (0 -> pistas (restantes: %d)): ",pistas);

            try {
                int numero = sc.nextInt();
                if (numero == 0) {
                    if (pistas > 0) {
                        mostrarPista();
                    }else {
                        System.out.println("No quedan pistas restantes");
                    }
                    continue;
                }

                if (numero == NUMERO_SECRETO) {
                    System.out.println("\n\t\tGanaste");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese solo números enteros entre 1 y " + NUMERO_MAXIMO);
                System.out.println("Cero para obtener una pista");
                sc.nextLine();
                continue;
            }

            intentos--;
            System.out.printf("Intentos restantes: %d%n", intentos);
            

        }
        System.out.println("\n\t\tPerdiste \nEl numero secreto era: " + NUMERO_SECRETO);
        sc.close();

    }

    private static void mostrarPista() {
        int ini = 0;
        int fin = 0;
        if (pistas == 1) {
            ini = (int) (Math.random() * 5) + 1;
            fin = (int) (Math.random() * 5) + 1;
        }
        if (pistas == 2) {
            ini = (int) (Math.random() * 20) + 1;
            fin = (int) (Math.random() * 20) + 1;
        }
        if (pistas == 3) {
            ini = (int) (Math.random() * 30) + 1;
            fin = (int) (Math.random() * 30) + 1;
        }
        
        int menor = (1 > (NUMERO_SECRETO - ini)) ? 1 : NUMERO_SECRETO - fin;
        int mayor = ((NUMERO_SECRETO + fin) > NUMERO_MAXIMO) ? NUMERO_MAXIMO : NUMERO_SECRETO + fin;

        System.out.printf("El numero secreto esta entre %d y %d%n",menor,mayor);

        pistas--;
    }

}

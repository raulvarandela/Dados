/**
 @author: Raúl Varandela
 Descripción: Clase que contiene toda la lógica de negocio
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dados {

    public static void main(String[] args) {

        int respuesta = 1;
        int dado1;
        int dado2;
        try {
            while (respuesta != 0) {
                dado1 = (int) (Math.random() * 6 + 1);
                dado2 = (int) (Math.random() * 6 + 1);

                System.out.println();
                System.out.println("Tus numeros son: " + dado1 + " y " + dado2);

                switch (dado1) {
                    case 1:
                        System.out.println("____________\n" +
                                "|          |\n" +
                                "|    O     |\n" +
                                "|          |\n" +
                                "------------\n");
                        break;
                    case 2:
                        System.out.println("____________\n" +
                                "|         O|\n" +
                                "|          |\n" +
                                "|O         |\n" +
                                "------------\n");
                        break;
                    case 3:
                        System.out.println("____________\n" +
                                "|         O|\n" +
                                "|     O    |\n" +
                                "|O         |\n" +
                                "------------\n");
                        break;
                    case 4:
                        System.out.println("____________\n" +
                                "|O        O|\n" +
                                "|          |\n" +
                                "|O        O|\n" +
                                "------------\n");
                        break;
                    case 5:
                        System.out.println("____________\n" +
                                "|O        O|\n" +
                                "|     O    |\n" +
                                "|O        O|\n" +
                                "------------\n");
                        break;
                    case 6:
                        System.out.println("____________\n" +
                                "|O        O|\n" +
                                "|O        O|\n" +
                                "|O        O|\n" +
                                "------------\n");
                        break;
                    default:
                        System.out.println("Si has llegado aquí, es que algo ha salido mal.");
                }

                switch (dado2) {
                    case 1:
                        System.out.println("____________\n" +
                                "|          |\n" +
                                "|    O     |\n" +
                                "|          |\n" +
                                "------------\n");
                        break;
                    case 2:
                        System.out.println("____________\n" +
                                "|         O|\n" +
                                "|          |\n" +
                                "|O         |\n" +
                                "------------\n");
                        break;
                    case 3:
                        System.out.println("____________\n" +
                                "|         O|\n" +
                                "|     O    |\n" +
                                "|O         |\n" +
                                "------------\n");
                        break;
                    case 4:
                        System.out.println("____________\n" +
                                "|O        O|\n" +
                                "|          |\n" +
                                "|O        O|\n" +
                                "------------\n");
                        break;
                    case 5:
                        System.out.println("____________\n" +
                                "|O        O|\n" +
                                "|     O    |\n" +
                                "|O        O|\n" +
                                "------------\n");
                        break;
                    case 6:
                        System.out.println("____________\n" +
                                "|O        O|\n" +
                                "|O        O|\n" +
                                "|O        O|\n" +
                                "------------\n");
                        break;
                    default:
                        System.out.println("Si has llegado aquí, es que algo ha salido mal.");
                }
                do {
                    System.out.print("Quieres volver a tirar los dados? 1 --> si / 0 --> no: ");
                    Scanner sc = new Scanner(System.in);
                    respuesta = sc.nextInt();
                } while (respuesta != 0 && respuesta != 1);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Error: Se ha introducido un caracter o cadena no aceptados :(");
        }

    }
}



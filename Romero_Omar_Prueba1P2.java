package proga1q3prueba2;

import java.util.Scanner;
import java.util.Random;

public class Romero_Omar_Prueba1P2 {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        Random rand = new Random();
        String listapalabras[] = {"radar", "level", "world", "civic", "java", "deified", "python", "rotor", "language", "madam", "refer", "stats", "noon", "hello", "moon", "wow", "racecar", "kayak", "apple", "deed"};
        int size;
        String palabratemp = "";

        for (int i = 0; i < listapalabras.length; i++) {
            System.out.println("[" + i + "]" + listapalabras[i]);
        }

        while (true) {
            try {
                System.out.println("");
                System.out.print("Ingrese la medida del arreglo:");
                size = lea.nextInt();
                if (size > 0) {
                    System.out.println("");
                    break;
                } else {
                    System.out.println("INGRESE UN VALOR MAYOR A CERO");
                }
            } catch (Exception e) {
                lea.next();
                System.out.println("INGRESE UN VALOR NUMERICO VALIDO");
            }
        }
        String arregloA[] = new String[size];
        String arregloB[] = new String[size];
        //palabratemp = "";
        for (int i = 0; i < arregloA.length; i++) {
            palabratemp = "";
            int random = rand.nextInt(20);
            for (int j = listapalabras[random].length() - 1; j >= 0; j--) {
                palabratemp += listapalabras[random].charAt(j);
            }
            if (listapalabras[random].equals(palabratemp)) {
                arregloA[i] = listapalabras[random];
            }
        }
        
        for (int i = 0; i < arregloB.length; i++) {
            palabratemp = "";
            int random = rand.nextInt(20);
            for (int j = listapalabras[random].length() - 1; j >= 0; j--) {
                palabratemp += listapalabras[random].charAt(j);
            }
            if (listapalabras[random].equals(palabratemp)) {
                arregloB[i] = listapalabras[random];
            }
        }
        System.out.println("Lista Palabras Palíndroma arreglo A:");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println("[" + i + "]" + arregloA[i]);
        }
        System.out.println("");
        System.out.println("Lista Palabras Palíndroma arreglo B:");
        for (int i = 0; i < arregloB.length; i++) {
            System.out.println("[" + i + "]" + arregloB[i]);
        }
        
        int contador=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(arregloA[i].equals(arregloB[j])){
                   System.out.println("[" + contador + "]" + arregloA[i]);
                }
            }
        }
        System.out.println("");
        System.out.println("Palabras del Arreglo A no están en el Arreglo B son:");
    }

}

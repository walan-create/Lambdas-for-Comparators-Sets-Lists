package org.iesvdm;

import java.util.HashSet;
import java.util.Scanner;

public class ejercicio2HashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        HashSet<String> list = new HashSet<>();

        //Tomamos la cadena inicial y separando por espacios, las guardamos en un array de cadenas
        String[] palabras = frase.split(" ");
        //COn este for guardo cada palabra del array en el hashset
        for (String palabra : palabras) {
            list.add(palabra);
        }
        list.forEach(System.out::println);
    }
}

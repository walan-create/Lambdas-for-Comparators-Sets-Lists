package org.iesvdm;

import java.util.Scanner;
import java.util.TreeSet;

public class ejercicio2TreeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        TreeSet<String> list = new TreeSet<>();
        System.out.println("Ingrese palabras en una línea:");

        //Aquçi lo he hecho de otra manera evitando almacenar cada palabra de la cadena inicial en un array como en el ejercicio anterior
        for (String word : sc.nextLine().split(" ")) {
            list.add(word);
        }
        list.forEach(System.out::println);
    }
}

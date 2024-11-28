package org.iesvdm;

import java.util.*;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<List<Integer>> conjuntoDeListas = new HashSet<>();

        System.out.println("Introduce varias líneas de texto con enteros (una línea vacía para terminar):");
        while (true) {
            String linea = sc.nextLine();
            if (linea.isEmpty()) { break;}
            String[] nums = linea.split(" ");
            List<Integer> lista = new ArrayList<>();
            for (String num : nums) {
                lista.add(Integer.parseInt(num));
            }
            conjuntoDeListas.add(lista);
        }
        // Imprimir el contenido del HashSet usando forEach para los List
        conjuntoDeListas.forEach(lista->{
            lista.forEach(numero->System.out.println(numero+" "));
        });
        // Imprimir el contenido del HashSet usando forEach para el HashSet
        conjuntoDeListas.forEach(lista->{
            System.out.println(lista);
        });
    }
}

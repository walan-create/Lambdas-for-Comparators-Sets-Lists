package org.iesvdm;

import java.util.*;

import static org.iesvdm.ejercicio6MetodoEstatico.obtenerListaMasLarga;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<List<Integer>> conjuntoDeListas = new HashSet<>();

        System.out.println("Introduce varias líneas de texto con enteros (una línea vacía para terminar):");
        while (true) {
            String linea = sc.nextLine();
            if (linea.isEmpty()) {
                break;
            }
            String[] nums = linea.split(" ");
            List<Integer> lista = new ArrayList<>();
            for (String num : nums) {
                lista.add(Integer.parseInt(num));
            }
            conjuntoDeListas.add(lista);
        }
        List<Integer> listaMasLarga = obtenerListaMasLarga(conjuntoDeListas);
        System.out.println("Lista más larga: " + listaMasLarga);
    }
}

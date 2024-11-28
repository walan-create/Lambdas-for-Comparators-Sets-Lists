package org.iesvdm;

import java.util.*;
import java.util.stream.Collectors;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<List<Integer>> conjuntoDeListas = new HashSet<>();
        System.out.println("Introduce varias líneas de texto con enteros (una línea vacía para terminar):");

        while (true) {
            String linea = sc.nextLine();
            if (linea.isEmpty()) {
                break;
            }
            String[] elementos = linea.split(" ");
            List<Integer> lista = Arrays.stream(elementos)
                    .filter(elemento -> elemento.matches("\\d+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            conjuntoDeListas.add(lista);
        }

        // Encuentro la lista mas larga con streams
        List<Integer> listaMasLarga = conjuntoDeListas.stream()
                .max(Comparator.comparingInt(List::size))
                .orElseGet(ArrayList::new);
        System.out.println("La lista más larga es: " + listaMasLarga);

        //Encuentro la lista con la mayor suma con streams
        List<Integer> listaConMayorSuma = conjuntoDeListas.stream()
                .max(Comparator.comparingInt(l -> l.stream().reduce(0, Integer::sum)))
                .orElseGet(ArrayList::new);
        System.out.println("La lista con la mayor suma es: " + listaConMayorSuma);

    }
}


package org.iesvdm;

import java.util.*;
import java.util.stream.Collectors;

public class ejercicio7SegundaParte {
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

        // Comparator para ordenar listas por longitud
        Comparator<List<Integer>> comparadorPorLongitud = Comparator.comparingInt(List::size);

        // Comparator para ordenar listas por la suma de sus enteros
        Comparator<List<Integer>> comparadorPorSuma = Comparator.comparingInt(lista -> lista.stream().mapToInt(Integer::intValue).sum());

        // Encuentro la lista más larga usando Collections.max en base a el comparador por longitud
        List<Integer> listaMasLarga = Collections.max(conjuntoDeListas, comparadorPorLongitud);
        System.out.println("La lista más larga es: " + listaMasLarga);

        // Encuentro la lista con Collections.max en base a el comparador por Suma
        List<Integer> listaConMayorSuma = Collections.max(conjuntoDeListas, comparadorPorSuma);
        System.out.println("La lista con la mayor suma es: " + listaConMayorSuma);

    }
}

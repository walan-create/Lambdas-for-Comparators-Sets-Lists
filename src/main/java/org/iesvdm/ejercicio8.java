package org.iesvdm;

import java.util.*;

public class ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Comparator por longitud
        Comparator<List<Integer>> comparadorPorLongitud = Comparator.comparingInt(List::size);
        //Comparador por Suma
        Comparator<List<Integer>> comparadorPorSuma = Comparator.comparingInt(lista -> lista.stream().mapToInt(Integer::intValue).sum());
        //Al instanciar cada ser al crearlo como TreeSet le pasamos como argumento el comparador que queremos usar
        Set<List<Integer>> conjuntoPorSuma = new TreeSet<>(comparadorPorSuma);
        Set<List<Integer>> conjuntoPorLongitud = new TreeSet<>(comparadorPorLongitud);

        System.out.println("Introduce varias líneas de texto con enteros (una línea vacía para terminar):");
        while (true) {
            String linea = sc.nextLine();
            if (linea.isEmpty()) { break;}
            String[] nums = linea.split(" ");
            List<Integer> lista = new ArrayList<>();
            for (String num : nums) {
                lista.add(Integer.parseInt(num));
            }
            conjuntoPorSuma.add(lista);
            conjuntoPorLongitud.add(lista);
        }
        System.out.println("Conjunto ordenado por longitud:");
        conjuntoPorLongitud.forEach(System.out::println);
        System.out.println("Conjunto ordenado por suma:");
        conjuntoPorSuma.forEach(System.out::println);
    }
}

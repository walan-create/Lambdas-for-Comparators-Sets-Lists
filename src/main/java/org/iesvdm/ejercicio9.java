package org.iesvdm;

import java.util.*;

public class ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Comparator<List<Integer>> comparadorPorLongitudYSuma = (l1,l2) -> {
            int comparacionLongitud = Integer.compare(l1.size(), l2.size());
            //Verificamos si ambos valores son iguales y si es asi comparamos por la suma de los valores
            if (comparacionLongitud == 0) {
                return Integer.compare(
                        l1.stream().mapToInt(Integer::intValue).sum(),
                        l2.stream().mapToInt(Integer::intValue).sum()
                );
            }
            return comparacionLongitud;
        };
        Comparator<List<Integer>> comparadorPorSumaYLongitud= (l1,l2) -> {
            int comparacionSuma = Integer.compare(
                    l1.stream().mapToInt(Integer::intValue).sum(),
                    l2.stream().mapToInt(Integer::intValue).sum()
            );
            //Si la comparacion de la suma es igual comparamos por la longitud
            if (comparacionSuma == 0) {
                return Integer.compare(l1.size(), l2.size());
            }
            return comparacionSuma;
        };


        // TreeSet con ordenamiento por longitud y luego por suma
        Set<List<Integer>> conjuntoPorLongitudYSuma = new TreeSet<>(comparadorPorLongitudYSuma);
        // TreeSet con ordenamiento por suma y luego por longitud
        Set<List<Integer>> conjuntoPorSumaYLongitud = new TreeSet<>(comparadorPorSumaYLongitud);

        //Pedimos al usuario que introduzca las listas
        System.out.println("Introduce varias líneas de texto con enteros (una línea vacía para terminar):");
        while (true) {
            String linea = sc.nextLine();
            if (linea.isEmpty()) { break;}
            String[] nums = linea.split(" ");
            List<Integer> lista = new ArrayList<>();
            for (String num : nums) {
                lista.add(Integer.parseInt(num));
            }
            conjuntoPorSumaYLongitud.add(lista);
            conjuntoPorLongitudYSuma.add(lista);
        }

        System.out.println("Conjunto ordenado por longitud y luego por suma:");
        conjuntoPorLongitudYSuma.forEach(System.out::println);
        System.out.println("Conjunto ordenado por suma y luego por longitud:");
        conjuntoPorSumaYLongitud.forEach(System.out::println);

    }
}

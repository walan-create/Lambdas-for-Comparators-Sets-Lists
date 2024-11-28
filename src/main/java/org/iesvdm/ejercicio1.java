package org.iesvdm;

import java.util.*;
import java.util.stream.Collectors;

public class ejercicio1 {
    public static void main(String[] args) {
        //Iniciamos el valor deseado de proximidad
        int objetive = 25;
        Comparator<Integer> comparator = (a, b) -> {
            // Se ordena por proximidad al objetivo
            int diff1 = Math.abs(a - objetive);
            int diff2 = Math.abs(b - objetive);
            // Si se quiere ordenar de mayor a menor, se cambia el orden de los parametros
            return Integer.compare(diff1, diff2);
        };
        //--------------------- Ejemplo para ArrayList ---------------------
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(22);
        list.add(40);
        list.add(13);
        //Ordenamos
        Collections.sort(list, comparator);
        System.out.println("Arraylist ordenado por proximidad a " + objetive + ": " + list);

        //--------------------- Ejemplo para TreeSet ---------------------
        //Al instanciar el set ya le pasamos el comparator creado anteriormente para que ordene en base a su criterio
        TreeSet<Integer> set = new TreeSet<>(comparator);
        set.add(25);
        set.add(22);
        set.add(39);
        set.add(40);
        set.add(41);
        set.add(13);
        System.out.println("Treeset ordenado por proximidad a " + objetive + ": " + set);

        //--------------------- Ejemplo para stream ---------------------
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(22);
        list2.add(40);
        list2.add(13);
        List<Integer> result = list2.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
        System.out.println("Stream ordenado por proximidad a " + objetive + ": " + result);

    }

}

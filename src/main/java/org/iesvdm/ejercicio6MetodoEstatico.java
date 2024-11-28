package org.iesvdm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ejercicio6MetodoEstatico {

    public static List<Integer> obtenerListaMasLarga (HashSet<List<Integer>> conjuntoDeListas) {
       List<Integer> list = conjuntoDeListas.stream()
               .reduce((l1,l2) -> l1.size() > l2.size() ? l1 : l2)
               .orElseGet(ArrayList::new);
        return list;
    };
}

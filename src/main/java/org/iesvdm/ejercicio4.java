package org.iesvdm;

import java.util.*;
import java.util.stream.Collectors;

public class ejercicio4 {

    private static Object lista2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<List<Integer>> conjuntoDeListas = new HashSet<>();
        System.out.println("Introduce varias líneas de texto con enteros y letras (una línea vacía para terminar):");

        while (true) {
            String linea = sc.nextLine();
            if (linea.isEmpty()) { break;}
            String[] elementos = linea.split(" ");
            List<Integer> lista = Arrays.stream(elementos)
                    //La expresión .matches() es un metodo de Stream y le expresion "\\d+" verifica si una cadena representa un número entero positivo.
                    .filter(elemento -> elemento.matches("\\d+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            conjuntoDeListas.add(lista);
        }
        System.out.println(conjuntoDeListas);
    }
}

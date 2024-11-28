package org.iesvdm;

import java.util.*;
import java.util.stream.Collectors;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Set<Integer>> conjuntoDeListas = new ArrayList<>();
        System.out.println("Introduce varias líneas de texto con enteros (una línea vacía para terminar):");

        while (true) {
            String linea = sc.nextLine();
            if (linea.isEmpty()) { break;}
            String[] elementos = linea.split(" ");
            Set<Integer> lista = Arrays.stream(elementos)
                    //La expresión .matches() es un metodo de Stream y le expresion "\\d+" verifica si una cadena representa un número entero positivo.
                    .filter(elemento -> elemento.matches("\\d+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toSet());

            conjuntoDeListas.add(lista);
        }
        //Imprimimos el contenido de la Lista que contiene el Set de Enteros
        System.out.println("Contenido de la Lista que contiene el Set de Enteros: ");
        conjuntoDeListas.forEach(lista->{
            System.out.println(lista);
        });
        /*
        La diferencia radica en que si el List es el contenedor de los Set, los Set como tal se pueder repetir
        pero dentro de cada Set no podrán haber 2 numero iguales, Por ejemplo si ingresamos estos valores:
        1 2 3 4 5
        1 2 3 4 5
        9 9 9 9 9

        las listas finales serán:
        [1, 2, 3, 4, 5]
        [1, 2, 3, 4, 5]
        [9]
          */

    }
}

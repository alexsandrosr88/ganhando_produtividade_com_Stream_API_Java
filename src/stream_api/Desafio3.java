package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosPositivos = numeros.stream()
                .allMatch(n-> n >0);

        if(numerosPositivos)
            System.out.println("\nTodos os números são positivos.");
        else
            System.out.println("\nEsta lista possui número negativo.");
    }
}

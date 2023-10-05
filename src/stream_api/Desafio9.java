package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosRepetidos = numeros.stream()
                .distinct()
                .count() < numeros.size();

        if (numerosRepetidos)
            System.out.println("\nA lista possui números repetidos!");
        else
            System.out.println("\nA lista não possui números repetidos.");
    }
}

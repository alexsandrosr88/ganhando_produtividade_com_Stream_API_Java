package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        boolean numeroMaiorQue10 = numeros.stream()
                .allMatch(n -> n > 10);

        if(numeroMaiorQue10)
            System.out.println("\nExiste número maior que 10.");
        else
            System.out.println("\nNenhum número é maior que 10.");

    }
}

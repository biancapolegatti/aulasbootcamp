package lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Exemplo01 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (Integer n: numeros) { //percorrendo a lista com foreach
            System.out.println(n);
        }

        numeros.forEach(n -> System.out.println(n)); //percorrendo com a lista no próprio método da coleção

    }

}

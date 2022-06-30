package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo01 {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //    Stream<Integer> stream = lista.stream(); //preciso converter minha lista para uma Stream
    //    stream.forEach(n -> System.out.println(n)); //se eu der um sout direto na Stream, ela não imprime os elementos, então eu preciso fazer um forEach para percorrer os dados e imprimir

    //    lista.stream().forEach(n -> System.out.println(n)); //convertendo direto a lista e pedindo pra percorrer e imprimir

        //se eu quero usar os métodos da Stream, eu preciso criar uma nova lista do tipo Stream
        List<Integer> listaAlterada = lista.stream()
                .filter(n -> n % 2 ==0 )//estou para que me retorne os numeros pares da lista
                .map(n -> n * 2) //estou pedindo para que cada elemento da lista ele multiple por 2, mas como a stream não modifica dados, eu preciso criar uma nova lista do tipo stream
                .collect(Collectors.toList());

      //  listaAlterada.stream().forEach(n -> System.out.println(n));
          listaAlterada.forEach(System.out::println);
          //eu falo qual é a classe e qual o método que eu quero referenciar, para cada elemento ele faz um print
        // antes do pontos é a referência a classe em que está método :: método




    }
}

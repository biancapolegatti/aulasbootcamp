package lambdas;

public class Exemplo02 {

    interface InterfaceString {
        String executar(String str);
    }



    //o metodo imprimir recebe uma string e a interface
    public static void imprimir(String texto, InterfaceString inter) {
        String resultado = inter.executar(texto);
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        InterfaceString mudar = s -> s + " complemento"; //ele sabe que o s se refere ao executar, porque só existe um método dentro da InterfaceString
        imprimir("Meu texto", mudar);

    }

}

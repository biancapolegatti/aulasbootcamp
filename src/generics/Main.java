package generics;

public class Main {

    public static void main(String[] args) {

        MinhaClasse obj1 = new MinhaClasse(123); //eu posso criar assim, mas não é o ideal, pois não estou informando qual é o tipo do objeto
        MinhaClasse<Integer> obj2 = new MinhaClasse(123); //aqui eu informei que o tipo que objeto que vou passar é um Integer
        MinhaClasse<String> obj3 = new MinhaClasse("Texto"); //aqui eu informei que o tipo que objeto que vou passar é uma String

        System.out.println(obj1.getObj()); //getObj vai pegar o objeto pra mim
        System.out.println(obj2.getObj());
        System.out.println(obj3.getObj());

    }
}

package exemplo04;

public class Exemplo04 {
    public static void main(String[] args) {

       int numeros2[], a; //o A aqui é um inteiro e numeros2 é um  vetor
       int [] numeros1, b; //o B seria outro vetor assim como

       int numeros[] = new int[5];

       for (int i = 0; i < 5; i++) { //i vem de index
            numeros[i] = i;

        }
        for (int i = 0; i < 5; i++) { //i vem de index
            System.out.print(numeros[i] + " ");

        }


    }


}

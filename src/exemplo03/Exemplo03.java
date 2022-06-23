package exemplo03;

public class Exemplo03 {

    public static void main(String[] args) {
         int contador;

         contador = 0; //1.inicio

         while(contador < 5) { //2.condicao
             System.out.println("contagem");
             contador = contador + 1; //3.passo
            //contador += 1;
             //contador++
             //as tres formas de escrever sao a mesma coisa

         }

         for (contador = 0; contador <5; contador++ ) {
             System.out.println("contagem");
         }


        }

    }


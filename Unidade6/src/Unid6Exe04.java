import java.util.Scanner;

public class Unid6Exe04 {

    /*
     * Uni6Exe04.java - Faça um programa para ler os valores de dois vetores de
     * inteiros, cada um contendo 10 elementos. Crie um terceiro vetor em que cada
     * elemento é a soma dos valores contidos nas posições respectivas dos vetores
     * originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9].
     * Exiba, ao final, os três vetores na tela. Faça três métodos: um método para
     * ler valores dos vetores, outro para somar e outro para escrever os vetores.
     */

    // Construtor = o nome é IGUAL ao nome da classe
    public Unid6Exe04() {
        Scanner s = new Scanner(System.in);
        int TAMANHO = 5;
        int vetor1[] = new int[TAMANHO];
        int vetor2[] = new int[TAMANHO];

        // ler os valores de dois vetores de inteiros
        // .length => retorna o tamanho do vetor
        /*
         * for (int i = 0; i < vetor1.length; i++) {
         * System.out.print("Digite o valor do índice " + i +
         * " para o vetor 1: ");
         * vetor1[i] = s.nextInt();
         * 
         * /*System.out.print("Digite o valor do índice " + i +
         * " para o vetor 2: ");
         * vetor2[i] = s.nextInt(); }
         */

        /*
         * for (int i = 0; i < vetor2.length; i++) {
         * System.out.print("Digite o valor do índice " + i +
         * " para o vetor 2: ");
         * vetor2[i] = s.nextInt();
         * }
         */
        //int vetorResultante[] = null;
        lerValores(s, vetor1, "Vetor 1");
        lerValores(s, vetor2, "Vetor 2");

        int vetorResultante[] = somarVetores(vetor1, vetor2);
        /*
         * for (int i = 0; i < TAMANHO; i++) {
         * vetorResultante[i] = vetor1[i] + vetor2[i];
         * }
         */

      /*   for (int i = 0; i < vetorResultante.length; i++) {
            System.out.println("Vetor[" + i + "]: " + vetorResultante[i]);
        }*/
       imprimir(vetorResultante);
        s.close();
    }

    private void imprimir(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Vetor[" + i + "]: " + valores[i]);
        }
    }

    private int[] somarVetores(int[] vetor1, int[] vetor2) {
        int[] vetorSoma = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
        return vetorSoma;
    }

    private void lerValores(Scanner s, int[] valores, String nomeVetor) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Informe o valor " + (i + 1) + " para o " +
                    nomeVetor + ": ");
            valores[i] = s.nextInt();
        }
    }

    public static void main(String[] args) {
        new Unid6Exe04();
    }
}

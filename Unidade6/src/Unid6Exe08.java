
import java.util.Scanner;

public class Unid6Exe08 {

    /*
     * Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base
     * neste valor, crie um vetor do tipo real. Faça o usuário informar valores para
     * as posições deste vetor e coloque-as nas posições na sequência informada pelo
     * usuário. Imprima uma tabela contendo cada valor diferente e o número de vezes
     * que o valor aparece no vetor (veja exemplo a seguir).
     */

    public Unid6Exe08() {
        //Código-fonte
        Scanner leitor = new Scanner(System.in);
        float[] vetor = criarVetor(leitor);
        lerEntrada(leitor, vetor);

        //Criar vetor com números únicos:
        float[] vUnicos = new float[vetor.length];
        int quantidade = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (!buscar(vetor[i], vUnicos)) {
                vUnicos[quantidade] = vetor[i];
                quantidade++;
            }
        }

        contarEImprimirNumeros(vetor, vUnicos, quantidade);
        leitor.close();
    }

    private void contarEImprimirNumeros(float numero[], float[] unicos, int quantidade) {
        System.out.println("    VALOR     |  FREQUENCIA ");
        for (int i = 0; i < quantidade; i++) {
            int qtdVezes = 0;
            for (int j = 0; j < numero.length; j++) {
                if (unicos[i] == numero[j]) {
                    qtdVezes++;
                }
            }
            System.out.println("     " + unicos[i] + "     |      " + qtdVezes);
        }
    }

    private boolean buscar(float numero, float[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    private void lerEntrada(Scanner s, float[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número real: ");
            vetor[i] = s.nextFloat();
        }
    }

    private float[] criarVetor(Scanner s) {
        int numero = 0;
        do {
            System.out.print("Digite um número entre 1 e 20 para criar o vetor: ");
            numero = s.nextInt();
        } while (numero < 1 || numero > 20);
        return new float[numero];
    }

    public static void main(String[] args) throws Exception {
        new Unid6Exe08();
    }
}

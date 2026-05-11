import java.util.Scanner;

public class Unid6Exe02 {

    /*
     * Uni6Exe02.java - Descreva um algoritmo que leia 12 valores reais e os coloque
     * em um vetor de 12 posições do tipo real. 
     * 
     * Imprima quais valores desses
     * informados são maiores que a média dos valores. 
     * 
     * Faça um método para ler os
     * valores, outro para calcular a média e 
     * outro para informar os valores maiores
     * que a média.
     */
    public Unid6Exe02() {
        Scanner leitor = new Scanner(System.in);
        float valores[] = new float[12];
        
        //Passagem de parâmetro por referência, isto é, ao alterar o conteúdo de "valores" dentro do método
        //o conteúdo de valores se mantém alterado aqui no construtor.
        lerValores(leitor, valores);

        //Este parâmetro está sendo passado por referência, por ser um objeto, contudo não sofre alterações no método
        //o método tem retorno, pois é necessário que o construtor tenha conhecimento do valor calculado para média.
        float media = calcularMedia(valores);
        System.out.println(media);
        
        //Aqui um parâmetro é passado por referência (valores) e outro por valor (média)
        //Isto é, se valores for modificado no método ele volta modificado
        //Se média for modificada no método, ela não é modificada aqui no construtor
        //Contudo, o método imprimir usa os dois parâmetros apenas para leitura.
        imprimirValoresAcimaMedia(valores, media);
        
        leitor.close();
    }

    private void lerValores(Scanner s, float[] valores) {
        //lengh = 12
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Informe o valor " + (i+1) +": ");
            valores[i] = s.nextFloat();
        }
    }

    private float calcularMedia(float[] valores) {
        //calcular média:
        float soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        return (soma / valores.length);
    }

    private void imprimirValoresAcimaMedia(float[] valores, float media) {
        //valores acima da média
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > media) {
                System.out.print(valores[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        new Unid6Exe02();
    }
}

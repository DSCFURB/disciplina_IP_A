import java.text.DecimalFormat;
import java.util.Scanner;

public class Unid5Exe16 {
    
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        float alturaMulheres = 0;
        float alturaGrupo = 0;
        int qtdMulheres = 0;
        int qtdGrupo = 0;

        System.out.print("Altura ou 0 para sair: ");
        float altura = s.nextFloat();
        while (altura != 0) {
            System.out.print("Digite o gênero (F, M ou O): ");
            char genero = s.next().toUpperCase().charAt(0);

            /*switch (genero) {
                case 'F':
                    qtdMulheres++;
                    alturaMulheres += altura;
                case 'M':
                case 'O':
                    qtdGrupo++;
                    alturaGrupo += altura;
                    break;
                default:
                    System.out.println("Gênero inválido.");
            }*/

            if (genero == 'F') {
                qtdMulheres++;
                alturaMulheres += altura;
            }
            qtdGrupo++;
            alturaGrupo += altura;

            System.out.print("Altura ou 0 para sair: ");
            altura = s.nextFloat();
        }

        float mediaMulheres = alturaMulheres / qtdMulheres;
        float mediaGrupo = alturaGrupo / qtdGrupo;

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("A média da altura das mulheres é: " + 
                        df.format(mediaMulheres) +
                        "\nA média de altura do grupo é: " + df.format(mediaGrupo));

        s.close();
    }
}

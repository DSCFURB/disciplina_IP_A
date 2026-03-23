
import java.util.Scanner;

public class Unid4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Horas trabalhadas no mês: ");
        float horasTrabalhadas = teclado.nextFloat();
        System.out.print("Valor da hora: R$");
        float valorHora = teclado.nextFloat();

        int horasMes = 160;
        float salario = horasTrabalhadas * valorHora;
        
        if (horasTrabalhadas > horasMes) {
            float horaExtra = horasTrabalhadas - horasMes;
            float valorExtra = horaExtra * (valorHora * 0.5f);
            //salario = salario + valorExtra;
            salario += valorExtra;
        }
        System.out.println("Salário R$" + salario);
        teclado.close();
    }
}

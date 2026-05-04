import java.util.Scanner;

public class Unid5Exe7 {
    public static void main(String[] args) {
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite quantos números deseja informar: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.print("Número [" + i + "]: ");
            int numero = s.nextInt();

           /*  if (i == 0) {
                menor = numero;
                maior = numero;
            } else {*/
                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            //}
        }

        System.out.println("Maior valor: " + maior + "\nMenor valor: " +
                menor);
        s.close();
    }
}

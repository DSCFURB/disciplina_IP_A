import java.util.Scanner;
//autor: Pedro Costa Carvalho Bernardes
public class Unid4Exe12 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os lados do triângulo:");
        int l1 = teclado.nextInt();
        int l2 = teclado.nextInt();
        int l3 = teclado.nextInt();

        if ((l3 >= l1 + l2) || (l1 >= l2 + l3) || (l2 >= l1 + l3))
            System.out.println("Não formam um triângulo.");
        else {
            if (l1 == l2 && l2 == l3)
                System.out.println("É equilátero.");
            else if (l1 == l2 || l2 == l3 || l3 == l1)
                System.out.println("É isósceles.");
            else
                System.out.println("É escaleno.");
        }
        teclado.close();
    }
}

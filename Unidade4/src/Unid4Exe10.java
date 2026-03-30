import java.util.Scanner;

/*
Entrada: Idade 
Saida: O zezinho é o caçula
Processo: 
1. Ler a idade de Marquinhos, Zezinho e Luluzinha
2. Comparar as idades para descobrir quem é o mais novo


*/

//Autor: João Victor Reinert Bento
public class Unid4Exe10 {

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        System.out.println("Qual a idade de Marquinhos: ");
        int Marquinhos = i.nextInt();

        System.out.println("Qual a idade de Zezinho: ");
        int Zezinho = i.nextInt();

        System.out.println("Qual a idade de Luluzinha");
        int Luluzinha = i.nextInt();
        if (Marquinhos > Zezinho  && Luluzinha > Zezinho) {
            System.out.println("O zezinho é o caçula");
        } else if (Zezinho > Marquinhos && Luluzinha > Marquinhos) {
            System.out.println("O Marquinhos é o caçula");
        } else if (Marquinhos > Luluzinha && Zezinho > Luluzinha) {
            System.out.println("A Luluzinha é a caçula");

            
        }     
    }
}

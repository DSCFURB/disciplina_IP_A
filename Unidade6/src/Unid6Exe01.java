import java.util.Scanner;

public class Unid6Exe01 {
    
    public Unid6Exe01() {
        //Scanner s = new Scanner(System.in);
        int vetor[] = new int[10];
        //int[] vetor = new int[10];

        //for (int i = 0; i < 10; i++) {
        /*for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número para posição " + i + ": ");
            vetor[i] = s.nextInt();
        }*/
       //vetor = lerDados();
       lerDados(vetor);
       
        //System.out.println(vetor[9]);
        //System.out.println(vetor[8]);

        //for (int i = 9; i >= 0; i--) {
        /*for (int i = vetor.length-1; i >= 0; i--) {
            System.out.println("Vetor[" + i + "]: " + vetor[i]);
        }*/
        escreverDados(vetor);

        //s.close();
    }

    private int[] lerDados() {
        Scanner s = new Scanner(System.in);
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número para posição " + i + ": ");
            vetor[i] = s.nextInt();
        }
        s.close();

        return vetor;
    }

    private void lerDados(int[] vetor) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número para posição " + i + ": ");
            vetor[i] = s.nextInt();
        }
        s.close();
    }

      private int[] lerDados(Scanner s) {
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número para posição " + i + ": ");
            vetor[i] = s.nextInt();
        }

        return vetor;
    }

    private void escreverDados(int vetor[]) {
        for (int i = vetor.length-1; i >= 0; i--) {
            System.out.println("Vetor[" + i + "]: " + vetor[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        new Unid6Exe01();    
    }
}

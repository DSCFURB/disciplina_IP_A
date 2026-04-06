import java.util.Scanner;

public class Unid4Exe13 {
    
    /*
        Entradas: 3 cartas / 3 números / carta1, carta2, carta3
        Saídas: truco ou seis ou nove ou "nada"
        Processo: 
        se forem 3 cartas boas -> nove
        se forem 2 cartas boas -> seis
        se for 1 carta boa -> truco
        Fluxograma: github
    */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int carta1 = s.nextInt();  
      int carta2 = s.nextInt();
      int carta3 = s.nextInt();

      int boas = 0;
      if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
        boas++;
      }

      /*if (carta1 == 1) {
        boas++;
      }
      if (carta1 == 2) {
        boas++;
      }
      if (carta1 == 3) {
        boas++;
      }*/

      if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
        boas += 1;
      }
      if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
        boas = boas + 1;
      }

      if (boas == 1) {
        System.out.println("Truco");
      } else if (boas == 2) {
        System.out.println("Seis");
      } else if (boas == 3) {
        System.out.println("Nove");
      }
        s.close();
    }
}

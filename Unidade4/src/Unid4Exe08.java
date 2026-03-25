import java.util.Scanner;

public class Unid4Exe08 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        /*String letraS = s.nextLine();
        letraS = letraS.toLowerCase();
        char letra = letraS.charAt(0);
        */
       char letra = s.nextLine().toLowerCase().charAt(0);

       if (letra == 'a' || letra == 'e' || letra == 'i' ||
            letra == 'o' || letra == 'u') {
                System.out.println("É vogal");
        } else {
            System.out.println("Não é vogal");
        }
       
        s.close();

    }
}

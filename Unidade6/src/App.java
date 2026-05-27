public class App {

    public App() {
        maior();

        int numero = 4;
        float preco = 100f;
        parDesconto(numero, preco);
        System.out.println("Novo preço R$" + preco);

        
        float[] preco2 = new float[1];
        preco2[0] = 100f;
        parDesconto(numero, preco2);
        System.out.println("Novo preço R$" + preco2[0]);
    }


    private void parDesconto(int numero, float[] preco) {
        if (numero % 2 == 0) {
            preco[0] = preco[0] - (preco[0] * 0.5f);
        }
    }

    private void parDesconto(int n, float p) {
        if (n % 2 == 0) {
            p = p - (p * 0.5f);
        }
    }

    private void maior() {
        int n1 = 10;
        int n2 = 5;

        if (n1 > n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}

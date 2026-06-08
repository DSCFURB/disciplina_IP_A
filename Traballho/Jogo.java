public class Jogo {
    
    public Jogo() {
        String[] tesouros = new String[15];
        //.....
        iniciar();
    }

    private String sortear() {
        String[] tipos = {"VAZIO", "OURO", "DIAMANTE","RUBI", "BURADO", "COBRA", "ESPINHOS"};
        /*tipos[0]= "VAZIO";
        tipos[1] = "OURO";
        tipos[2] = "DIAMANTE";*/

        int posicao = (int)(Math.random() * 7);
        //System.out.println(posicao + " " + tipos[posicao]);
        return tipos[posicao];
    }
    
    public void iniciar() {
        //....
        System.out.println("Iniciou o jogo");
    }
}

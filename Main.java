public class Main {
    public static void main(String[] args) {
        Personagem usuario = new Guerreiro(100, 15);
        Personagem computador = new Mago(100, 10);

        Jogo jogo = new Jogo(usuario, computador);
        jogo.iniciarBatalha();
    }
}

import java.util.Random;

public class Jogo implements Jogavel {
    private Personagem usuario;
    private Personagem computador;

    public Jogo(Personagem usuario, Personagem computador) {
        this.usuario = usuario;
        this.computador = computador;
    }

    @Override
    public void iniciarBatalha() {
        Random random = new Random();
        while (usuario.getVida() > 0 && computador.getVida() > 0) {
            usuario.atacar(computador);
            if (computador.getVida() > 0) {
                computador.atacar(usuario);
            }
            System.out.println("Vida do Usuário: " + usuario.getVida());
            System.out.println("Vida do Computador: " + computador.getVida());
        }

        if (usuario.getVida() > 0) {
            System.out.println("Usuário venceu!");
        } else {
            System.out.println("Computador venceu!");
        }
    }
}

public class Guerreiro extends Personagem {
    public Guerreiro(int vida, int forca) {
        super(vida, forca);
    }

    @Override
    public void atacar(Personagem p) {
        p.setVida(p.getVida() - getForca());
        System.out.println("Guerreiro atacou causando " + getForca() + " de dano!");
    }
}

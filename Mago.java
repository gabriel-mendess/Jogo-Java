public class Mago extends Personagem {
    public Mago(int vida, int forca) {
        super(vida, forca);
    }

    @Override
    public void atacar(Personagem p) {
        p.setVida(p.getVida() - getForca());
        System.out.println("Mago lançou uma magia causando " + getForca() + " de dano!");
    }
}

import java.util.Random;

public abstract class Personagem {
    private int vida;
    private int forca;

    public Personagem(int vida, int forca) {
        this.vida = vida;
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = Math.max(0, vida);
    }

    public int getForca() {
        return forca;
    }

    public abstract void atacar(Personagem p);

    public void curar() {
        Random random = new Random();
        int cura = random.nextInt(10) + 1;  // Valor aleatório entre 1 e 10
        setVida(getVida() + cura);
        System.out.println(this.getClass().getSimpleName() + " se curou em " + cura + " pontos!");
    }
}

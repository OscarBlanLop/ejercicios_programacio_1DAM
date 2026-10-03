public class Guerrero extends Personaje {

    private int fuerza;
    private int defensa;

    public Guerrero(String nombre, int vida, int nivel, int fuerza, int defensa) {
        super(nombre, vida, nivel);
        this.fuerza = fuerza;
        this.defensa = defensa;
    }

    @Override
    public int atacar() {
        return fuerza + (nivel * 2);
    }

    @Override
    public void recibirDanio(int cantidad) {
        int danioReducido = cantidad - defensa;
        if (danioReducido < 0) {
            danioReducido = 0;
        }
        super.recibirDanio(danioReducido);
    }

    @Override
    public String toString() {
        return "GUERRERO -> " + super.toString() +
               " | Fuerza: " + fuerza +
               " | Defensa: " + defensa;
    }
}
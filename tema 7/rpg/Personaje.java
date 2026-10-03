public abstract class Personaje implements Atacante {

    protected String nombre;
    protected int vida;
    protected int nivel;

    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    public void recibirDanio(int cantidad) {
        vida -= cantidad;
        if (vida < 0) {
            vida = 0;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void subirNivel() {
        nivel++;
        vida += 10;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               " | Vida: " + vida +
               " | Nivel: " + nivel;
    }
}
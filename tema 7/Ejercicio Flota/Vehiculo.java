public abstract class Vehiculo {

    protected String matricula;
    protected String marca;
    protected int kilometros;
    protected boolean disponible;

    public Vehiculo(String matricula, String marca, int kilometros, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.kilometros = kilometros;
        this.disponible = disponible;
    }

    public void recorrer(int km) {
        if (km > 0) {
            this.kilometros += km;
        }
    }

    public void cambiarDisponibilidad(boolean estado) {
        this.disponible = estado;
    }

    public abstract double calcularCosteViaje(int km);

    @Override
    public String toString() {
        return "Matrícula: " + matricula +
               ", Marca: " + marca +
               ", Km: " + kilometros +
               ", Disponible: " + disponible;
    }
}
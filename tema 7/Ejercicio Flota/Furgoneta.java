public class Furgoneta extends Vehiculo implements Mantenible {

    private double capacidadCarga;

    public Furgoneta(String matricula, String marca, int kilometros, boolean disponible, double capacidadCarga) {
        super(matricula, marca, kilometros, disponible);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularCosteViaje(int km) {
        return km * 0.50;
    }

    @Override
    public void realizarMantenimiento() {
        kilometros = 0;
        System.out.println("Mantenimiento realizado a la furgoneta " + matricula);
    }

    @Override
    public String toString() {
        return "FURGONETA -> " + super.toString() +
               ", Capacidad carga: " + capacidadCarga + " kg";
    }
}
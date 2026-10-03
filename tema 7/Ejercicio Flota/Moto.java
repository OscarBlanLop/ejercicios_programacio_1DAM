public class Moto extends Vehiculo implements Mantenible {

    private boolean tieneMochila;

    public Moto(String matricula, String marca, int kilometros, boolean disponible, boolean tieneMochila) {
        super(matricula, marca, kilometros, disponible);
        this.tieneMochila = tieneMochila;
    }

    @Override
    public double calcularCosteViaje(int km) {
        return km * 0.30;
    }

    @Override
    public void realizarMantenimiento() {
        kilometros = 0;
        System.out.println("Mantenimiento realizado a la moto " + matricula);
    }

    @Override
    public String toString() {
        return "MOTO -> " + super.toString() +
               ", Tiene mochila: " + tieneMochila;
    }
}
public class Empresa {

    private Vehiculo[] flota;
    private int contadorVehiculos;

    public Empresa(int capacidad) {
        flota = new Vehiculo[capacidad];
        contadorVehiculos = 0;
    }

    public void agregarVehiculo(Vehiculo v) {
        if (contadorVehiculos < flota.length) {
            flota[contadorVehiculos] = v;
            contadorVehiculos++;
        } else {
            System.out.println("La flota está llena.");
        }
    }

    public Vehiculo buscarPorMatricula(String matricula) {
        for (int i = 0; i < contadorVehiculos; i++) {
            if (flota[i].matricula.equalsIgnoreCase(matricula)) {
                return flota[i];
            }
        }
        return null;
    }

    public double calcularCosteTotalFlota(int km) {
        double total = 0;
        for (int i = 0; i < contadorVehiculos; i++) {
            total += flota[i].calcularCosteViaje(km);
        }
        return total;
    }

    public void mostrarFlota() {
        for (int i = 0; i < contadorVehiculos; i++) {
            System.out.println(flota[i]);
        }
    }

    public void realizarMantenimientoFlota() {
        for (int i = 0; i < contadorVehiculos; i++) {
            if (flota[i] instanceof Mantenible) {
                ((Mantenible) flota[i]).realizarMantenimiento();
            }
        }
    }
}
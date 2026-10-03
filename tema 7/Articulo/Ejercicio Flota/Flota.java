public class Flota {

    public static void main(String[] args) {

        Empresa empresa = new Empresa(5);

        Furgoneta f1 = new Furgoneta("1234ABC", "Ford", 10000, true, 1200);
        Furgoneta f2 = new Furgoneta("5678DEF", "Renault", 20000, true, 1500);

        Moto m1 = new Moto("1111AAA", "Yamaha", 5000, true, true);
        Moto m2 = new Moto("2222BBB", "Honda", 8000, false, false);

        empresa.agregarVehiculo(f1);
        empresa.agregarVehiculo(f2);
        empresa.agregarVehiculo(m1);
        empresa.agregarVehiculo(m2);

        f1.recorrer(500);
        m1.recorrer(200);

        System.out.println("----- FLOTA -----");
        empresa.mostrarFlota();

        System.out.println("Coste total para 100 km: " +
                empresa.calcularCosteTotalFlota(100) + " €");

        System.out.println("----- MANTENIMIENTO -----");
        empresa.realizarMantenimientoFlota();

        System.out.println("----- FLOTA TRAS MANTENIMIENTO -----");
        empresa.mostrarFlota();
    }
}

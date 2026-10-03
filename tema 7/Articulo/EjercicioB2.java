package oop.tema7.Ejercicio_Articulo;

public class EjercicioB2 {

    public static void main(String[] args) {

        ArticuloB2 a1 = new ArticuloB2 ("Camisa de cuadros", 20, 21, 5);
        ArticuloB2 a2 = new ArticuloB2 ("Pantalón", 100, 10, 2);
        // El objeto a2 no se puede crear porque el IVA no es del 21%,
        // por lo tanto no asigna los valores a los atributos

        double pvp = (a1.precio + (a1.precio * a1.iva / 100));
        System.out.println (a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.iva + "% - PVP: " + pvp + "€");

        a1.precio=30;

        pvp = (a1.precio + (a1.precio * a1.iva / 100));
        System.out.println (a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.iva + "% - PVP: " + pvp + "€");


        pvp = (a2.precio + (a2.precio * a2.iva / 100));
        System.out.println(a2.nombre + " - Precio: " + a2.precio + "€ - IVA: " + a2.iva + "% - PVP: " + pvp + "€");
        // Cuando intentamos acceder a la información del objeto a2
        // todo es null o 0 (los valores por defecto)
    }

}

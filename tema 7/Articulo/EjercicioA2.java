package oop.tema7.Ejercicio_Articulo;


public class EjercicioA2 {

    public static void main(String[] args) {
        
        ArticuloA2 a1 = new ArticuloA2 ();
        a1.nombre ="Camisa";
        a1.precio=20;
        a1.iva=21;
        a1.cuantosQuedan=5;
        
        double pvp = (a1.precio + (a1.precio * a1.iva/ 100));
        System.out.println (a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.iva + "% - PVP: " + pvp + "€");
        
        a1.precio=30;
        
        pvp = (a1.precio + (a1.precio * a1.iva / 100));
        System.out.println (a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.iva + "% - PVP: " + pvp + "€");
    }
}

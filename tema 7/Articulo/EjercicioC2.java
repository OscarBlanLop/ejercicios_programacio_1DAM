package oop.tema7.Ejercicio_Articulo;

public class EjercicioC2 {

    public static void main(String[] args) {

        // Crea un objeto de la clase Articulo llamado a1
        ArticuloC2 a1 = new ArticuloC2 ("Camisa de cuadros", 20, 21, 5);

        // Crea un objeto de la clase Articulo llamado a2
        ArticuloC2 a2 = new ArticuloC2 ("Pantalón", 100, 21, 2);
                 
        // Muestra información del artículo a1
        System.out.println(a1.getNombre() + " - Precio: " + a1.getPrecio() + "€ - IVA: " + a1.getIva() +
                "% - PVP: " + (a1.getPrecio() + (a1.getPrecio() * a1.getIva() / 100)) + "€");

        // Muestra información del artículo a2
        System.out.println(a2.getNombre() + " - Precio: " + a2.getPrecio() + "€ - IVA: " + a2.getIva() + 
                "% - PVP: " + (a2.getPrecio() + (a2.getPrecio() * a2.getIva() / 100)) + "€");
        
        // Cambia información del artículo a1, primero el nombre, después pone precio (el primero dando error y el segundo no)
        a1.setNombre ("");  // Debería dar ERROR
        a1.setNombre ("Camisa de rayas");
        a1.setPrecio (0);   // Debería dar ERROR
        a1.setPrecio (30);
        
        // Muestra información del artículo a1 con los cambios hechos
        System.out.println(a1.getNombre() + " - Precio: " + a1.getPrecio() + "€ - IVA: " + a1.getIva() + 
                "% - PVP: " + (a1.getPrecio() + (a1.getPrecio() * a1.getIva() / 100)) + "€");

        // Cambia información del artículo a2, primero el IVA, después cuantosQuedan (el primero dando error y el segundo no)
        a2.setIva (10);
        a2.setCuantosQuedan(-5);    // Debería dar ERROR
        a2.setCuantosQuedan(0);

        // Muestra información del artículo a2 con los cambios hechos
        System.out.println(a2.getNombre() + " - Precio: " + a2.getPrecio() + "€ - IVA: " + a2.getIva() + 
                "% - PVP: " + (a2.getPrecio() + (a2.getPrecio() * a2.getIva() / 100)) + "€");


    }
    
}

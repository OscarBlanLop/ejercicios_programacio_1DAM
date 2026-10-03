package oop.tema7.Ejercicio_Articulo;

public class EjercicioE2 {

    public static void main(String[] args) {
        // Crea un objeto de la clase Articulo llamado a1
        Articulo a1 = new Articulo ("Camisa de cuadros", 20, 21, 5);

        // Crea un objeto de la clase Articulo llamado a2
        Articulo a2 = new Articulo ("Pantalón", 100, 21, 2);
                 
        a1.imprimir ();
        a2.imprimir ();
        System.out.println ("");
        
        a1.setNombre ("");  // Debería dar ERROR
        a1.setNombre ("Camisa de rayas");
        a1.setPrecio (0);   // Debería dar ERROR
        a1.setPrecio (30);
        
        a2.setIva (10);     // Debería dar ERROR
        a2.setCuantosQuedan(-5);    // Debería dar ERROR
        a2.setCuantosQuedan(4);
        
        a1.imprimir ();
        a2.imprimir ();
        System.out.println ("");
        
        if (a1.vender(100)) {
            System.out.println ("He vendido 100 !!!");
        } else {
            System.out.println ("No he vendido 100, se cancela la venta por falta de stock");
        }
        
        if (a2.vender(2)) {
            System.out.println ("He vendido 2!!");
        } else {
            System.out.println ("No he vendido 2, se cancela la venta por falta de stock");
        }
        
        System.out.println ("Vamos a almacenar 3 unidades más");
        if (a1.almacenar(3)) {
            System.out.println ("He almacenado 3!!!");
        } else {
            System.out.println ("No he almacenado 3");
        }
        
        a1.imprimir ();
        a2.imprimir ();
        System.out.println ("");
        
        System.out.println ("El precio con descuento es: " +a1.getPVPDescuento(20));
        
        a1.setIva (5);   // Debería dar ERROR
        a1.setIva (10);
        a1.imprimir();
        
        a2.setIva (12);  // Debería dar ERROR
        a2.setIva (4);
        a2.imprimir();
    }
}

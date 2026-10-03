package oop.tema7.Ejercicio_Articulo;

public class Articulo {
    
    /*Atributos de la clase*/
    private String nombre;      // nombre del artículo
    private double precio;      // precio sin IVA
    private int iva;            // siempre será 21
    private int cuantosQuedan;  // representa cuántos quedan en el almacén
    
    public static final int IVAGENERAL = 21;
    public static final int IVAREDUCIDO = 10;
    public static final int IVASUPERREDUCIDO = 4;

    public Articulo (String nombre, double precio, int iva, int cuantosQuedan) {
        
        if (nombre.equals ("")) {
            System.err.println ("ERROR: El nombre no puede estar vacío");
        } else if (precio <= 0) {
            System.err.println ("ERROR: El precio no puede ser menor o igual que cero");
        } else if (iva != IVAGENERAL && iva != IVAREDUCIDO && iva != IVASUPERREDUCIDO) {
            System.err.println ("ERROR: El iva debe ser uno de los tres válidos");
        } else if (cuantosQuedan < 0) {
            System.err.println ("ERROR: El stock no puede ser menor que cero");
        } else {
            this.nombre = nombre;
            this.precio = precio;
            this.iva = iva;
            this.cuantosQuedan = cuantosQuedan;
        }
    }

    
    /* GETTERS Y SETTERS */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equals ("")) {
            System.err.println ("ERROR: El nombre no puede estar vacío");
        } else {
            this.nombre = nombre;
        }
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.err.println ("ERROR: El precio no puede ser menor o igual que cero");
        } else {
            this.precio = precio;
        }
    }


    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        if (iva != IVAGENERAL && iva != IVAREDUCIDO && iva != IVASUPERREDUCIDO) {
            System.err.println ("ERROR: El iva debe ser uno de los tres válidos");
        } else {
            this.iva = iva;
        }
    }


    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan < 0) {
            System.err.println ("ERROR: El stock no puede ser menor que cero");
        } else {
            this.cuantosQuedan = cuantosQuedan;
        }
    }
    
    // Métodos
    public void imprimir () {
        System.out.println ("Nombre: " + this.nombre + " IVA: " + this.iva + " Precio: " + this.precio + " PVP: " + this.getPVP() + " Stock: " + cuantosQuedan);
   }

    public double getPVP () {
        return this.precio + (this.precio / 100 * this.iva);
    }

    public double getPVPDescuento (double descuento) {
        
        double precio = this.getPVP();
        return precio - (precio * descuento /100);
    }

    public boolean vender (int unidades) {
        if (unidades > this.cuantosQuedan) {
            return false;
        } else {
            this.cuantosQuedan = this.cuantosQuedan - unidades;         // this.setCuantosQuedan (this.cuantosQuedan - unidades);
            return true;
        }
    }

    public boolean almacenar (int unidades) {
        if (this.cuantosQuedan + unidades > 0) { // OPCIÓN 2: if (unidades > 0) 
            this.setCuantosQuedan(this.cuantosQuedan + unidades);
            return true;
        } else {
            return false;
        }
    }
}

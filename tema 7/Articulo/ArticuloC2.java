package oop.tema7.Ejercicio_Articulo;

public class ArticuloC2 {
    private String nombre;
    private double precio;
    private int iva;
    private int cuantosQuedan;

    public ArticuloC2 (String nombre, double precio, int iva, int cuantosQuedan) {
        if (nombre.equals("")) {
            System.err.println ("ERROR en constructor. El nombre no puede estar vacío");
        } else if (precio <= 0) {
            System.err.println ("ERROR en constructor. El precio no puede ser menor o igual que cero");
        } else if (iva != 21) {
            System.err.println ("ERROR en constructor. El IVA debe ser 21%");
        } else if (cuantosQuedan < 0) {
            System.err.println ("ERROR en constructor. El stock no puede ser menor que cero");
        } else {
            this.nombre = nombre;
            this.precio = precio;
            this.iva = iva;
            this.cuantosQuedan = cuantosQuedan;
        }
    }

    public String getNombre () {
        return this.nombre;
    }

    public void setNombre (String nombre) {
        if (nombre.equals("")) {
            System.err.println ("ERROR. El nombre no puede estar vacío");
        } else {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.err.println ("ERROR. El precio no puede ser menor o igual que cero");
        } else {
            this.precio = precio;
        }
    }


    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        if (iva != 21) {
            System.err.println ("ERROR. El IVA debe ser 21%");
        } else {
            this.iva = iva;
        }
    }


    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan < 0) {
            System.err.println ("ERROR. El stock no puede ser menor que cero");
        } else {
            this.cuantosQuedan = cuantosQuedan;
        }
    }
}

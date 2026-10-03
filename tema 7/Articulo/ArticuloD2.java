package oop.tema7.Ejercicio_Articulo;

public class ArticuloD2 {
    private String nombre;
    private double precio;
    private int iva;
    private int cuantosQuedan;

    public ArticuloD2 (String nombre, double precio, int iva, int cuantosQuedan) {
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
    

    public double getPVP () {
        return (this.precio + this.precio * this.iva / 100);
    }

    public void imprimir () {
        System.out.println ("Nombre: " + this.nombre + " IVA: " + this.iva + " Precio: " + this.precio + " PVP: " + this.getPVP() + " Stock: " + cuantosQuedan);
    }

    public double getPVPDescuento (double descuento) {
        double precioConIva = this.getPVP();
        return precioConIva - (precioConIva * descuento / 100);
    }

    public boolean vender (int x) {
        if (x > this.cuantosQuedan) {
            return false; 
        } else {
            this.cuantosQuedan = this.cuantosQuedan - x;     
            return true;
        }
    }

    public boolean almacenar (int x) {
        if (x > 0) {
            this.cuantosQuedan += x;
            return true;
        } else {
            return false;
        }
    }
}
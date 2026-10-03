package Astros;

// Clase abstracta
abstract class Astro {

    // Atributos
    private String nombre;
    private double radio;
    private double TrotEje;
    private double masa;
    private double tempMedia;
    private double gravedad;

    // Constructor
    public Astro(String nombre, double radio, double TrotEje, double masa, double tempMedia, double gravedad) {
        this.nombre = nombre;
        this.radio = radio;
        this.TrotEje = TrotEje;
        this.masa = masa;
        this.tempMedia = tempMedia;
        this.gravedad = gravedad;
    }

    // Método abstracto. Debe implementarse en todas las clases hijas.
    abstract public void muestra();

    // GETTERS Y SETTERS
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getTrotEje() {
        return TrotEje;
    }

    public void setTrotEje(double TrotEje) {
        this.TrotEje = TrotEje;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTempMedia() {
        return tempMedia;
    }

    public void setTempMedia(double tempMedia) {
        this.tempMedia = tempMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Astro{" + "nombre=" + nombre + ", radio=" + radio + ", TrotEje=" + TrotEje + ", masa=" + masa + ", tempMedia=" + tempMedia + ", gravedad=" + gravedad + '}';
    }

}

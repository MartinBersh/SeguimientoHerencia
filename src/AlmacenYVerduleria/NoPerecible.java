package AlmacenYVerduleria;

public class NoPerecible extends Producto {

    private int contenido;
    private int calorias;

    public NoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.calorias = calorias;
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "NoPerecible = " +
                "\ncontenido = " + contenido +
                ", calorias = " + calorias +
                ", nombre =' " + nombre + '\'' +
                ", precio = " + precio;
    }
}

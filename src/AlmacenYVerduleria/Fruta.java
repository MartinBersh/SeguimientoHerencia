package AlmacenYVerduleria;

public class Fruta extends Producto{

    private double peso;
    private String color;

    public Fruta(String nombre, double precio, double peso, String color){
        super(nombre, precio);
        this.color = color;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruta =" +
                "\npeso= " + peso +
                ", color ='" + color + '\'' +
                ", nombre ='" + nombre + '\'' +
                ", precio =" + precio;
    }
}

package Introduccion;

public class AlumnioInternacional extends Alumno{

    private String pais;
    private double notaIdiomas;

    public AlumnioInternacional(){
        System.out.println("constructor alumno int");
    }
    public AlumnioInternacional(String nombre , String apellido){
        super(nombre, apellido);

    }
    public AlumnioInternacional(String nombre , String apellido, String pais){
        this(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return super.saludar() + " soy extranjero y soy de " + getPais();
    }

    @Override
    public double calucularPromedio() {
        System.out.println("calcularPromedio " + AlumnioInternacional.class.getCanonicalName());
        return ((super.calucularPromedio()*3)+notaIdiomas)/4 ;
    }

    @Override
    public String toString() {
        return super.toString() + "\n pais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}

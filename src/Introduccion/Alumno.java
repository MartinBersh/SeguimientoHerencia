package Introduccion;

public class Alumno extends Persona{

    private String nombreColegio;
    private double notaMate;
    private double noteEspanol;
    private double notaQuim;

    public Alumno(){
        super();
        System.out.println("constructor alumno");
    }

    public Alumno(String nombre , String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre , String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre , String apellido, int edad, String nombreColegio){
        super(nombre, apellido, edad);
        this.nombreColegio = nombreColegio;
    }

    public Alumno(String nombre , String apellido, int edad,
                  String nombreColegio, double notaMate, double notaQuim,
                  double noteEspanol){
        this(nombre, apellido, edad, nombreColegio);
        this.notaMate = notaMate;
        this.notaQuim = notaQuim;
        this.noteEspanol = noteEspanol;
    }


    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public double getNotaMate() {
        return notaMate;
    }

    public void setNotaMate(double notaMate) {
        this.notaMate = notaMate;
    }

    public double getNoteEspanol() {
        return noteEspanol;
    }

    public void setNoteEspanol(double noteEspañol) {
        this.noteEspanol = noteEspañol;
    }

    public double getNotaQuim() {
        return notaQuim;
    }

    public void setNotaQuim(double notaQuim) {
        this.notaQuim = notaQuim;
    }


    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar + " soy alumno  y mi nombre es " + getNombre();
    }

    public double calucularPromedio(){
        System.out.println("calcularPromedio " + Alumno.class.getCanonicalName());
        return (notaQuim + noteEspanol + notaMate )/3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n nombreColegio='" + nombreColegio + '\'' +
                ", notaMate=" + notaMate +
                ", noteEspanol=" + noteEspanol +
                ", notaQuim=" + notaQuim+
                ", promedio= " + this.calucularPromedio();
    }
}

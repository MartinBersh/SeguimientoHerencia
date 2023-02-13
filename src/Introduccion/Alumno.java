package Introduccion;

public class Alumno extends Persona{

    private String nombreColegio;
    private double notaMate;
    private double noteEspanol;
    private double notaQuim;


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
}

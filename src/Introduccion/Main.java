package Introduccion;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("martin");
        alumno.setApellido("villegas");
        alumno.setNombreColegio("campestre");
        alumno.setNotaMate(5.2);
        alumno.setNotaQuim(4.2);
        alumno.setNoteEspanol(2.2);

        AlumnioInternacional alumnoInt = new AlumnioInternacional();
        alumnoInt.setNombre("mario");
        alumnoInt.setApellido("ruiz");
        alumnoInt.setPais("USA");
        alumnoInt.setEdad(12);
        alumnoInt.setNombreColegio("campestre");
        alumnoInt.setNotaMate(6.8);
        alumnoInt.setNotaQuim(8.4);
        alumnoInt.setNotaIdiomas(6.1);


        Profesor profesor = new Profesor();
        profesor.setNombre("Fabian");
        profesor.setApellido("bersh");
        profesor.setAsignatura("mate");

        System.out.println(alumnoInt.getNombre() + " " + alumnoInt.getApellido() + " " + alumnoInt.getNombreColegio() + " " + alumnoInt.getPais());

        System.out.println(alumno.getNombre() + "  " + alumno.getApellido());
        System.out.println(profesor.getAsignatura() + " " + profesor.getNombre() + "  " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + "es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}

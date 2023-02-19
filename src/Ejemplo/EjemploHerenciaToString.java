package Ejemplo;

import Introduccion.AlumnioInternacional;
import Introduccion.Alumno;
import Introduccion.Persona;
import Introduccion.Profesor;

public class EjemploHerenciaToString {
        public static void main(String[] args) {


                System.out.println("=== creando istancia de alumno ===");
                Alumno alumno = new Alumno("Martin", "Villegas", 15, "campestre");
                alumno.setNotaMate(5.2);
                alumno.setNotaQuim(4.2);
                alumno.setNoteEspanol(2.2);
                alumno.setEmail("martin@email.com");


                System.out.println("=== creando istancia de alumnoInt ===");
                AlumnioInternacional alumnoInt = new AlumnioInternacional("Mario", "Rojas", "USA");
                alumnoInt.setEdad(12);
                alumnoInt.setNombreColegio("campestre");
                alumnoInt.setNotaMate(6.8);
                alumnoInt.setNotaQuim(8.4);
                alumnoInt.setNotaIdiomas(6.1);
                alumnoInt.setNoteEspanol(9.0);
                alumnoInt.setEmail("mario@email.com");

                System.out.println("=== creando istancia de profesor ===");
                Profesor profesor = new Profesor("Fabian", "bersh", "mate");
                profesor.setEmail("profe@email.com");

                System.out.println("=================");

                imprimir(alumnoInt);
                imprimir(alumno);
                imprimir(profesor);

                System.out.println("======================");


        }


        public static void imprimir(Persona persona) {
                System.out.println("======================");
                System.out.println(persona);
        }
}



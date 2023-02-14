package Ejemplo;

import Introduccion.*;
import Introduccion.Persona;

import java.sql.SQLOutput;

public class EjemploHerenciaConstructores {
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
                System.out.println("imprimiendo los datos del tipo persona: ");
                System.out.println(" Nombre: "+persona.getNombre() +
                        " Apellido: " + persona.getApellido() +
                        " Edad " + persona.getEdad() +
                        " Email " + persona.getEmail());
                if (persona instanceof Alumno){
                        System.out.println("Imprimiendo los datos del alumno: ");
                        System.out.println("Colegio: " + ((Alumno)persona).getNombreColegio());
                        System.out.println("Nota mate: " + ((Alumno) persona).getNotaMate());
                        System.out.println("Nota Quimica: " + ((Alumno) persona).getNotaQuim());
                        System.out.println("Nota español: " + ((Alumno) persona).getNoteEspanol());

                        if (persona instanceof AlumnioInternacional){
                                System.out.println("imprimiendo los datos del alumnio iternacional");
                                System.out.println("Nota idiomas: "+ ((AlumnioInternacional) persona).getNotaIdiomas());
                                System.out.println("Pais: " + ((AlumnioInternacional) persona).getPais());
                        }
                        System.out.println("=========== sobre escritura PROMEDIO ==========");
                        System.out.println("El promedio es de: "+((Alumno) persona).calucularPromedio());
                        System.out.println("=========== sobre escritura PROMEDIO ==========");

                }
                if(persona instanceof Profesor){
                        System.out.println("Imprimiendo los datos de profesor");
                        System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
                }

                System.out.println("=========== sobre escritura saludar ==========");
                System.out.println(persona.saludar());
                System.out.println("==============================");
        }
}



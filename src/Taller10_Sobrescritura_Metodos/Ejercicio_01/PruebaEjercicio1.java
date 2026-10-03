package Taller10_Sobrescritura_Metodos.Ejercicio_01;

public class PruebaEjercicio1 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos");
        Persona e1 = new Estudiante("Laura", "Ingenieria de Sistemas");
        Persona prof1 = new Profesor("Roberto", "Programacion Orientada a Objetos");

        p1.presentarse();
        e1.presentarse();
        prof1.presentarse();
    }
}

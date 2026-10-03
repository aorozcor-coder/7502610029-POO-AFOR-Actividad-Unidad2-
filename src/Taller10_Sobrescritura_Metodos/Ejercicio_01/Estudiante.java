package Taller10_Sobrescritura_Metodos.Ejercicio_01;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y estudio la carrera de " + carrera + ".");
    }
}

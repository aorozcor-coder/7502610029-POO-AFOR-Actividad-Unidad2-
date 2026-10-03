package Taller9_Uso_de_super.Ejercicio_03;

public class Casa extends Edificio {

    public Casa(String direccion) {
        super(direccion);
    }

    public void intentarAccesoPrivado() {
        /*
         * ERROR DE COMPILACIÓN:
         * System.out.println(super.direccion);
         *
         * Explicación: El atributo 'direccion' es private en la clase base Edificio.
         * La palabra clave super no puede saltarse las reglas de encapsulamiento private.
         */
    }
}

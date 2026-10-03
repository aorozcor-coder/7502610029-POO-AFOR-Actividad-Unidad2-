package Taller10_Sobrescritura_Metodos.Ejercicio_02;

public class PruebaEjercicio2 {
    public static void main(String[] args) {
        Vehiculo vehiculoGenerico = new Vehiculo();
        Bicicleta miBicicleta = new Bicicleta();
        Vehiculo bicicletaPolimorfica = new Bicicleta();

        vehiculoGenerico.moverse();      // Llama a la versión de Vehiculo
        miBicicleta.moverse();           // Llama a la versión sobrescrita en Bicicleta
        bicicletaPolimorfica.moverse();  // Llama a la versión de Bicicleta por polimorfismo
    }
}

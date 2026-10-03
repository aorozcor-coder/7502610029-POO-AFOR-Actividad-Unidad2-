package Taller9_Uso_de_super.Ejercicio_02;

public class Animal {
    String especie;

    public Animal(String especie){
        this.especie = especie;
    }

    public void mostrarEspecie(){
        System.out.println("Especie: " + especie);
    }
}

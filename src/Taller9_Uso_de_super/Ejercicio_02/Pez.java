package Taller9_Uso_de_super.Ejercicio_02;

public class Pez extends Animal  {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua){
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie(){
        super.mostrarEspecie();

        System.out.println("Tipo de Agua: " + tipoDeAgua);
    }
}

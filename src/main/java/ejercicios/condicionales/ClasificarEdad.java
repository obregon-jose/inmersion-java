package ejercicios.condicionales;

public class ClasificarEdad {
    private int edad;

    public ClasificarEdad(int edad){
        this.edad = edad;
    }

    protected void clasificar(){

        System.out.println(
            (edad > 17) ? "Es mayor de edad" : "Menor de edad"
        );

    }
    
}

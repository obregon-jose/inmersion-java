package ejercicios.basicos;

public class ConvertirSegundosAHoras {
    private int segundos;

    public ConvertirSegundosAHoras(int segundos){
        this.segundos = segundos;
    }

    protected void calcular(){
        double resultado = (double) segundos / 60 / 60;
        System.out.printf("%d s = %.2f h%n",segundos,resultado);
    }
}

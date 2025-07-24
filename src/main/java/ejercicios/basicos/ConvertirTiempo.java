package ejercicios.basicos;

public class ConvertirTiempo {

    void segundosAHoras(int segundos){
        double resultado = (double) segundos / 60 / 60;
        System.out.printf("%d s = %.2f h%n",segundos,resultado);
    }

}

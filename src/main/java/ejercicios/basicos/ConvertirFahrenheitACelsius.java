package ejercicios.basicos;

public class ConvertirFahrenheitACelsius {
    private double grados;

    public ConvertirFahrenheitACelsius(double gradosFahrenheit){
        this.grados = gradosFahrenheit;
    }

    protected void calcular(){
        double resultado = (grados - 32) / 1.8;
        System.out.printf("%.1f °F = %.2f °C%n", grados, resultado);
    }
}

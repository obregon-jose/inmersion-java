package ejercicios.basicos;

public class ConvertirCelsiusAFahrenheit {
    private double grados;

    public ConvertirCelsiusAFahrenheit(double gradosCelsius){
        this.grados = gradosCelsius;
    }

    protected void calcular(){
        double resultado = (grados * 1.8) + 32;
        System.out.printf("%.1f °C = %.2f °F%n", grados, resultado);
    }
    
}

package ejercicios.basicos;

public class ConvertirGrados {

    void celsiusAFahrenheit(double gradosCelsius){
        double resultado = (gradosCelsius * 1.8) + 32;
        System.out.printf("%.1f °C = %.2f °F%n", gradosCelsius, resultado);
    }

    void fahrenheitACelsius(double gradosFahrenheit){
        double resultado = (gradosFahrenheit - 32) / 1.8;
        System.out.printf("%.1f °F = %.2f °C%n", gradosFahrenheit, resultado);
    }
}

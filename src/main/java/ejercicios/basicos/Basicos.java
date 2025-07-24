package ejercicios.basicos;

public class Basicos {

    private static void imprimirArea(String figura, double area) {
        System.out.printf("El area del %s es: %.2f%n", figura, area);
        // String formato = String.format("El area del %%s es: %%.%df%%n", decimales);
        // System.out.printf(formato, figura, area);
    }

    private static void imprimirCalculo(String operacion, double resultado) {
        System.out.printf("%s : %.2f%n", operacion, resultado);
    }

    public static void ejecutar() {

        System.out.println("Ejecutando ejercicios básicos...");
        Calculadora c = new Calculadora();
        imprimirCalculo("Suma", c.suma(5,2));
        imprimirCalculo("Resta", c.resta(5.1, 8.3));
        imprimirCalculo("Multiplicación", c.multiplicacion(7, 6.2));
        imprimirCalculo("División", c.division(-8.5,1));

        CalcularArea cA = new CalcularArea();
        imprimirArea("Cuadrado", cA.cuadrado(5));
        imprimirArea("Rectángulo", cA.rectangulo(5.1, 8.3));
        imprimirArea("Triangulo", cA.triangulo(7, 6.2));
        imprimirArea("Circulo", cA.circulo(-8.5));

        ValidarNumero vn = new ValidarNumero();
        System.out.println("Entero positivo: " + vn.enteroPositivo(1));
        System.out.println("Par: " + vn.esPar(2));
        System.out.println("Par: " + vn.esParBitwise(2));

        ConvertirGrados cG = new ConvertirGrados();
        cG.celsiusAFahrenheit(17);
        cG.fahrenheitACelsius(62.6);

        ConvertirTiempo cT = new ConvertirTiempo();
        cT.segundosAHoras(60);;

    }
}

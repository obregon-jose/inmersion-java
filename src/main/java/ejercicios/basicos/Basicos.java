package ejercicios.basicos;

public class Basicos {
    
    public static void ejecutar(){
        AreaCuadrado acc = new AreaCuadrado(5.5);
        acc.calcular();

        AreaRectangulo ar = new AreaRectangulo(5, 8);
        ar.calcular();

        AreaTriangulo at = new AreaTriangulo(7, 6);
        at.calcular();

        AreaCirculo ac = new AreaCirculo(8.5);
        ac.calcular();

        ConvertirCelsiusAFahrenheit cf = new ConvertirCelsiusAFahrenheit(17);
        cf.calcular();

        ConvertirFahrenheitACelsius fc = new ConvertirFahrenheitACelsius(62.6);
        fc.calcular();

        ConvertirSegundosAHoras sh = new ConvertirSegundosAHoras(60);
        sh.calcular();
        
    }
}

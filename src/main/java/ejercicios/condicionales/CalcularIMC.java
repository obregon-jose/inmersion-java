package ejercicios.condicionales;

public class CalcularIMC {
    private double peso;
    private double altura;

    private final double BAJO = 18.5; // < 18.5
    private final double NORMAL = 18.5; // 18.5 - 24.9 
    private final double SOBREPESO = 25; // 25 - 29.9
    private final double OBESO = 30; // > 30


    public CalcularIMC(double pesoKg, double alturaM){
        this.peso = pesoKg;
        this.altura = alturaM;
    }

    protected void calcular(){
        if (altura > 2.6) {
            System.out.println("Por favor revise la altura, debe tener fotmato en metros (Ej: 1.75)");
            return;
        }

        double resultado = peso / Math.pow(altura, 2);
        String estado = evaluarEstado(resultado);
        mostarResultado(resultado, estado);

    }

    private String evaluarEstado(double resultado){
        if (resultado < BAJO ) {
            return "Peso Bajo"; 
        } else if (resultado >= NORMAL && resultado < SOBREPESO) {
            return "Normal";
        } else if (resultado >= SOBREPESO && resultado < OBESO) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        } 
    }

    private void mostarResultado(double resultado, String estado){
        System.out.printf("IMC: %.1f - %s%n",resultado, estado); 
    }

    
}

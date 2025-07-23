package ejercicios.basicos;

public class AreaCirculo {
    private final double PI = 3.1416;
    private double radio;

    public AreaCirculo(double radio){
        this.radio = radio;
    }

    protected void calcular(){
        double area = PI * Math.pow(radio, 2);
        System.out.printf("El area del circulo es: %.2f%n", area);
        
    }
    
}

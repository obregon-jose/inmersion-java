package ejercicios.basicos;

public class AreaRectangulo {
    private double largo;
    private double ancho;


    public AreaRectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }

    protected void calcular(){
        double area = largo * ancho;
        System.out.println("El area del rectángulo es: " + area);
    }
    
}

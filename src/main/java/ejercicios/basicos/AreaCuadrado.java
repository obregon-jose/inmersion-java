package ejercicios.basicos;

public class AreaCuadrado {
    private double lado;

    public AreaCuadrado(double lado) {
        this.lado = lado;
    }
    
    protected void calcular(){
        double area = this.lado * this.lado;
        System.out.println("El area del cuadrado es: "+ area);
        
    }
}

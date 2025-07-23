package ejercicios.basicos;

public class AreaTriangulo {
    private double base;
    private double altura;

    public AreaTriangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    protected void calcular(){
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }
}

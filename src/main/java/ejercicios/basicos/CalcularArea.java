package ejercicios.basicos;

public class CalcularArea {

    double cuadrado(double lado) {
        return lado * lado;
    }

    double rectangulo(double largo, double ancho) {
        return largo * ancho;
    }

    double triangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    double circulo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

}

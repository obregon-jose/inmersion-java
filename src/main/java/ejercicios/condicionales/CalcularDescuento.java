package ejercicios.condicionales;

public class CalcularDescuento {
    private double precio;
    private int descuento;

    public CalcularDescuento(double precio, int porcentajeDescuento){
        this.precio = precio;
        this.descuento = porcentajeDescuento;
    }
    
    protected void calcular(){
        if (descuento < 1 || descuento > 100) {
            System.out.println("El descuento debe ser un numero entero entre 1 y 100");
            return;
        }

        double resultado = precio - ((precio * descuento)/100);
        System.out.printf("Precio final con %d%% de descuento es: $ %.2f%n", descuento, resultado);
    }
}

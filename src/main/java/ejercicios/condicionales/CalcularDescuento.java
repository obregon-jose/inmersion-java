package ejercicios.condicionales;

public class CalcularDescuento {
    
    void descuento(double precio, int porcentajeDescuento){
        if (porcentajeDescuento < 1 || porcentajeDescuento > 100) {
            System.out.println("El descuento debe ser un numero entero entre 1 y 100");
            return;
        }

        double resultado = precio - ((precio * porcentajeDescuento)/100);
        System.out.printf("Precio final con %d%% de descuento es: $ %.2f%n", porcentajeDescuento, resultado);
    }
}

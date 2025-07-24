package ejercicios.condicionales;

public class Condicionales {

    public static void ejecutar(){

        CalcularDescuento cd = new CalcularDescuento();
        cd.descuento(10, 1);

        CalcularIMC imc = new CalcularIMC();
        imc.imc(65, 1.70);

        ClasificarEdad ce = new ClasificarEdad();
        ce.clasificar(18);

        MayorDeTresNumeros nm = new MayorDeTresNumeros();
        nm.mayor(2, 2.1, 2);

    }
    
}

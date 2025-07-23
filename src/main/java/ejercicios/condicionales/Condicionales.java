package ejercicios.condicionales;

public class Condicionales {

    public static void ejecutar(){
        CalcularDescuento cd = new CalcularDescuento(10, 1);
        cd.calcular();

        CalcularIMC imc = new CalcularIMC(65, 1.70);
        imc.calcular();

        ClasificarEdad ce = new ClasificarEdad(18);
        ce.clasificar();

        MayorDeTresNumeros nm = new MayorDeTresNumeros(2, 2.1, 2);
        nm.comparar();

        ParOImpar p = new ParOImpar(3);
        // p.evaluarConModulo();
        p.evaluarConBit();


    }
    
}

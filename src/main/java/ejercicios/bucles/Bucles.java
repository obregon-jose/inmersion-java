package ejercicios.bucles;

public class Bucles {
    
    public static void ejecutar(){
        JuegoAdivinarNumero.jugar();

        NumeroPrimo p = new NumeroPrimo(29);
        p.esPrimo(); 

        NumerosPares par = new NumerosPares(new int[]{1,2,3,4,5,6,7,8});
        par.esPar();

        SerieFibonacci sf = new SerieFibonacci(10);
        // sf.serieRecursiva(); System.out.println("");
        sf.serieManual(); System.out.println("");

        TablaMultiplicar tm = new TablaMultiplicar(7);
        tm.generar();

        NumerosParesHastaN np = new NumerosParesHastaN(20);
        np.generar();
        
    }
}

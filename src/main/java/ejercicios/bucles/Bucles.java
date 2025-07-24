package ejercicios.bucles;

public class Bucles {
    
    public static void ejecutar(){
        JuegoAdivinarNumero.jugar();

        NumeroPrimo p = new NumeroPrimo();
        System.out.println("Es Primo: "+p.esPrimo(29));

        NumerosPares par = new NumerosPares();
        par.esPar(new int[]{1,2,3,4,5,6,7,8});

        SerieFibonacci sf = new SerieFibonacci();
        // sf.serieRecursiva(10); System.out.println("");
        sf.serieManual(10); System.out.println("");

        TablaMultiplicar tm = new TablaMultiplicar();
        tm.generarTabla(7);

        NumerosParesHastaN np = new NumerosParesHastaN();
        np.generarParesHastaN(20);
        
    }
}

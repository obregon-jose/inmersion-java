package ejercicios.condicionales;

public class ParOImpar {
    private int numero;

    public ParOImpar(int numero){
        this.numero = numero;
    }

    protected void evaluarConModulo(){
        String resultado = (numero % 2 == 0) ? "Par": "Impar";
        System.out.printf("El numero %d, es %s%n",numero, resultado);
    }

    protected void evaluarConBit(){
        String resultado = ((numero & 1) == 0) ? "Par": "Impar";
        System.out.printf("El numero %d, es %s%n",numero, resultado);
    }

    
}

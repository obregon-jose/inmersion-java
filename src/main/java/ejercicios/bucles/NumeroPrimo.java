package ejercicios.bucles;

public class NumeroPrimo {
    private int numero;

    public NumeroPrimo(int numero) {
        this.numero = numero;
    }

    private boolean evaluar() {
        if (numero <= 1)
            return false;
        if (numero == 2)
            return true; 
        if (numero % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    protected void esPrimo() {

        if (evaluar()) {
            System.out.printf("El %d es Primo%n", numero);
        } else {
            System.out.printf("El %d No es Primo%n", numero);
        }
    }

}

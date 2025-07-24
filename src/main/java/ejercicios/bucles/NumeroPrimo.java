package ejercicios.bucles;

public class NumeroPrimo {

    boolean esPrimo(int numero) {
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

}

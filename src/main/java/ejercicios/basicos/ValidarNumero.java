package ejercicios.basicos;

public class ValidarNumero {

    boolean esEntero(double numero) {
        return numero % 1 == 0;
    }

    boolean esPositivo(double numero) {
        return numero > 0;
    }

    boolean enteroPositivo(double numero) {
        return esEntero(numero) && esPositivo(numero);
    }

    boolean esPar(double numero){
        return numero % 2 == 0;
    }

    boolean esParBitwise (int numero){
        return (numero & 1) == 0 ;
    }
}

package ejercicios.bucles;

public class TablaMultiplicar {

    protected void generarTabla(int numero) {

        for (int i = 1; i <= 10; i++) {
            int res = (numero * i);
            System.out.printf("%d x %d = %d%n", numero, i, res);
        }

    }

}

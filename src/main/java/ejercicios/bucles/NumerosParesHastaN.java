package ejercicios.bucles;

public class NumerosParesHastaN {

    protected void generarParesHastaN(int n) {

        int cont = 1;
        while (cont <= n) {
            if ((cont & 1) == 0) {
                System.out.print(cont + ", ");
            }
            cont++;
        }

    }
}

package ejercicios.bucles;

public class TablaMultiplicar {
    int numeroMaximo = 10;
    int numero;

    public TablaMultiplicar(int tablaDel) {
        this.numero = tablaDel;
    }

    protected void generar() {

        for (int i = 1; i <= numeroMaximo; i++) {
            int res = (numero * i);
            System.out.printf("%d x %d = %d%n", numero, i, res);
        }

    }

}

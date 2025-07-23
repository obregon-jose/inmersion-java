package ejercicios.bucles;

public class NumerosPares {
    private int[] numero;

    public NumerosPares(int[] numero) {
        this.numero = numero;
    }

    protected void esPar() {

        for (int num : numero) {
            if ((num & 1) == 0) {
                System.out.println(num + " es Par");
            } else {
                System.out.println(num + " es Impar");
            }
        }

    }

}

package ejercicios.bucles;

public class NumerosPares {

    void esPar(int[] numero) {

        for (int num : numero) {
            if ((num & 1) == 0) {
                System.out.println(num + " es Par");
            } else {
                System.out.println(num + " es Impar");
            }
        }

    }

}

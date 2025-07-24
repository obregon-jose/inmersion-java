package ejercicios.bucles;

public class SerieFibonacci {

    void serieManual(int serie){
        int numero1 = 0, numero2 = 1;

        for(int i= 0; i < serie; i++ ){

            System.out.print(numero1 + " ");

            int siguiente  = numero1 + numero2;
            numero1 = numero2;
            numero2 = siguiente;
            
        }
    }
    
    void serieRecursiva(int serie){

        for (int i = 0; i < serie; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
   
    
}

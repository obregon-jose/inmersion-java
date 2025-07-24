package ejercicios.condicionales;

public class MayorDeTresNumeros {
    
    void mayor(double numero1, double numero2, double numero3){
        double mayor = numero1;
        
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor ) {
            mayor = numero3;
        }        

        System.out.println("El numero mayor es: "+ mayor);
    }
}

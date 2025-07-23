package ejercicios.condicionales;

public class MayorDeTresNumeros {
    private double numero1, numero2, numero3, mayor;


    public MayorDeTresNumeros(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }
    
    protected void comparar(){
        mayor = numero1;
        
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor ) {
            mayor = numero3;
        }        

        System.out.println("El numero mayor es: "+ mayor);
    }
}

import java.util.Scanner;
import java.util.stream.IntStream;

/*
    3)	Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se
    divide por 5, ya que el usuario agregó 5 números.
*/
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int[5];
        int mayor = 0;
        int menor = 0;


        for(int i=0; i < numeros.length; i++){
            System.out.print("Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
        }

        float promedio = (float) IntStream.of(numeros) //IntStream.of(numeros): Aquí se crea un flujo de enteros a partir del arreglo numeros. IntStream.of() es un método estático de la clase IntStream que toma una secuencia de valores enteros y crea un flujo.
                .average()// Este método calcula el promedio de todos los elementos del flujo
                .orElse(0.0);//Si el flujo está vacío y no hay elementos, el método average(), se devuelve el valor predeterminado 0.0

        System.out.println("El promedio es: " + promedio);
    }
}
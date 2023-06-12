import java.util.Scanner;

/*
    2)	Después de realizar el ejercicio anterior, agregar que muestre el número mayor
    y el número menor.
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

        //Mostrar el numero mayor y menor
        mayor = numeros[0];
        menor = numeros[0];
        for(int i = 1; i < numeros.length; i++){

//            if(numeros[i] > mayor){//Encontrar el mayor numero
//                mayor = numeros[i];
//            }
//
//            if(numeros[i] < menor ){ //Encontrar el menor numero
//                menor = numeros[i];
//            }

            mayor = Math.max(numeros[i], mayor);// Obtiene el valor máximo entre numeros[i] y mayor
            menor = Math.min(numeros[i], menor);// Obtiene el valor mínimo entre numeros[i] y menor

        }



        System.out.println("El Mayor es: "+ mayor);
        System.out.println("El Menor es: "+ menor);

    }
}
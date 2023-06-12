/*
   1)	Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int [] numeros = new int[5];

        int contador = 0;
        do{
            System.out.print("Ingrese un numero: ");
            numeros[contador] = entrada.nextInt();
            contador++; //incrementar el contador

        }while (contador < numeros.length);

        //Mostrar los 5 numeros
        contador = 0; //Se resetea el contador para recorrer el arreglo y mostrar los numeros
        System.out.println("Los números ingresados fueron: ");
        while (contador < numeros.length ){
            System.out.println(numeros[contador]);
            contador++; //incrementar el contador
        }

    }
}
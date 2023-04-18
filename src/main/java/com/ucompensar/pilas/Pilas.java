package com.ucompensar.pilas;

import java.util.Scanner;

/**
 * @author Neyris
 */
public class Pilas {

    public static void main(String[] args) {
        PrimeraPila pila1 = new PrimeraPila();
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int maximoVector = input.nextInt();
        System.out.println("Ingrese la cantidad de elementos a registrar");
        int cantElementos = input.nextInt();
        if (cantElementos <= maximoVector) {
            int[] vector = new int[maximoVector];
            pila1.generar(cantElementos, maximoVector, vector);
            pila1.imprimir(vector);
            pila1.mostrar();
        } else {
            System.out.println("El vector no puede ser menor que la cantidad de elementos a guardar");
        }
        System.out.println("Hello World!");
    }
}

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
            System.out.println("");
            
            // Prueba del método buscar
            System.out.println("Ingrese una posición para buscar en la pila:");
            int posicionBuscada = input.nextInt();
            int elementoEncontrado = pila1.buscar(vector, posicionBuscada);
            System.out.println("El elemento en la posición " + posicionBuscada + " es: " + elementoEncontrado);

            // Prueba del método insertar
            System.out.println("Ingrese un elemento para insertar en la pila:");
            int nuevoElemento = input.nextInt();
            pila1.insertar(nuevoElemento, vector);
            pila1.imprimir(vector);
            pila1.mostrar();

            // Prueba del método actualizar
            System.out.println("Ingrese una posición para actualizar en la pila:");
            int posicionActualizada = input.nextInt();
            System.out.println("Ingrese un nuevo elemento para la posición " + posicionActualizada + ":");
            int nuevoElementoActualizado = input.nextInt();
            pila1.actualizar(vector, posicionActualizada, nuevoElementoActualizado);
            pila1.imprimir(vector);
            pila1.mostrar();

            // Prueba del método eliminar
            pila1.eliminar(vector);
            pila1.imprimir(vector);
            pila1.mostrar();
        } else {
            System.out.println("El vector no puede ser menor que la cantidad de elementos a guardar");
        }
    }
}

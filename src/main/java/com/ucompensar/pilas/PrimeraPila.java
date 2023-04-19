package com.ucompensar.pilas;

/**
 * @author Neyris
 */
public class PrimeraPila {

    private int tope, maximo, npar = 0, nimpar = 0;

    public void generar(int cantElementos, int totalPila, int[] vector) {
        maximo = totalPila;
        for (int i = 1; i <= cantElementos; i++) {
            tope++;
            vector[tope] = (int) Math.floor(Math.random() * 100);
            if (vector[tope] % 2 == 0) {
                npar++;
            } else {
                nimpar++;
            }
        }
    }

    public void imprimir(int[] vector) {
        System.out.println("Los elementos de la pila son:");
        for (int i = 0; i < tope; i++) {
            System.out.println("Posición: " + i + " con valor: " + vector[i]);
        }
        System.out.println("El tope de la pila es " + tope + " " + "El maximo de la pila es " + maximo);
    }

    public void mostrar() {
        System.out.println("El número de elementos pares son: " + npar);
        System.out.println("El número de elementos impares son: " + nimpar);
    }

    public int buscar(int[] vector, int posicion) {
        int respuesta = -1;
        for (int i = 0; i < tope; i++) {
            if (i == posicion) {
                respuesta = vector[i];
                break;
            }
        }
        if (respuesta == -1) {
            System.out.println("Posición inválida");
        }
        return respuesta;
    }

    public void insertar(int elemento, int[] vector) {
        if (tope == vector.length - 1) {
            System.out.println("La pila llena, no se puede agregar el elemento");
        } else {
            tope++;
            vector[tope] = elemento;
            if (elemento % 2 == 0) {
                npar++;
            } else {
                nimpar++;
            }
        }
    }

    public void actualizar(int[] vector, int posicion, int nuevoElemento) {
        buscar(vector, posicion);
        vector[posicion] = nuevoElemento;
        System.out.println("Elemento actualizado exitosamente en la posición " + posicion);
    }

    public void eliminar(int[] vector) {
        if (tope == -1) {
            System.out.println("La pila está vacía, no se pueden eliminar elementos");
        } else {
            int elementoEliminado = vector[tope];
            System.out.println("Se ha eliminado el elemento de la pila");
            tope--;
            if (elementoEliminado % 2 == 0) {
                npar--;
            } else {
                nimpar--;
            }
        }
    }
}

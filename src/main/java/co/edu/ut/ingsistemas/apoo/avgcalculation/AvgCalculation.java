/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.apoo.avgcalculation;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Ejemplo de programación en vivo de la tutoría 2: programa que ordena un
 * listado de enteros, calcula la sumatoria y promedio; todo usando listas
 * enlazadas. Ejercicio 22.17 tomado de (Deitel & Deitel, 2011, pág. 872)
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class AvgCalculation {

    /**
     * RANDOM_NUMBER_UPPER_LIMIT - Límite superior para la generación de números
     * aleatorios.
     */
    private static final int RANDOM_NUMBER_UPPER_LIMIT = 100;

    /**
     * RANDOM_NUMBER_LOWER_LIMIT - Límite inferior para la generación de números
     * aleatorios.
     */
    private static final int RANDOM_NUMBER_LOWER_LIMIT = 0;

    /**
     * RANDOM_NUMBERS - Cantidad de números aleatorios a generar.
     */
    private static final int RANDOM_NUMBERS = 25;

    /**
     * Punto de entrada de ejecución del programa.
     * <b>Nota: por temas de simplicidad, este método está en la misma clase que
     * el modelo del mundo; Sin embargo, esto es una mala práctica de
     * programación. </b>
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 0. Inicializamos variables locales.
        int sum = 0;
        float avg = 0.0f;
        LinkedList<Integer> integers = new LinkedList<>();
        // 1. Generamos n números aleateario de i hasta j
        for (int i = 0; i < RANDOM_NUMBERS; i++) {
            int integer = (int) (RANDOM_NUMBER_LOWER_LIMIT + (Math.random() * RANDOM_NUMBER_UPPER_LIMIT));
            sum += integer;
            integers.add(integer);
        }
        // 2. Ordenamos la colección.
        Collections.sort(integers);
        // 3. Calculamos el promedio.
        avg = sum / RANDOM_NUMBERS;
        // 4. Mostramos los resultados.
        System.out.println("sorted numbers: " + integers);
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}

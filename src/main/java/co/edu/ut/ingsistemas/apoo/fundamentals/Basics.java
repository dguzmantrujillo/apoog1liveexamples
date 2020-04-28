/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.apoo.fundamentals;

import co.edu.ut.ingsistemas.apoo.priorityqueue.Person;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Ejemplo de Programación en Java: fundamentos.
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class Basics {

    //variables de instancia o atributos.
    private int attr1;

    // representa una variable global a todos los objetos de esta clase.
    private static int gAttr1;

    /**
     * Punto de entrada de ejecución del programa.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable locales: solo existen en el método.

        // 1. Primitivos
        //1.1 Enteros.
        //1.2 Punto flotante.
        //1.3 Carácter.
        //1.4 Boolean.
        int counter;
        counter = 1;
        // 2. variables locales objeto.
        //2.1 De caja o incorporado en Java.
        Integer i;
        String s;
        //2.3 Definidos por el desarrollador.
        Person p;

        // 3. Manipulando una variable global o variable de clase.
        gAttr1 = gAttr1 + 1; //++ es una abreviación de esta expresión.

        // Operadores aritméticos.
        int sum = 1 + 2;
        int subs = 3 - 1;
        int mult = 5 * 2;
        int div = 5 / 2;
        int mod = 5 % 2;
        float modf = 5 % 2; //1.0
        System.out.println("modf = " + modf);

        // Operadores lógicos.
        // ! negate
        // && and
        // || or
        boolean neg = !true;
        boolean and = true && false;
        boolean or = false || true;

        int age = 10;
        String adulthood;

        // 4. Estructura de control de decisión if else.
        if (age > 18) {
            adulthood = "adult";
        } else {
            adulthood = "minor";
        }

        // 5. Operador ternario.
        adulthood = (age > 18) ? "adult" : "minor";

        // 6. Salida por consola usando la salida estándar por error.
        System.err.print("Hola, mundo");
        System.err.println("Hola, mundo");

        // 7. Estructura de control bucle do while y entrada por consola.
        String inputFromConsole;
        do {
            Scanner scanner = new Scanner(System.in);
            inputFromConsole = scanner.nextLine();
        } while (!inputFromConsole.equals("exit"));

        System.out.println("inputFromConsole: " + inputFromConsole);

        // 8. Ejemplos de uso de la clase utilitaria JOptionPane.
        JOptionPane.showMessageDialog(null, "Hola, mundo"); // Diálogo de información.
        JOptionPane.showConfirmDialog(null, "Mensaje de confirmación"); // Diálogo de confirmación: Sí, no, Cancelar.
        String inputAge = JOptionPane.showInputDialog(null, "Ingresa la edad"); // Diálogo de entrada.
        JOptionPane.showMessageDialog(null, inputAge);
    }

    /**
     * Declaración de un método miembro de clase de ejemplo.
     */
    public static void m1() {
        //1. Un método de clase solo puede modificar las variables "globales", 
        // pero no las de instancia o atributos.
        gAttr1++;
    }

    /**
     * Declaración de un método miembro de objeto de ejemplo.
     */
    public void m2() {
        //1. Un método de instancia solo puede modificar los atributos.
        attr1 = 1;
        //2. Un método de clase también puede modificar las variables "globales".
        gAttr1++;
    }
}

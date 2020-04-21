package co.edu.ut.ingsistemas.apoo.priorityqueue;

import java.util.Date;
import java.util.PriorityQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ejemplo de programación en vivo de la tutoría 2: PriorityQueue (colas de
 * prioridad).
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class PriorityQueueMain {

    /**
     * Punto de entrada de ejecución del programa.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1. Creamos una cola de prioridad llamada people (Gente) y le pasamos nuestro comparador de edades personalizado.
        PriorityQueue<Person> people = new PriorityQueue<>(new AgePeopleCompartor());

        //2. Creamos tres objetos Person (Persona).
        Person p3 = new Person(2, "LUIS", "PEREZ", new Date(2017, 11, 23));
        Person p1 = new Person(0, "JUAN", "PEREZ", new Date(1969, 10, 13));
        Person p2 = new Person(1, "MARÍA", "PEREZ", new Date(1986, 03, 25));

        //3. Agregamos a la cola de prioridad, en orden arbitrario, las personas creadas.
        people.add(p3);
        people.add(p1);
        people.add(p2);

        //4. Obtenemos (sin retirar) de la cola de prioridad el elemento más prioritario: aquel con mayor edad.
        Person oldestPerson = people.element();

        //5. Se imprime por consola a la persona más vieja o de mayor edad.
        System.out.println("oldestPerson: " + oldestPerson);
    }
}

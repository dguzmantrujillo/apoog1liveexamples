package co.edu.ut.ingsistemas.apoo.priorityqueue;

import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Representa un comparador de edades de personas, en el ejemplo de programación
 * en vivo de la tutoría 2: PriorityQueue (colas de prioridad).
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class AgePeopleCompartor implements Comparator<Person> {

    /**
     * {@inheritDoc}
     */
    @Override
    public int compare(Person p1, Person p2) {
        long bdPerson1 = p1.getBirthDate().getTime(); // Se obtiene la edad en milisegundos de las Persona uno a comparar.
        long bdPerson2 = p2.getBirthDate().getTime(); // Se obtiene la edad en milisegundos de la Persona dos a comparar.
        // La edad con menor milisegundos es la mayor.
        if (bdPerson1 < bdPerson2) {
            return -1; //La mayor prioridad tiene la llave de menos valor, devolvemos -1.
        } else if (bdPerson1 == bdPerson2) {
            return 0; // Si son iguales, devolvemos 0.
        } else {
            return 1; // En caso contrario, devolvemos 1.
        }
    }
}

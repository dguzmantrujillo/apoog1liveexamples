package co.edu.ut.ingsistemas.apoo.priorityqueue;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Representa a un objeto Person (persona) del ejemplo de programación en vivo
 * de la tutoría 2: PriorityQueue (colas de prioridad).
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class Person {

    /**
     * *
     * id - Identificador.
     */
    private long id;

    /**
     * firstName - Primer nombre.
     */
    private String firstName;

    /**
     * lastName - Apellidos.
     */
    private String lastName;

    /**
     * birthDate - Fecha de nacimiento.
     */
    private Date birthDate; // Fecha de nacimiento es la llave para determinar la prioridad.

    /**
     * Inicializa una persona.
     */
    public Person() {
    }

    /**
     * Inicializa una persona.
     *
     * @param id Identificador.
     * @param firstName Primer nombre.
     * @param lastName Apellidos.
     * @param birthDate Fecha de nacimiento.
     */
    public Person(long id, String firstName, String lastName, Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    /*
    Getters and Setters.
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + '}';
    }
}

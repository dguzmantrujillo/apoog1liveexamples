/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.apoo.fundamentals;

/**
 * Lanzador o ejecutor del formulario de ejemplo BasicsForm
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class BasicsFormMain {

    /**
     * Punto de entrada de ejecución del programa.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea el formulario como si fuera un objeto común.
        BasicsForm basicsForm = new BasicsForm();
        // Se invoca este método para mostrar el formulario.
        basicsForm.setVisible(true);
    }
}

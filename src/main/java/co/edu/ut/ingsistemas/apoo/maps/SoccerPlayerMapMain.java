/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.apoo.maps;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 * Ejemplo de programación en vivo de la tutoría 2: Map (Mapa) en mapeo o
 * correlación entre número de camiseta / Jugador de fútbol.
 *
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class SoccerPlayerMapMain {

    /**
     * Punto de entrada de ejecución del programa.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1. Se crea un Map (Mapa) con el mapeo #camiseta / jugador.
        Map<Integer, String> barcaSoccerPlayers = new HashMap<>();

        //2. Se realiza el mapeo (Mapping) n° camiseta / Jugador(nombre).
        barcaSoccerPlayers.put(10, "Messi");
        barcaSoccerPlayers.put(3, "Piqué");
        barcaSoccerPlayers.put(9, "Suárez");

        /*3. Se llama a un díalogo de entrada, 
        para captura la entrada por UI y se almacena en una variable cadena de caracteres (String).
        JOptionPane es una clase que pone Java a disposición para crear elementos de interfáz gráfica
        de forma fácil.
         */
        String input = JOptionPane.showInputDialog("Ingrese el número de camiseta del jugador");
        //4. Se convierte la entrada en un Integer (entero).
        Integer tShitNumber = Integer.parseInt(input);
        //5. Se muestra por consola al jugador según su número de camiseta (Mapeo).
        System.out.println("Jugador con n° de camiseta: " + tShitNumber + " es: " + barcaSoccerPlayers.get(tShitNumber));
    }
}

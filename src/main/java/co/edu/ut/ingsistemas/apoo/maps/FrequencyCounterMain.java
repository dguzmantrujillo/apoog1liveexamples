/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.apoo.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejemplo de programación en vivo de la tutoría 2: Map (Mapa) en contador de
 * frecuencias. En este ejercicio, son nombres de un arreglo.
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class FrequencyCounterMain {

    /**
     * Punto de entrada de ejecución del programa.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1. Creamos un Map (Mapa) cuya llave serán los elementos a contar su frecuencia y el valor será el conteo en sí.
        Map<String, Integer> map = new HashMap<>();

        //2. Se crea un arreglo de elementos a contar su frecuencia.
        String[] names = {"pedro", "juan", "camilo", "juan", "fulanito", "sultanita"};

        //3. Se declara una variable local tipo Integer (entero) que va guardar el conteo temporal.
        Integer counter;

        //4. Se itera el arreglo -- a través del new for loop de Java-- para obtener los nombres a contar.
        //Nota: este loop se lee como: para cada name (Nombre) de tipo String dentro del arreglo names (Nombres), haga.
        for (String name : names) {
            //5. Se obtiene del mapa el elemento. Si es la primera vez, counter será null.
            counter = map.get(name);
            //6. Si counter es null, 
            if (counter == null) {
                counter = 1; //6.1 Es la primera vez que se encuentra el nombre.
            } else {
                counter++; //6.2 En caso contrario, se incrementa el contador (counter).
            }

            /*7. Se ingresa al mapa el nuevo valor según la llave (name). 
            Si ya existe el nombre, se reemplaza el valor (conteo) por el nuevo, 
            sino se ingresa al Map (Mapa) el nuevo valor y se asocia a la llave.*/
            map.put(name, counter);
        }

        // 8. Se imprime el Map (Mapa).
        System.out.println("map" + map);
    }
}

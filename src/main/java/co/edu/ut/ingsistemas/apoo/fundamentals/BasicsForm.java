/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.apoo.fundamentals;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * Representa un formulario de ejemplo.
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class BasicsForm extends JFrame {

    public BasicsForm() {
        this.setTitle("Una ventana de ejemplo");
        this.setSize(480, 240);
        this.add(new JLabel("Age: "));
        this.add(new JTextField("Enter the age"));
        this.setLayout(new GridLayout(1, 2));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

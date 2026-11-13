/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Edad de la madre cuando nació el hijo
        int edadMadre = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null, "Ingrese la edad actual de la madre:"));
        int edadHijo = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null, "Ingrese la edad actual del hijo:"));
        int edadAlParir = 0;
        edadAlParir = edadMadre - edadHijo;
        System.out.println("La madre tenía " + edadAlParir
                + " años cuando dio a luz.");
    }
}
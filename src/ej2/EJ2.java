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

    public static int leerEdad(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            if (entrada == null) {
                System.exit(0); // el usuario canceló
            }
            try {
                int edad = Integer.parseInt(entrada);
                if (edad >= 0) {
                    return edad;
                }
                JOptionPane.showMessageDialog(null, "La edad no puede ser negativa.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número entero.");
            }
        }
    }

    public static void main(String[] args) {
        int edadMadre = leerEdad("Ingrese la edad actual de la madre:");
        int edadHijo = leerEdad("Ingrese la edad actual del hijo:");

        while (edadHijo >= edadMadre) {
            JOptionPane.showMessageDialog(null,
                    "La edad del hijo debe ser menor que la de la madre.");
            edadHijo = leerEdad("Ingrese la edad actual del hijo:");
        }

        int edadAlParir = edadMadre - edadHijo;

        JOptionPane.showMessageDialog(null,
                "La madre tenía " + edadAlParir + " años cuando dio a luz.");
    }
}
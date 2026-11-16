/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;

public class EJ1 {

    public static double leerCalificacion(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            if (entrada == null) {
                System.exit(0); // el usuario canceló
            }
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número.");
            }
        }
    }

    public static void main(String[] args) {
        double nota1 = leerCalificacion("Ingrese la primera calificación:");
        double nota2 = leerCalificacion("Ingrese la segunda calificación:");
        double nota3 = leerCalificacion("Ingrese la tercera calificación:");

        double promedio = (nota1 + nota2 + nota3) / 3;

        JOptionPane.showMessageDialog(null,
                "El promedio es: " + String.format("%.2f", promedio));
    }
}
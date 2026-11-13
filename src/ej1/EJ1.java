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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Promedio de 3 calificaciones
        double nota1 = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Ingrese la primera calificación:"));
        double nota2 = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Ingrese la segunda calificación:"));
        double nota3 = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Ingrese la tercera calificación:"));
        double promedio = 0;
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio);
    }
}

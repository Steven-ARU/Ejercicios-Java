/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Área y perímetro de un rombo
        double diagonalMayor = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Ingrese la diagonal mayor:"));
        double diagonalMenor = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Ingrese la diagonal menor:"));
        double lado = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Ingrese el lado del rombo:"));
        double area = 0;
        double perimetro = 0;
        area = (diagonalMayor * diagonalMenor) / 2;
        perimetro = 4 * lado;
        System.out.println("El área del rombo es: " + area);
        System.out.println("El perímetro del rombo es: " + perimetro);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Área y perímetro de un círculo
        double radio = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Ingrese el radio del círculo:"));
        double area = 0;
        double perimetro = 0;
        area = Math.PI * radio * radio;
        perimetro = 2 * Math.PI * radio;
        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);
    }
}
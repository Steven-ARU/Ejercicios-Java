/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Conversión de pesos colombianos a dólares
        double pesos = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Ingrese la cantidad en pesos colombianos:"));
        double valorDolar = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Ingrese cuántos pesos vale 1 dólar:"));
        double dolares = 0;
        dolares = pesos / valorDolar;
        System.out.println(pesos + " pesos son " + dolares + " dólares");
    }
}
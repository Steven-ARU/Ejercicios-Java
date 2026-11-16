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

    public static double leerNumero(String mensaje, boolean debeSerMayorQueCero) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            if (entrada == null) {
                System.exit(0); // el usuario canceló
            }
            try {
                double valor = Double.parseDouble(entrada);
                if (!debeSerMayorQueCero || valor > 0) {
                    return valor;
                }
                JOptionPane.showMessageDialog(null, "El valor debe ser mayor que 0.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número.");
            }
        }
    }

    public static void main(String[] args) {
        double pesos = leerNumero("Ingrese la cantidad en pesos colombianos:", false);
        double valorDolar = leerNumero("Ingrese cuántos pesos vale 1 dólar:", true);

        double dolares = pesos / valorDolar;

        JOptionPane.showMessageDialog(null,
                String.format("%.2f", pesos) + " pesos son "
                + String.format("%.2f", dolares) + " dólares.");
    }
}
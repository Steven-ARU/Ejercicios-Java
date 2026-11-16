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

    public static double leerRadio(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            if (entrada == null) {
                System.exit(0); // el usuario canceló
            }
            try {
                double valor = Double.parseDouble(entrada);
                if (valor > 0) {
                    return valor;
                }
                JOptionPane.showMessageDialog(null, "El radio debe ser mayor que 0.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número.");
            }
        }
    }

    public static void main(String[] args) {
        double radio = leerRadio("Ingrese el radio del círculo:");

        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        JOptionPane.showMessageDialog(null,
                "El área del círculo es: " + String.format("%.2f", area) + "\n"
                + "El perímetro del círculo es: " + String.format("%.2f", perimetro));
    }
}
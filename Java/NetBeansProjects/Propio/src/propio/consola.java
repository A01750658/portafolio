/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propio;

import javax.swing.JOptionPane;

/**
 *
 * @author ikerf
 */
public class consola {

    public static void main(String[] args) {
        Calculadora consola = new Calculadora();
        consola.llenarArreglo();

        int operar = Integer.parseInt(JOptionPane.showInputDialog("¿Qué operación desea realizar?\nMultiplicar = 1 \nDividir = 2 \n Sumar = 3 \nRestar = 4"));
        switch (operar) {
            case 1:
                consola.multiplicar();
                break;
            case 2:
                consola.dividir();
                break;
            case 3:
                consola.suma();
                break;
            case 4:
                consola.resta();
                break;
            default:
                break;
        }
        consola.operandocompleto();

    }

}

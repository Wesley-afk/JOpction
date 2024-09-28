/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

import javax.swing.JOptionPane;

/**
 *
 * @author w.rocha
 */
public class Mavenproject7 {

    public static void main(String[] args) {
        float nota1 = 0;
        float nota2 = 0;
        float media = 0;

        // Pega a primeira nota através de uma caixa de diálogo
        String inputNota1 = JOptionPane.showInputDialog("Entre com a nota 1:");
        nota1 = Float.parseFloat(inputNota1);  // Converte a string recebida para float
        
        // Pega a segunda nota através de uma caixa de diálogo
        try{ 
        String inputNota2 = JOptionPane.showInputDialog("Entre com a nota 2:");
        nota2 = Float.parseFloat(inputNota2);  // Converte a string recebida para float
        } 
        catch(NumberFormatException e){
            e.getMessage();
        }
        // Calcula a média das notas
        media = (nota1 + nota2) / 2;

        // Exibe o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }
}

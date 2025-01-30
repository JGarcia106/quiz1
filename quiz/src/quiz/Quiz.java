/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;

import javax.swing.JOptionPane;



/**
 *
 * @author Laboratorio
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pregunta;
        int salario;
        double salarioConSem = 0.0;
        double salarioConIvm = 0.0;
        int salarioConBono = 0;
        double salarioFinal = 0.0;

        pregunta = JOptionPane.showInputDialog("Digite su salario: ");
        salario = Integer.parseInt(pregunta);
        
        salarioConSem = salario*0.0925;
        salarioConIvm = salario*0.0508;
        salarioFinal = salarioConSem + salarioConIvm;
        
        JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS el monto de: "+salarioFinal);
    }

}








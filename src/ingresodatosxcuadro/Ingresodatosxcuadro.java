/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresodatosxcuadro;

import javax.swing.JOptionPane;
/**
 *
 * @author conizunino
 */
public class Ingresodatosxcuadro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        JOptionPane.showMessageDialog(null,"Bienvenido");
        
        String nombre = JOptionPane.showInputDialog("Nombre");
        String dia = JOptionPane.showInputDialog("Dia de nacimiento");
        String mes = JOptionPane.showInputDialog("Mes de nacimiento");
        String año = JOptionPane.showInputDialog("Año de nacimiento");
        
        String curso = JOptionPane.showInputDialog("Nombre del curso");
        
        int diaparseo = Integer.parseInt(dia);
        int mesparseo = Integer.parseInt(mes);
        int añoparseo = Integer.parseInt(año);
        
        JOptionPane.showMessageDialog(null, "Nombre: "+nombre);
        JOptionPane.showMessageDialog(null,"Fecha de nacimiento: "+diaparseo+"/"+mesparseo+"/"+añoparseo);
        JOptionPane.showMessageDialog(null,"Curso: "+curso);
        
    }
    
}

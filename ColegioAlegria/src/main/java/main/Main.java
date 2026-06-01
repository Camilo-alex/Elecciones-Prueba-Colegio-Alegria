package main;

import controlador.ControladorEstudiante;
import java.util.ArrayList;
import modelo.Estudiante;
import vista.JFEstudiante;

public class Main {
    
    public static void main (String[]args){
        
        ArrayList <Estudiante> listaEstudiante = new ArrayList<>();
        
        JFEstudiante frmEstudiante = new JFEstudiante ();
        frmEstudiante.setVisible(true);
        ControladorEstudiante ctrlEstudiante = new ControladorEstudiante(frmEstudiante, listaEstudiante);
        
    }
    
}

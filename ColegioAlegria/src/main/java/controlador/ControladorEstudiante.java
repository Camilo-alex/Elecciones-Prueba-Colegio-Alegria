package controlador;

import com.sun.source.tree.IfTree;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Estudiante;
import vista.JFEstudiante;

public class ControladorEstudiante implements ActionListener {

    private JFEstudiante frmEstudiante;
    private ArrayList<Estudiante> listaEstudiante;

    public ControladorEstudiante(JFEstudiante frmEstudiante, ArrayList<Estudiante> listaEstudiante) {

        this.frmEstudiante = frmEstudiante;
        this.listaEstudiante = listaEstudiante;

        this.frmEstudiante.btnGuardar.addActionListener(this);
        this.frmEstudiante.btnEliminar.addActionListener(this);
        this.frmEstudiante.btnLimpiar.addActionListener(this);
        this.frmEstudiante.btnMostrar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == frmEstudiante.btnGuardar) {
            guardarEstudiante();
        }
        if (e.getSource() == frmEstudiante.btnLimpiar) {
            limpiarCampos();
        }
        if (e.getSource() == frmEstudiante.btnEliminar) {
            eliminarCampos();
        }
        if (e.getSource() == frmEstudiante.btnMostrar) {
            mostrarEstudiantes();
        }

    }

    private void guardarEstudiante() {

        String codigo = frmEstudiante.txtCodigo.getText();
        String nombre = frmEstudiante.txtNombre.getText();
        String apellido = frmEstudiante.txtApellido.getText();
        String grado = frmEstudiante.txtGrado.getText();
        String grupo = frmEstudiante.txtGrupo.getText();
        
        if (codigo.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || grado.isEmpty() || grupo.isEmpty()) {
            this.frmEstudiante.AreaResults.setText("Bobo hijueputa existe algo vacio menor.");
            return;
        }
        
        for (Estudiante e : listaEstudiante) {
            if (e.getCodigo().equals(codigo)) {
                this.frmEstudiante.AreaResults.setText("Menor, ese pelao ya existe aqui.");
            }
        }
        Estudiante estudiante = new Estudiante(codigo, nombre, apellido, grado, grupo);
        
        listaEstudiante.add(estudiante);
        
        this.frmEstudiante.AreaResults.setText("Se acaba de guardar a ese pelao, good boy");
        
        System.out.println("====LISTA DE PERSONAS====");
        for (Estudiante e : listaEstudiante) {
            System.out.println("Codigo: " + e.getCodigo());
            System.out.println("Nombres: " + e.getNombre());
            System.out.println("Apellidos: " + e.getApellido());
            System.out.println("Grado: " + e.getGrado());
            System.out.println("Grupo: " + e.getGrupo());
        }
        
        limpiarCampos();
        
        
    }
    
    public void limpiarCampos(){
        frmEstudiante.txtCodigo.setText("");
        frmEstudiante.txtNombre.setText("");
        frmEstudiante.txtApellido.setText("");
        frmEstudiante.txtGrado.setText("");
        frmEstudiante.txtGrupo.setText("");
    }
    
    public void eliminarCampos(){
        
        String codigo = frmEstudiante.txtCodigo.getText();
        
        if (codigo.isEmpty()) {
            this.frmEstudiante.AreaResults.setText("Digite el codigo del estudiante a eliminar.");
            return;
        }
        
        Estudiante personaEliminar = null;
        
        for (Estudiante e : listaEstudiante) {
            if ((e.getCodigo()).equals(codigo)) {
                personaEliminar = e;
                break;
            }
        }
        if (personaEliminar == null) {
            this.frmEstudiante.AreaResults.setText("No exite estudiante con este codigo.");
            return;
        }
        
        listaEstudiante.remove(personaEliminar);
        this.frmEstudiante.AreaResults.setText("Se elimino correctamente el estudiante.");
        limpiarCampos();
    }
    
    public void mostrarEstudiantes(){
        if (listaEstudiante.isEmpty()) {
            
        }
        
        StringBuilder sb = new StringBuilder();
        for (Estudiante e : listaEstudiante) {
                sb.append("Codigo: ").append(e.getCodigo()).append("\n");
                sb.append("Nombre: ").append(e.getNombre()).append("\n");
                sb.append("Apellido: ").append(e.getApellido()).append("\n");
                sb.append("Grado: ").append(e.getGrado()).append("\n");
                sb.append("Grupo: ").append(e.getGrupo()).append("\n");
            }
        
        this.frmEstudiante.AreaResults.setText(sb.toString());
            
    }

}

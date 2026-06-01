package modelo;

public class Estudiante {
    
    private String codigo;
    private String nombre;
    private String apellido;
    private String grado;
    private String grupo;

    public Estudiante(String codigo, String nombre, String apellido, String grado, String grupo) {
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.grupo = grupo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
}

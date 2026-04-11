public class Animal {
    public int identificacion;
    public String nombre;
    public String genero;
    public int edad;
    public String cualidades;

    public void mostrarInformacion() {
        System.out.println("ID: " + identificacion + ", Nombre: " + nombre + ", Genero: " + genero + ", Edad: " + edad + ", Cualidades: " + cualidades);
    }
}
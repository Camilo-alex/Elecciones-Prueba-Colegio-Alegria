public class Candidato {
    public String nombre;
    public String apellido;
    public int grado;
    public String grupo;
    public String lema;
    public int numeroTarjeton;
    public int votos;

    public void recibirVoto() {
        votos++;
    }

    public int obtenerVotos() {
        return votos;
    }
}
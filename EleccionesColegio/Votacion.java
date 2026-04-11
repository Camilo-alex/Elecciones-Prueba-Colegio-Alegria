public class Votacion {
    public int votosNulos;
    public int votosBlancos;
    public Candidato candidato1;
    public Candidato candidato2;
    public Candidato candidato3;

    public void registrarVoto(Candidato c) {
        c.recibirVoto();
    }

    public void registrarVotoBlanco() {
        votosBlancos++;
    }

    public CandidatoPersonero obtenerGanadorPersonero() {
        CandidatoPersonero ganador = null;
        int maxVotos = -1;
        if (candidato1 instanceof CandidatoPersonero && candidato1.votos > maxVotos) {
            maxVotos = candidato1.votos;
            ganador = (CandidatoPersonero) candidato1;
        }
        if (candidato2 instanceof CandidatoPersonero && candidato2.votos > maxVotos) {
            maxVotos = candidato2.votos;
            ganador = (CandidatoPersonero) candidato2;
        }
        if (candidato3 instanceof CandidatoPersonero && candidato3.votos > maxVotos) {
            maxVotos = candidato3.votos;
            ganador = (CandidatoPersonero) candidato3;
        }
        return ganador;
    }

    public CandidatoPersonero obtenerMenorVotacionPersonero() {
        CandidatoPersonero menor = null;
        int minVotos = Integer.MAX_VALUE;
        if (candidato1 instanceof CandidatoPersonero && candidato1.votos < minVotos) {
            minVotos = candidato1.votos;
            menor = (CandidatoPersonero) candidato1;
        }
        if (candidato2 instanceof CandidatoPersonero && candidato2.votos < minVotos) {
            minVotos = candidato2.votos;
            menor = (CandidatoPersonero) candidato2;
        }
        if (candidato3 instanceof CandidatoPersonero && candidato3.votos < minVotos) {
            minVotos = candidato3.votos;
            menor = (CandidatoPersonero) candidato3;
        }
        return menor;
    }

    public int calcularPoblacionElectoral() {
        int total = votosNulos + votosBlancos;
        if (candidato1 != null) total += candidato1.votos;
        if (candidato2 != null) total += candidato2.votos;
        if (candidato3 != null) total += candidato3.votos;
        return total;
    }
}
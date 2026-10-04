package unal.residencias;

// Guardamos la información básica que nos pide la guía para cada estudiante[span_17](start_span)[span_17](end_span)
public class Estudiante {
    private String id;
    private String nombreCompleto;
    private double puntajeSocioeconomico;
    private boolean asignadoResidencia;

    public Estudiante(String id, String nombreCompleto, double puntajeSocioeconomico) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.puntajeSocioeconomico = puntajeSocioeconomico;
        this.asignadoResidencia = false;
    }

    public String getId() { return id; }
    public String getNombreCompleto() { return nombreCompleto; }
    public double getPuntajeSocioeconomico() { return puntajeSocioeconomico; }
    public boolean isAsignadoResidencia() { return asignadoResidencia; }

    public void setPuntajeSocioeconomico(double puntajeSocioeconomico) {
        this.puntajeSocioeconomico = puntajeSocioeconomico;
    }

    public void setAsignadoResidencia(boolean asignadoResidencia) {
        this.asignadoResidencia = asignadoResidencia;
    }

    @Override
    public String toString() {
        return String.format("ID: %-8s | Nombre: %-25s | Puntaje: %6.2f | Residencia: %s",
                id, nombreCompleto, puntajeSocioeconomico, (asignadoResidencia ? "SI" : "NO"));
    }
}

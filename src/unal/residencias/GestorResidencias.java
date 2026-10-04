package unal.residencias;

import unal.residencias.estructuras.ArbolBinarioBusqueda;

// El gestor conecta las funciones que pide el problema (RF1 al RF8) con nuestro árbol[span_18](start_span)[span_18](end_span)[span_19](start_span)[span_19](end_span).
public class GestorResidencias {
    private int cuposDisponibles;
    private ArbolBinarioBusqueda arbolEstudiantes; // Nuestro árbol binario[span_20](start_span)[span_20](end_span)[span_21](start_span)[span_21](end_span)

    public GestorResidencias() {
        this.cuposDisponibles = 0;
        this.arbolEstudiantes = new ArbolBinarioBusqueda();
    }

    // RF1: Asignar número de cupos[span_22](start_span)[span_22](end_span)
    public void configurarCupos(int cupos) {
        this.cuposDisponibles = cupos;
    }

    public int getCuposDisponibles() {
        return cuposDisponibles;
    }

    // RF2: Registrar un nuevo estudiante[span_23](start_span)[span_23](end_span)
    public boolean registrarEstudiante(String id, String nombre, double puntaje) {
        if (consultarPorId(id) != null) {
            return false; // Si ya existe el ID, no lo registra
        }
        Estudiante nuevo = new Estudiante(id, nombre, puntaje);
        arbolEstudiantes.insertar(nuevo);
        return true;
    }

    // RF3: Buscar un estudiante por ID[span_24](start_span)[span_24](end_span)
    public Estudiante consultarPorId(String id) {
        return arbolEstudiantes.buscarPorId(id);
    }

    // RF4: Mostrar estudiantes por orden de puntaje[span_25](start_span)[span_25](end_span)
    public void listarEstudiantesPorPuntaje() {
        arbolEstudiantes.listarEnOrden();
    }

    // RF5 y RF6: Asignar cupos a los de menor puntaje[span_26](start_span)[span_26](end_span)
    public void asignarCupos() {
        // TODO: En la Entrega 2 recorreremos el AVL para dar los cupos a los primeros N nodos de la izquierda[span_27](start_span)[span_27](end_span)[span_28](start_span)[span_28](end_span)
    }

    // RF7: Modificar el puntaje de un estudiante[span_29](start_span)[span_29](end_span)
    public boolean modificarPuntaje(String id, double nuevoPuntaje) {
        Estudiante est = consultarPorId(id);
        if (est != null) {
            // TODO: En la Entrega 2 toca borrar el nodo viejo y volver a meterlo al árbol para acomodarlo bien[span_30](start_span)[span_30](end_span)[span_31](start_span)[span_31](end_span)
            est.setPuntajeSocioeconomico(nuevoPuntaje);
            return true;
        }
        return false;
    }

    // RF8: Eliminar a un estudiante[span_32](start_span)[span_32](end_span)
    public boolean eliminarEstudiante(String id) {
        // TODO: En la Entrega 2 programaremos el borrado de nodos en el árbol[span_33](start_span)[span_33](end_span)[span_34](start_span)[span_34](end_span)
        return false;
    }
}

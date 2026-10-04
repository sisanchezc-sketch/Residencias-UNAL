package unal.residencias.estructuras;

import unal.residencias.Estudiante;

// Un nodo sencillo para nuestro árbol binario hecho desde cero[span_0](start_span)[span_0](end_span).
// Cada nodo guarda los datos de un estudiante y sus dos conexiones (hijo izquierdo e hijo derecho)[span_1](start_span)[span_1](end_span)[span_2](start_span)[span_2](end_span).
public class NodoArbol {
    public Estudiante estudiante;
    public NodoArbol izquierdo;
    public NodoArbol derecho;

    public NodoArbol(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.izquierdo = null;
        this.derecho = null;
    }
}
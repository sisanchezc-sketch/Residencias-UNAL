package unal.residencias.estructuras;

import unal.residencias.Estudiante;

// Nuestro Árbol Binario de Búsqueda básico hecho a mano[span_3](start_span)[span_3](end_span).
// Acomodamos a los estudiantes según su puntaje socioeconómico:
// Los de menor puntaje van a la izquierda (porque son los que tienen mayor prioridad de residencia)[span_4](start_span)[span_4](end_span)[span_5](start_span)[span_5](end_span).
//
// Ojo: Para la Entrega 2 convertiremos este árbol en un AVL para que se balancee solo[span_6](start_span)[span_6](end_span)[span_7](start_span)[span_7](end_span).
public class ArbolBinarioBusqueda {
    private NodoArbol raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    // Insertar un estudiante en el árbol
    public void insertar(Estudiante estudiante) {
        raiz = insertarRecursivo(raiz, estudiante);
    }

    private NodoArbol insertarRecursivo(NodoArbol actual, Estudiante estudiante) {
        // Si el punto del árbol está libre, creamos el nodo ahí
        if (actual == null) {
            return new NodoArbol(estudiante);
        }

        // Si tiene menor puntaje socioeconómico, va para la izquierda[span_8](start_span)[span_8](end_span)[span_9](start_span)[span_9](end_span)
        if (estudiante.getPuntajeSocioeconomico() < actual.estudiante.getPuntajeSocioeconomico()) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, estudiante);
        } else { // Si es mayor o igual, va para la derecha
            actual.derecho = insertarRecursivo(actual.derecho, estudiante);
        }

        return actual;
    }

    // Recorrido In-Order para imprimir la lista en orden de menor a mayor puntaje[span_10](start_span)[span_10](end_span)[span_11](start_span)[span_11](end_span)
    public void listarEnOrden() {
        listarEnOrdenRecursivo(raiz);
    }

    private void listarEnOrdenRecursivo(NodoArbol nodo) {
        if (nodo != null) {
            listarEnOrdenRecursivo(nodo.izquierdo);
            System.out.println(nodo.estudiante);
            listarEnOrdenRecursivo(nodo.derecho);
        }
    }

    // Buscar a un estudiante con su ID recorriendo los nodos[span_12](start_span)[span_12](end_span)[span_13](start_span)[span_13](end_span)
    // (En la Entrega 3 vamos a cambiar esta búsqueda por una Tabla Hash para encontrarlo directo)[span_14](start_span)[span_14](end_span)[span_15](start_span)[span_15](end_span)[span_16](start_span)[span_16](end_span)
    public Estudiante buscarPorId(String id) {
        return buscarPorIdRecursivo(raiz, id);
    }

    private Estudiante buscarPorIdRecursivo(NodoArbol nodo, String id) {
        if (nodo == null) {
            return null; // No lo encontró
        }
        if (nodo.estudiante.getId().equals(id)) {
            return nodo.estudiante; // ¡Lo encontró!
        }
        
        // Buscamos primero en el lado izquierdo
        Estudiante encontradoIzquierda = buscarPorIdRecursivo(nodo.izquierdo, id);
        if (encontradoIzquierda != null) {
            return encontradoIzquierda;
        }
        
        // Si no estaba allá, buscamos por el lado derecho
        return buscarPorIdRecursivo(nodo.derecho, id);
    }
}

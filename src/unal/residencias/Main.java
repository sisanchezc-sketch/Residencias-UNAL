package unal.residencias;

// Clase principal para probar el código en la consola para la Entrega 1[span_35](start_span)[span_35](end_span)[span_36](start_span)[span_36](end_span)
public class Main {
    public static void main(String[] args) {
        GestorResidencias gestor = new GestorResidencias();

        System.out.println("==========================================================");
        System.out.println("  SISTEMA RESIDENCIAS UNAL - PROTOTIPO INICIAL (ENTREGA 1)");
        System.out.println("==========================================================\n");

        gestor.configurarCupos(2);
        
        // Metemos unos datos de prueba al árbol binario
        gestor.registrarEstudiante("1001", "Julián Díaz", 15.5);
        gestor.registrarEstudiante("1002", "Amir Narvaez", 8.2);
        gestor.registrarEstudiante("1003", "Simón Alzate", 12.0);

        System.out.println("1. Lista de estudiantes en el árbol (ordenados por puntaje):");
        gestor.listarEstudiantesPorPuntaje();

        System.out.println("\n2. Probando la búsqueda por ID (1002):");
        System.out.println(gestor.consultarPorId("1002"));
    }
}

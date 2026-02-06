import java.util.Iterator;
import java.util.List;

/**
 * Clase con un metodo para calcular una media
 */
public class CalcularMedia {
    /**
     * Metodo static que devuelve un double
     * @param alumnos --> recibe por parámetro el List alumnos creado en el metodo parsearFichero
     * @return
     */
    public static double calcularMedia(List<Estudiante> alumnos){
        double media = 0;
        // Recorre cada estudiante de la lista y suma sus notas
        for (Estudiante estudiante : alumnos) {
            media += estudiante.getNota();
        }

        // Divide la suma entre el número de estudiantes
        return media / alumnos.size();
    }
}

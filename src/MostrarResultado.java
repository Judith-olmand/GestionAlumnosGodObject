import java.util.List;

/**
 * Clase con un metodo para mostrar el resultado de la media
 */
public class MostrarResultado {
    /**
     * Metodo static que no devuelve nada (void)
     * @param alumnos --> recibe por parámetro el List alumnos
     */
    public static void mostrarResultado(List<Estudiante> alumnos) {
        /**
         * Invoca el metodo calcularMedia y muestra por pantalla el resultado
         */
        System.out.printf("Media: %.2f\n", CalcularMedia.calcularMedia(alumnos));
    }
}

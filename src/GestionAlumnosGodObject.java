import java.util.List;

public class GestionAlumnosGodObject  {
    /**
     * Invoco los metodos para leerFichero, parsearFichero
     * y mostrarResultado, que este a su vez invocara al metodo calcularMedia
     * @param args
     */
	public static void main(String[] args) {
        /**
         * Invoco a los metodos de cada clase.
         * Los que devuelven un List necesitan tener delante
         * List<EL-TIPO> nombre = clase.metodo(parametro que se pasa)
         */
        List<String> lineas = LeerFichero.leerFichero("../alumnos.txt");

        List<Estudiante> alumnos = ParsearFichero.parsearFichero(lineas);

        /**
         * Los que no devuelven nada se invocan con
         * clase.metodo(parametro)
         */
        MostrarResultado.mostrarResultado(alumnos);

    }
}
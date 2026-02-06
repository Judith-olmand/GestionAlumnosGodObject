import java.util.ArrayList;
import java.util.List;

/**
 * Clase con un metodo que pasa la lista que genera el metodo leerFichero
 * a una lista de objetos de la clase Estudiante con sus correspondientes atributos
 */
public class ParsearFichero {
    /**
     * Metodo estatico que devuelve un List de Estudiantes
     * @param lineas --> recibe por parámetro la List lineas del metodo leerFichero
     * @return
     */
    public static List<Estudiante> parsearFichero(List<String> lineas) {
        List<Estudiante> alumnos = new ArrayList<>();

        /**
         * Recorre la coleccion y va cortando por el ;
         * Almacena cada "trozo" en un array de String
         */
        for (String linea : lineas) {
            String[] lineaSplit = linea.split(";");
            /**
             * Si la linea cortada contiene 2 "trozos"
             */
            if (lineaSplit.length == 2) {
                try {
                    //El primer "trozo" (indice 0) es el nombre del estudiante
                    //trim() elimina espacios en blanco al principio y al final
                    String nombre = lineaSplit[0].trim();
                    //El segundo (indice 1) se pasa a double usando parseDouble(), que es la nota
                    double nota = Double.parseDouble(lineaSplit[1].trim());
                    //Crea un nuevo objeto Estudiante con el nombre y la nota
                    Estudiante estudiante = new Estudiante(nombre, nota);
                    //Añade el estudiante a la lista alumnos
                    alumnos.add(estudiante);
                } catch (NumberFormatException e) {
                    System.out.println("Error al parsear la nota en la línea: " + linea);
                }
            } else {
                System.out.println("Formato incorrecto en la línea: " + linea);
            }
        }
        return alumnos;
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase con un metodo que lee un fichero
 */
public class LeerFichero {
    /**
     * Metodo estatico que devuelve un List de String
     * @param rutaFichero --> recibe por parámetro la ruta del fichero
     * @return
     */
    public static List<String> leerFichero(String rutaFichero) {
        List<String> lineas = new ArrayList<>();

        /**
         * Intenta leer el fichero
         */
        try(BufferedReader reader = new BufferedReader(new FileReader(rutaFichero))) {
            String linea;

            /**
             * Almacena cada línea del fichero en la variable
             * y despues la añade a la lista
             */
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }

        } catch(IOException e){
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }

        /**
         * Devuelve la List
         */
        return lineas;
    }
}

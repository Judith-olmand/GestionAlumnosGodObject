- BC3- COLECCIONES, FICHEROS Y ENTRADA/SALIDA
- Gestión de Alumnos (Modular)
Sistema de procesamiento de datos que aplica el principio de Responsabilidad Única, dividiendo la lógica de lectura, procesamiento y cálculo en clases independientes.

🚀 Funcionalidades
- Lectura de Ficheros: Importa datos externos desde un archivo .txt de forma robusta.
- Parseo Automático: Transforma líneas de texto plano en objetos de la clase Estudiante.
- Cálculo Estadístico: Procesa las notas de los alumnos para obtener el promedio general.
- Validación de Datos: Maneja errores de formato y excepciones de lectura para evitar cierres inesperados.

🛠️ Estructura del Proyecto
El código se divide en módulos especializados:
- LeerFichero: Gestión de entrada/salida (I/O).
- ParsearFichero: Lógica de conversión de datos.
- CalcularMedia: Motor de cálculos matemáticos.
- MostrarResultado: Capa de presentación por consola.

import java.io.File;
import java.io.IOException;

public class OperacionFicheiro {

    /**
     * 1. Método para comprobar que la ruta especificada es un directorio
     * @param cadea
     * @return String con el resultado
     */
    public String eDirectorio (String cadea) {
        File file = new File(cadea);

        if (file.isDirectory()){
            return "É un directorio";
        } else {
            return "Non é un directorio";
        }
    }

    /**
     * 2. Método para comprobar que la ruta especificada es un fichero
     * @param cadea
     * @return String con el resultado
     */
    public String eFicheiro (String cadea) {
        File file = new File(cadea);

        if (file.isFile()){
            return "É un ficheiro";
        } else {
            return "Non é un ficheiro";
        }
    }

    /**
     * 3. Método para crear un directorio en la ruta especificada
     * @param cadea
     */
    public void creaDirectorio (String cadea) {
        File file = new File(cadea);

        if (!file.exists()){
            file.mkdir();
        } else {
            System.out.println("O directorio xa existe");
        }
    }

    /**
     * 4. Método para crear un fichero en la ruta especificada
     * @param dirName
     * @param fileName
     */
    public void creaFicheiro (String dirName, String fileName) {
        File dir = new File(dirName);
        if (dir.exists()) {
            File file = new File(dirName, fileName);
            try {
                if (file.createNewFile()) {
                    System.out.println("Ficheiro creado");
                } else {
                    System.out.println("O ficheiro xa existe");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("A ruta non existe");
        }
    }

    /**
     * 5. Método para comprobar el modo de acceso a un fichero
     * @param dirName
     * @param fileName
     * @return String con el resultado
     */
    public String modoAcceso (String dirName, String fileName) {
        File file = new File(dirName, fileName);
        String mensaxe = "";

        if (file.canRead()){
            mensaxe += "Lectura si";
        } else {
            mensaxe += "Lecturar non";
        }

        if (file.canWrite()) {
            mensaxe += ", escritura si";
        } else {
            mensaxe += ", escritura non";
        }

        return mensaxe;
    }

    /**
     * 6. Método para calcular la longitud de un fichero
     * @param dirName
     * @param fileName
     * @return Longitud del fichero
     */
    public Long calculaLonxitude (String dirName, String fileName) {
        File file = new File(dirName, fileName);
        return file.length();
    }

    /**
     * 7. Método para cambiar el modo de acceso a un fichero a solo lectura
     * @param dirName
     * @param fileName
     */
    public void mLectura (String dirName, String fileName) {
        File file = new File(dirName, fileName);
        file.setReadOnly();
    }

    /**
     * 8. Método para cambiar el modo de acceso a un fichero a solo escritura
     * @param dirName
     * @param fileName
     */
    public void mEscritura (String dirName, String fileName) {
        File file = new File(dirName, fileName);
        file.setWritable(true);
    }

    /**
     * 9. Método para borrar un fichero
     * @param dirName
     * @param fileName
     */
    public void borraFicheiro (String dirName, String fileName) {
        File file = new File(dirName, fileName);
        if (file.delete()) {
            System.out.println("Ficheiro borrado");
        } else {
            System.out.println("Ficheiro inexistente");
        }
    }

    /**
     * 10. Método para borrar un directorio
     * @param dirName
     */
    public void borraDirectorio (String dirName) {
        File file = new File(dirName);
        if (file.delete()) {
            System.out.println("Directorio borrado");
        } else {
            System.out.println("Ruta inexistente ou con descencencia");
        }
    }

    /**
     * 11. Método para mostrar el contenido de un directorio
     * @param dirName
     */
    public void mContido (String dirName) {
        File file = new File(dirName);
        String[] lista = file.list();
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
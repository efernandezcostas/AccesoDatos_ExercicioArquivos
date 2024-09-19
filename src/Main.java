public class Main {
    public static void main(String[] args) {
        OperacionFicheiro ficheiro = new OperacionFicheiro();

        // 1. Crear directorio
        ficheiro.creaDirectorio("/home/dam/Work/Clase/AccesoDatos/arquivosdir");

        // 2. Crear fichero
        ficheiro.creaFicheiro("/home/dam/Work/Clase/AccesoDatos/arquivosdir/", "Products1.txt");

        // 3. Crear directorio y crear fichero dentro
        ficheiro.creaDirectorio("/home/dam/Work/Clase/AccesoDatos/arquivosdir/subdir");
        ficheiro.creaFicheiro("/home/dam/Work/Clase/AccesoDatos/arquivosdir/subdir/", "Products2.txt");

        // 4. Mostrar contenido del directorio
        ficheiro.mContido("/home/dam/Work/Clase/AccesoDatos/arquivosdir/");

        // 5. Mostrar el modo de acceso y la longitud
        System.out.println(ficheiro.modoAcceso("/home/dam/Work/Clase/AccesoDatos/arquivosdir/", "Products1.txt"));
        System.out.println(ficheiro.calculaLonxitude("/home/dam/Work/Clase/AccesoDatos/arquivosdir/", "Products1.txt"));

        // 6. Hacer el fichero de solo lectura
        ficheiro.mLectura("/home/dam/Work/Clase/AccesoDatos/arquivosdir/", "Products1.txt");

        // 7. Permitir la escritura en el fichero
        ficheiro.mEscritura("/home/dam/Work/Clase/AccesoDatos/arquivosdir/", "Products1.txt");

        // 8. Eliminar el fichero de la ruta especificada
        ficheiro.borraFicheiro("/home/dam/Work/Clase/AccesoDatos/arquivosdir/", "Products1.txt");

        // 9. Eliminar el resto de ficheros y directorios
        ficheiro.borraFicheiro("/home/dam/Work/Clase/AccesoDatos/arquivosdir/subdir/", "Products2.txt");
        ficheiro.borraDirectorio("/home/dam/Work/Clase/AccesoDatos/arquivosdir/subdir/");
        ficheiro.borraDirectorio("/home/dam/Work/Clase/AccesoDatos/arquivosdir/");
    }
}


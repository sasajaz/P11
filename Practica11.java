package mx.unam.fi.poo.g1.p11;

/**
 * Clase principal que indica los 3 archivos a unir y el archivo nuevo
 */
public class Practica11 {
    public static void main(String[] args) {
        String archivofinal = "C:\\Users\\sasaj\\OneDrive\\Documentos\\POO\\P11\\unidos.txt";
        String[] archivos= {
            "C:\\Users\\sasaj\\OneDrive\\Documentos\\POO\\P11\\texto1.txt",
            "C:\\Users\\sasaj\\OneDrive\\Documentos\\POO\\P11\\texto2.txt",
            "C:\\Users\\sasaj\\OneDrive\\Documentos\\POO\\P11\\texto3.txt"
        };

        Unir var = new Unir(archivofinal);
        var.juntar(archivos);
        var.imprimirContenidoFinal();
    }
}

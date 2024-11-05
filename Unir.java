package mx.unam.fi.poo.g1.p11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase que une 3 archivos
 */
public class Unir {
    private String archivofinal;

    /**
     * Método Constructor que indica la ruta absoluta del archivo
     *
     * @param archivofinal ruta absoluta donde está el archivo
     */
    public Unir(String archivofinal) {
        this.archivofinal = archivofinal;
    }

    /**
     * Método que junta los archivos
     *
     * @param archivos arreglo que combina los archivos
     */
    public void juntar(String[] archivos) {
        try (FileWriter fw = new FileWriter(archivofinal, false)) {
            for (String archivo : archivos) {
                try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        fw.write(linea + System.lineSeparator());
                    }
                } catch (IOException e) {
                    System.err.println("Error al leer el archivo: " + archivo);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + archivofinal);
        }
    }
    /**
     * Método que imprime el resultado final
     * 
     */
    public void imprimirContenidoFinal() {
        try (BufferedReader br = new BufferedReader(new FileReader(archivofinal))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo combinado: " + archivofinal);
        }
    }
}

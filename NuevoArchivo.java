package mx.unam.fi.poo.g1.p11.ej3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NuevoArchivo {
    private String filename;

    
    public NuevoArchivo(String filename) {
        this.filename = filename;
    }

    
    public void escribir(String var) {
        try (FileWriter fw = new FileWriter(filename, false)) {
            fw.write(var);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    
    public String leer() {
        StringBuilder sb = new StringBuilder();
        String strLine;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((strLine = br.readLine()) != null) {
                sb.append(strLine).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return sb.toString();
    }
}

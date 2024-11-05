package mx.unam.fi.poo.g1.p11.ej1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class leerGuardar {
    private String dir;

    public leerGuardar(String dir) {
        this.dir = dir;
    }

    public String leer() {
        StringBuilder str_data = new StringBuilder();
        String strLine;

        try (BufferedReader br = new BufferedReader(new FileReader(dir))) {
            while ((strLine = br.readLine()) != null) {
                str_data.append(strLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado...");
        } catch (IOException e) {
            System.err.println("No es posible leer el archivo...");
        }

        return str_data.toString();
    }
}

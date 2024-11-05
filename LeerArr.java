package mx.unam.fi.poo.g1.p11.ej2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class LeerArr {
    private String dir;
    public LeerArr(String dir) {
        this.dir = dir;
    }

    public List<String> leer() {
        List<String> list = new ArrayList<>();
        String strLine;

        try (BufferedReader br = new BufferedReader(new FileReader(dir))) {
            while ((strLine = br.readLine()) != null) {
                list.add(strLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado...");
        } catch (IOException e) {
            System.err.println("No es posible leer el archivo...");
        }

        return list;
    }
}

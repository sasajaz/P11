package mx.unam.fi.poo.g1.p11.ej0;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

 class SoloLeer {
    private String dir;

    public SoloLeer(String dir) {
        this.dir = dir;
    }

    public String Leer() {
        StringBuilder sb = new StringBuilder();
        String strLine = "";

        try (BufferedReader br = new BufferedReader(new FileReader(dir))) {
            strLine=br.readLine();
            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                System.out.println(strLine);
                strLine = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado...");
        } catch (IOException e) {
            System.err.println("No es posible leer el archivo");
        }
        return sb.toString();
    }
}

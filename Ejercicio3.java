package mx.unam.fi.poo.g1.p11.ej3;

import mx.unam.fi.poo.g1.p11.ej3.NuevoArchivo;

public class Ejercicio3 {
    public static void main(String[] args) {
        String filename = "C:\\Users\\sasaj\\OneDrive\\Documentos\\POO\\P11\\test.txt";
        NuevoArchivo nuevo = new NuevoArchivo(filename);

        nuevo.escribir("Me la estoy pasando bien raro... \n");

        String var = nuevo.leer();
        System.out.println(var);
    }
}

package mx.unam.fi.poo.g1.p11.ej2;

import java.util.Arrays;
import java.util.List;

import mx.unam.fi.poo.g1.p11.ej2.LeerArr;

public class Ejercicio2 {
    public static void main(String[] args) {
        LeerArr leer = new LeerArr("C:\\Users\\sasaj\\OneDrive\\Documentos\\POO\\P11\\test.txt");
        List<String> var = leer.leer();
        System.out.println(Arrays.toString(var.toArray()));
    }
}

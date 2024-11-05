package mx.unam.fi.poo.g1.p11.ej1;

import mx.unam.fi.poo.g1.p11.ej1.leerGuardar;

public class Ejercicio1 {
    public static void main(String[] args) {
        leerGuardar leer = new leerGuardar("C:\\Users\\sasaj\\OneDrive\\Documentos\\POO\\P11\\test.txt");
        String guardar = leer.leer();
        System.out.println(guardar);
    }
}

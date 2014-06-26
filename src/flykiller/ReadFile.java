/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flykiller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Sandman
 */
public class ReadFile {

    String tempFolder = System.getProperty("java.io.tmpdir");
    String tempFile = tempFolder + "temporal.txt";
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    int contador = 0;
    String a, b;

    public ReadFile() {
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(tempFile);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null && contador < 2) {
                if (contador == 0) {
                    a = linea;
                } else {
                    b = linea;
                }contador++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    public String getA(){
        this.a=a;
        return a;
    }
        public String getB(){
        this.b=b;
        return b;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flykiller;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Sandman
 */
public class InitState {
        String tempFolder = System.getProperty("java.io.tmpdir");
    String tempFile = tempFolder + "temporal.txt";
    FileWriter fichero = null;
    PrintWriter pw = null;
    public String a, b;
    public int c = 0, d = 0;
    public int aux, aux1;
    ReadFile rf = new ReadFile();
    
        public void InitState() {
        try {
            fichero = new FileWriter(tempFile);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 2; i++) {
                int x = 0;
                pw.println(x);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}

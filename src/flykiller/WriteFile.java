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
public class WriteFile {

    String tempFolder = System.getProperty("java.io.tmpdir");
    String tempFile = tempFolder + "temporal.txt";
    FileWriter fichero = null;
    PrintWriter pw = null;
    public String a, b;
    public int c = 0, d = 0;
    public int aux, aux1;
    ReadFile rf = new ReadFile();

    public WriteFile() {
        a = rf.getA();
        aux = Integer.parseInt(a);
        b = rf.getB();
        aux1 = Integer.parseInt(b);
    }

    public void setA(int c) {
        this.a = a;
        this.c = c;
        if (c == 1) {
            aux = aux + 1;
            a = Integer.toString(aux);
            Write();
        }
    }

    public void setB(int d) {
        this.b = b;
        this.d = d;
        if (d == 1) {
            aux1 = aux1 + 1;
            b = Integer.toString(aux1);
            Write();
        }
    }

    public void Write() {
        try {
            fichero = new FileWriter(tempFile);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    pw.println(a);
                } else {
                    pw.println(b);
                }
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flykiller;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.applet.AudioClip;

/**
 *
 * @author Sandman
 */
class ImagePanel extends JPanel {

    private Image img;
    private ArrayList sapos;
    private ArrayList moscas;
    private int a = 0;
    private int b = 0;
    Random rdm = new Random();

    public ImagePanel(Image img) {
        this.img = img;
        moscas = new ArrayList();
        sapos = new ArrayList();
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);

        for (Iterator it = moscas.iterator(); it.hasNext();) {
            Mosca m = (Mosca) it.next();
            m.dibujar(g);

        }

        for (Iterator it = sapos.iterator(); it.hasNext();) {
            Sapo s = (Sapo) it.next();
            s.dibujar(g);

        }

    }

    public void agregarMosca() {
        Mosca m = new Mosca(70, 20, this);
        moscas.add(m);
        m.sonidoMosca();
    }

    public void agregarSapo() {
        int aux;
        aux = rdm.nextInt(2);
        if (aux == 1) {
            int x = rdm.nextInt(10)+1;
            switch (x) {
                case 1:
                    a = 70;
                    b = 56;
                    break;
                case 2:
                    a = 446;
                    b = 55;
                    break;
                case 3:
                    a = 180;
                    b = 514;
                    break;
                case 4:
                    a = 510;
                    b = 456;
                    break;
                case 5:
                    a = 180;
                    b = 397;
                    break;
                case 6:
                    a = 404;
                    b = 331;
                    break;
                case 7:
                    a = 564;
                    b = 200;
                    break;
                case 8:
                    a = 640;
                    b = 515;
                    break;
                case 9:
                    a = 70;
                    b = 170;
                    break;
                case 10:
                    a = 266;
                    b = 440;
                    break;
            }

        } else {
            int y = rdm.nextInt(6);
            switch (y) {
                case 1:
                    a = 390;
                    b = 56;
                    break;
                case 2:
                    a = 564;
                    b = 236;
                    break;
                case 3:
                    a = 640;
                    b = 56;
                    break;
                case 4:
                    a = 70;
                    b = 480;
                    break;
                case 5:
                    a = 404;
                    b = 516;
                    break;
                case 6:
                    a = 70;
                    b = 30;
                    break;

            }
        }
        Sapo s = new Sapo(a, b, this, moscas);
        sapos.add(s);
        s.sonidoSapo();
    }
}

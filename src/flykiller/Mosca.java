package flykiller;

import aux_laberinto.X_Y;
import aux_laberinto.coordenadas;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Mosca implements Runnable {

    public int mf=0;
    private Image mosca;
    private int posX;
    private int posY;
    private int aux = 1;
    private int aux1 = 1;
    private int reversa = 0;
    public int velocidad = 1;
    public int codigoDireccion = 3;
    public int decision = 0;
    AudioClip sonidom = java.applet.Applet.newAudioClip(getClass().getResource("/flykiller/Resources/mosca.wav"));
    private boolean comida=false,salvada=false;
    private int direccion=3;
    private ArrayList coordenadas;
    Random rdm = (Random) new Random();
    int dir = rdm.nextInt(4);

    public boolean arriba = false;
    public boolean abajo = false;
    public boolean derecha = false;
    public boolean izquierda = false;

    JPanel panel;
    private Thread hilo;

 
    public Mosca(int x, int y, JPanel panel) {
        this.panel = panel;
        this.posX = x;
        this.posY = y;
        coordenadas coord=new coordenadas();
        this.coordenadas=coord.getListaXY();
        mosca = new ImageIcon(getClass().getResource("/flykiller/Resources/fly1.jpg")).getImage();
        animar();
    }

    
    
     public void animar() {
        hilo = new Thread(this);
        hilo.start();
    }
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(mosca, posX, posY, null);
    }

    private int getNumberRandom(int Max) {
        return (int) (Math.random() * Max + 1);
    }
    
    public void comida(){
        mosca=null;
        comida=true;
        hilo.stop();
    }
        public void pararHilo() {
        hilo.stop();
    }

    public void run() {
        while (true) {
            try {
                if (comida) {
                    mosca = null;
                    panel.repaint();
                    pararHilo();
                }
               MoverPosicion();
                dibujar(panel.getGraphics());
                Thread.sleep(10);
               panel.repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mosca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }


    public boolean isComida() {
        return comida;
    }

    protected void MoverPosicion() {
      for (Iterator it = coordenadas.iterator(); it.hasNext();) {
            X_Y p = (X_Y) it.next();
            if (p.getX() == posX && p.getY() == posY) {
                switch (p.getClase()) {
                    case 0://curva
                        if (direccion == 1 && p.isAbajo()) {
                            direccion = 3;
                        } else if (direccion == 1 && p.isArriba()) {
                            direccion = 4;
                        } else if (direccion == 2 && p.isAbajo()) {
                            direccion = 3;
                        } else if (direccion == 2 && p.isArriba()) {
                            direccion = 4;
                        } else if (direccion == 3 && p.isIzq()) {
                            direccion = 2;
                        } else if (direccion == 3 && p.isDer()) {
                            direccion = 1;
                        } else if (direccion == 4 && p.isIzq()) {
                            direccion = 2;
                        } else if (direccion == 4 && p.isDer()) {
                            direccion = 1;
                        }
                        break;
                    case 1:// interseccion
                        boolean bandera = true;
                        //1 der 2 izq 3 abajo 4 arriba
                        if (direccion == 1 && p.isIzq()) {
                            p.setIzq(false);
                        }
                        if (direccion == 2 && p.isDer()) {
                            p.setDer( false);
                        }
                        if (direccion == 3 && p.isArriba()) {
                            p.setArriba(false);
                        }
                        if (direccion == 4 && p.isAbajo()) {
                            p.setAbajo(false);
                        }

                        do {
                            if (!p.isArriba() && !p.isAbajo() && !p.isDer() && !p.isIzq())// arriba
                            {
                                if (direccion == 1) {
                                    direccion = 2;
                                } else if (direccion == 2) {
                                    direccion = 1;
                                } else if (direccion == 3) {
                                    direccion = 4;
                                } else if (direccion == 4) {
                                    direccion = 3;
                                }
                                bandera = false;
                                break;
                            }
                            int nro = getNumberRandom(4);
                            // System.out.println(nro);
                            if (nro == 1 && p.isDer())//der                                        
                            {
                                direccion = 1;
                                bandera = false;
                                p.setDer(false);
                            }
                            if (nro == 2 && p.isIzq())// izq
                            {
                                direccion = 2;
                                bandera = false;
                                p.setIzq(false);
                            }
                            if (nro == 3 && p.isAbajo()) // abajo
                            {
                                p.setAbajo(false);
                                direccion = 3;
                                bandera = false;
                            }
                            if (nro == 4 && p.isArriba())// arriba
                            {
                                direccion = 4;
                                bandera = false;
                                p.setArriba(false);
                            }
                            
                        } while (bandera);

                        break;
                    case 2:// cruce
                        break;
                    case 3:// punto ciego invierto la direccion del punto
                        if (direccion == 1) {
                            direccion = 2;
                        } else if (direccion == 2) {
                            direccion = 1;
                        } else if (direccion == 3) {
                            direccion = 4;
                        } else if (direccion == 4) {
                            direccion = 3;
                        }
                        break;
                    case 4:// punto final
                        salvada = true;
                        mosca = null;
                        this.pararHilo();
                        break;

                }
                break;
            }
        }
        switch (direccion) {
            case 1:
               this.posX++;               
               break;
            case 3:
               this.posY++;
               break;
            case 2:
                this.posX--;
                break;
            case 4:
                this.posY--;
                break;
        }
   }

    protected void Decision1() {
        decision = rdm.nextInt(2);
        if (decision == 1) {
            aux = 2;
        } else {
            aux = 3;
        }
    }

 
    protected void Decision2() {
        decision = rdm.nextInt(2);
        if (decision == 1) {
            aux = 4;
        } else {
            aux = 3;
        }
    }

    protected void obtenerPosicion() {
        this.posX = posX;
        this.posY = posY;
    }


    public void sonidoMosca(){
        
            
        sonidom.play();
    }
    
    
}

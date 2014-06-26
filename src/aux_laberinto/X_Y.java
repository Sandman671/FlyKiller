/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aux_laberinto;

/**
 *
 * @author 
 */
public class X_Y {
    
        int x, y;
        int clase;// 0 curva 1 interseccion 2 cruce 3 punto ciego 4 final
        boolean der, izq, arriba, abajo;//solo para cruces y intersecciones;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getClase() {
        return clase;
    }

    public boolean isDer() {
        return der;
    }

    public boolean isIzq() {
        return izq;
    }

    public boolean isArriba() {
        return arriba;
    }

    public boolean isAbajo() {
        return abajo;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public void setDer(boolean der) {
        this.der = der;
    }

    public void setIzq(boolean izq) {
        this.izq = izq;
    }

    public void setArriba(boolean arriba) {
        this.arriba = arriba;
    }

    public void setAbajo(boolean abajo) {
        this.abajo = abajo;
    }
        
    
        public void puntoCiego(int x, int y) {
            this.x = x;
            this.y = y;
            this.clase = 3;
        }

        public void puntoFinal(int x, int y) {
            this.x = x;
            this.y = y;
            this.clase = 4;
        }

        public void puntoInterseccion(int x, int y, boolean der, boolean izq, boolean arriba, boolean abajo) {
            this.x = x;
            this.y = y;
            this.clase = 1;
            this.der = der;
            this.izq = izq;
            this.arriba = arriba;
            this.abajo = abajo;
        }

        public void puntoCurva(int x, int y, boolean der, boolean izq, boolean arriba, boolean abajo) {
            this.x = x;
            this.y = y;
            this.clase = 0;
            this.der = der;
            this.izq = izq;
            this.arriba = arriba;
            this.abajo = abajo;
        }
}

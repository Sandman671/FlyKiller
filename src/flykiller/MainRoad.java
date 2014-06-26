package flykiller;

import java.util.Random;

/**
 *
 * @author Sandman
 */
public class MainRoad {

    public int aux = 0;
    public int aux1 = 0;
    public int x, y, xx, yy, xxx, xxxx, yyy, yyyy, comp=0;
    public int d = 1;
    public int decision = 0;
    public Random r = new Random();

    public int direccion(int xx, int yy) {
        this.xx = xx;
        this.yy = yy;
        if (xx == 124 && yy == 480) {
            d = 0;
        }
        if (xx == 124 && yy == 170) {
            d = 0;
        }
        return d;
    }

    public int ForwardX(int x, int y) {
        this.x = x;
        this.y = y;

        if (y == 114 && x < 174) {
            x = x + 1;
        }
        if (x == 174 && y == 230 && aux1 == 0) {
            Decision1();
        }

        if (aux1 == 2 && x < 230 && y == 230) {
            x = x + 1;
        }
        if (aux1 == 2 && x < 284 && y == 114) {
            x = x + 1;
        }
        if (aux1 == 2 && y == 280 && x < 340) {
            x = x + 1;
        }
        if (aux1 == 2 && y == 224 && x == 340) {
            Decision2();
        }
        if (aux1 == 4 && y == 224 && x < 404) {
            x = x + 1;
        }
        if (x == 404 && y == 308 && aux1 == 6) {
            Decision4();
        }
        if (x < 460 && y == 308 && aux1 == 8) {
            x = x + 1;
        }
        if (x < 586 && y == 516 && aux1 == 10) {
            x = x + 1;
        }
        if (x < 640 && y == 458 && aux1 == 14) {
            x = x + 1;
        }
        if (x < 666 && y == 516 && aux1 == 13) {
            x = x + 1;
        }
        //Variante 1
        if (aux1 == 3 && x > 124 && y == 230) {
            x = x - 1;
        }
        if (aux1 == 17 && x > 70 && y == 426) {
            x = x - 1;
        }
        if (aux1 == 17 && x < 124 && y == 516) {
            x = x + 1;
        }
        // Via 2
        if (aux1 == 18 && x > 70 && y == 370) {
            x = x - 1;
        }
        if (aux1 == 18 && x < 124 && y == 170) {
            x = x + 1;
        }
        return x;
    }

    public int ForwardY(int x, int y) {
        this.x = x;
        this.y = y;

        if (x == 70 && y < 114) {
            y = y + 1;
        }
        if (x == 174 && y < 230) {
            y = y + 1;
        }
        if (x == 230 && y > 114 && aux1 == 2) {
            y = y - 1;
        }
        if (x == 284 && y < 280 && aux1 == 2) {
            y = y + 1;
        }
        if (x == 340 && y > 224 && aux1 == 2) {
            y = y - 1;
        }
        if (x == 404 && y < 250 && aux1 == 4) {
            y = y + 1;
        }
        if (x == 404 && y == 250 && aux1 == 4) {
            Decision3();
        }
        if (x == 404 && y < 308 && aux1 == 6) {
            y = y + 1;
        }
        if (x == 460 && y < 344 && aux1 == 8) {
            y = y + 1;
        }
        if (x == 460 && y == 344 && aux1 == 8) {
            Decision5();
        }
        if (x == 460 && y < 516 && aux1 == 10) {
            y = y + 1;
        }
        if (x == 586 && y > 458 && aux1 == 10) {
            y = y - 1;
        }
        if (x == 586 && y == 458 && aux1 == 10) {
            aux1 = 14;
        }
        if (x == 640 && y == 458 && aux1 == 14) {
            Decision6();
        }
        if (x == 640 && y < 516 && aux1 == 13) {
            y = y + 1;
        }
        //Variante1
        if (x == 124 && aux1 == 3 && y < 286) {
            y = y + 1;
        }
        if (x == 124 && aux1 == 3 && y == 286) {
            Decision11();
        }
        if (x == 124 && aux1 == 15 && y < 370) {
            y = y + 1;
        }
        if (x == 124 && aux1 == 15 && y == 370) {
            Decision12();
        }
        if (aux1 == 17 && x == 124 && y < 426) {
            y = y + 1;
        }
        if (aux1 == 17 && x == 70 && y < 516) {
            y = y + 1;
        }
        if (aux1 == 17 && x == 124 && y > 480) {
            y = y - 1;
        }
        // via 2
        if (aux1 == 18 && x == 70 && y > 170) {
            y = y - 1;
        }
        return y;
    }

    public int BackwardX(int x, int y) {
        this.x = x;
        this.y = y;
        if (x > 70 && y == 516) {
            x = x - 1;
        }
        if (x < 124 && y == 426 && aux == 1) {
            x = x + 1;
        }
        //Via 2
        if (x > 70 && y == 170) {
            x = x - 1;
        }
        if (x < 124 && y == 370) {
            x = x + 1;
        }
        if (x == 124 && y == 370) {
            aux = 2;
        }
///a revisar
        if (x == 666 && y == 516) {
            aux1 = 13;
        }
        if (x > 640 && y == 516 && aux1 == 13) {
            x = x - 1;
        }
        if (y == 114 && x < 174) {
            x = x + 1;
        }
        if (x == 174 && y == 230 && aux1 == 0) {
            Decision1();
        }
        if (aux1 == 2 && x < 230 && y == 230) {
            x = x + 1;
        }
        if (aux1 == 2 && x < 284 && y == 114) {
            x = x + 1;
        }
        if (aux1 == 2 && y == 280 && x < 340) {
            x = x + 1;
        }
        if (aux1 == 2 && y == 224 && x == 340) {
            Decision2();
        }
        if (aux1 == 4 && y == 224 && x < 404) {
            x = x + 1;
        }
        if (x == 404 && y == 308 && aux1 == 6) {
            Decision4();
        }
        if (x < 460 && y == 308 && aux1 == 8) {
            x = x + 1;
        }
        if (x < 586 && y == 516 && aux1 == 10) {
            x = x + 1;
        }
        if (x < 640 && y == 458 && aux1 == 14) {
            x = x + 1;
        }

        return x;
    }

    public int BackwardY(int x, int y) {
        this.x = x;
        this.y = y;
        if (x == 124 && y < 516 && aux == 0) {
            y = y + 1;
        }
        if (x == 70 && y > 426) {
            y = y - 1;
        }
        if (x == 70 && y == 426) {
            aux = 1;
        }
        if (x == 124 && y > 370 && aux == 1) {
            y = y - 1;
        }
        if (x == 124 && y == 370 && aux == 1) {
            Decision13();
        }
        //Via2
        if (x == 70 && y < 370) {
            y = y + 1;
        }

        if (x == 640 && y > 458 && aux1 == 13 && aux==2) {
            y = y - 1;
        }
        if (x == 124 && y > 286 && aux == 2) {
            y = y - 1;
        }
        if (x == 124 && y == 286 && aux == 2) {
            d = 1;
        }
        return y;
    }

    protected void Decision1() {
        decision = r.nextInt(2);
        if (decision == 1) {
            aux1 = 2;
        } else {
            aux1 = 3;
        }
    }

    protected void Decision2() {
        decision = r.nextInt(2);
        if (decision == 1) {
            aux1 = 4;
        } else {
            aux1 = 5;
        }

    }

    protected void Decision3() {
        decision = r.nextInt(2);
        if (decision == 1) {
            aux1 = 6;
        } else {
            aux1 = 7;
        }

    }

    protected void Decision4() {
        decision = r.nextInt(2);
        if (decision == 1) {
            aux1 = 8;
        } else {
            aux1 = 9;
        }

    }

    protected void Decision5() {
        decision = r.nextInt(2);
        if (decision == 1) {
            aux1 = 10;
        } else {
            aux1 = 11;
        }

    }

    protected void Decision6() {
        decision = r.nextInt(2);
        if (decision == 1) {
            aux1 = 12;
        } else {
            aux1 = 13;
        }

    }

    protected void Decision11() {
        decision = r.nextInt(2);
        if (decision == 1) {
            aux1 = 15;
        } else {
            aux1 = 16;
        }
    }

    protected void Decision12() {
        decision = r.nextInt(2);
        if (decision == 1) {
            aux1 = 17;
        } else {
            aux1 = 18;
        }
    }

    protected void Decision13() {
        decision = r.nextInt(2);
        if (decision == 1) {
            d = 0;
        } else {
            d = 1;
            aux1 = 18;
        }
    }

    protected void Decision14() {
        decision = r.nextInt(2);
        if (decision == 1) {
            d = 0;
        } else {
            d = 1;
            aux1 = 18;
        }
    }
    public void sapo (int xxx, int yyy){
        this.xxx=xxx;
        this.yyy=yyy;
    }
        public void mosca (int xxxx, int yyyy){
        this.xxxx=xxxx;
        this.yyyy=yyyy;
    }
        public int comparar(){
            if (xxx==xxxx && yyy==yyyy){
                comp=1;
            }
            return comp;
        }
}

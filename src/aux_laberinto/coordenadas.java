/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aux_laberinto;

import java.util.ArrayList;

/**
 *
 * @author
 */
public class coordenadas {

    ArrayList listaXY;
    ArrayList listainiciales;

    public coordenadas() {
        listaXY = new ArrayList();
        listainiciales = new ArrayList();
        armarPuntos();
    }

    public void armarPuntos() {
//boolean der, boolean izq, boolean arriba, boolean abajo
        X_Y xy = new X_Y();
        xy.puntoCurva(70, 114, true, false, true, false);
        listaXY.add(xy);
        X_Y xy1 = new X_Y();
        xy1.puntoCurva(174, 114, false, true, false, true);
        listaXY.add(xy1);
        X_Y xy2 = new X_Y();
        xy2.puntoInterseccion(174, 230, true, true, true, false);
        listaXY.add(xy2);
        X_Y xy7 = new X_Y();
        xy7.puntoCurva(230, 230, false, true, true, false);
        listaXY.add(xy7);

        X_Y xy8 = new X_Y();
        xy8.puntoCurva(230, 114, true, false, false, true);
        listaXY.add(xy8);
        X_Y xy9 = new X_Y();
        xy9.puntoCurva(284, 114, false, true, false, true);
        listaXY.add(xy9);

        X_Y xy10 = new X_Y();
        xy10.puntoCurva(284, 280, true, false, true, false);
        listaXY.add(xy10);
        X_Y xy101 = new X_Y();
        xy101.puntoCurva(340, 280, false, true, true, false);
        listaXY.add(xy101);

        //boolean der, boolean izq, boolean arriba, boolean abajo
        X_Y xy11 = new X_Y();
        xy11.puntoInterseccion(340, 224, true, false, true, true);
        listaXY.add(xy11);

        X_Y xy12 = new X_Y();
        xy12.puntoCurva(404, 224, false, true, false, true);
        listaXY.add(xy12);
        X_Y xy13 = new X_Y();
        xy13.puntoInterseccion(404, 250, true, false, true, true);
        listaXY.add(xy13);
        X_Y xy14 = new X_Y();
        xy14.puntoInterseccion(404, 308, true, false, true, true);
        listaXY.add(xy14);
        X_Y xy15 = new X_Y();
        xy15.puntoCiego(404, 516);
        listaXY.add(xy15);
        X_Y xy16 = new X_Y();
        xy16.puntoCurva(124, 230, true, false, false, true);
        listaXY.add(xy16);
        X_Y xy17 = new X_Y();
        xy17.puntoInterseccion(124, 286, true, false, true, true);
        listaXY.add(xy17);
        X_Y xy18 = new X_Y();
        xy18.puntoInterseccion(124, 370, false, true, true, true);
        listaXY.add(xy18);
        X_Y xy19 = new X_Y();
        xy19.puntoCurva(70, 370, true, false, true, false);
        listaXY.add(xy19);
        X_Y xy20 = new X_Y();
        xy20.puntoCurva(70, 170, true, false, false, true);
        listaXY.add(xy20);
        X_Y xy21 = new X_Y();
        xy21.puntoCiego(124, 170);
        listaXY.add(xy21);
        X_Y xy22 = new X_Y();
        xy22.puntoCurva(124, 426, false, true, true, false);
        listaXY.add(xy22);
        X_Y xy23 = new X_Y();
        xy23.puntoCurva(70, 426, true, false, false, true);
        listaXY.add(xy23);
        X_Y xy24 = new X_Y();
        xy24.puntoCurva(70, 516, true, false, true, false);
        listaXY.add(xy24);
        X_Y xy25 = new X_Y();
        xy25.puntoCurva(124, 516, false, true, true, false);
        listaXY.add(xy25);
        X_Y xy26 = new X_Y();
        xy26.puntoCiego(124, 480);
        listaXY.add(xy26);
        X_Y xy27 = new X_Y();
        xy27.puntoCurva(340, 56, false, true, false, true);
        listaXY.add(xy27);
        X_Y xy28 = new X_Y();
        xy28.puntoCiego(120, 56);
        listaXY.add(xy28);
        X_Y xy29 = new X_Y();
        xy29.puntoCurva(230, 286, false, true, false, true);
        listaXY.add(xy29);
        X_Y xy30 = new X_Y();
        xy30.puntoCurva(230, 344, false, true, true, false);
        listaXY.add(xy30);
        X_Y xy31 = new X_Y();
        xy31.puntoCurva(180, 344, true, false, false, true);
        listaXY.add(xy31);
        X_Y xy32 = new X_Y();
        xy32.puntoInterseccion(180, 402, true, false, true, true);
        listaXY.add(xy32);
        X_Y xy33 = new X_Y();
        xy33.puntoCurva(180, 516, true, false, true, false);
        listaXY.add(xy33);
        X_Y xy34 = new X_Y();
        xy34.puntoCiego(220, 402);
        listaXY.add(xy34);
        X_Y xy35 = new X_Y();
        xy35.puntoCiego(354, 516);
        listaXY.add(xy35);
        X_Y xy36 = new X_Y();
        xy36.puntoInterseccion(230, 338, true, false, true, true);
        listaXY.add(xy36);
        X_Y xy37 = new X_Y();
        xy37.puntoCiego(354, 338);
        listaXY.add(xy37);
        X_Y xy38 = new X_Y();
        xy38.puntoInterseccion(266, 338, true, true, false, true);
        listaXY.add(xy38);
        X_Y xy39 = new X_Y();
        xy39.puntoInterseccion(266, 458, true, true, true, false);
        listaXY.add(xy39);
        X_Y xy40 = new X_Y();
        xy40.puntoInterseccion(318, 458, true, true, true, false);
        listaXY.add(xy40);
        X_Y xy41 = new X_Y();
        xy41.puntoCiego(226, 458);
        listaXY.add(xy41);
        X_Y xy42 = new X_Y();
        xy42.puntoCiego(354, 458);
        listaXY.add(xy42);
        X_Y xy43 = new X_Y();
        xy43.puntoCurva(318, 396, true, false, false, true);
        listaXY.add(xy43);
        X_Y xy44 = new X_Y();
        xy44.puntoInterseccion(404, 396, false, true, true, true);
        listaXY.add(xy44);
        X_Y xy45 = new X_Y();
        xy45.puntoCurva(460, 308, false, true, false, true);
        listaXY.add(xy45);
        X_Y xy46 = new X_Y();
        xy46.puntoCurva(460, 250, false, true, true, false);
        listaXY.add(xy46);
        X_Y xy47 = new X_Y();
        xy47.puntoCurva(460, 516, true, false, true, false);
        listaXY.add(xy47);
        X_Y xy48 = new X_Y();
        xy48.puntoCurva(586, 516, false, true, true, false);
        listaXY.add(xy48);
        X_Y xy49 = new X_Y();
        xy49.puntoCurva(586, 458, true, false, false, true);
        listaXY.add(xy49);
        X_Y xy50 = new X_Y();
        xy50.puntoInterseccion(640, 458, false, true, true, true);
        listaXY.add(xy50);
        X_Y xy51 = new X_Y();
        xy51.puntoCurva(640, 516, true, false, true, false);
        listaXY.add(xy51);
        X_Y xy52 = new X_Y();
        xy52.puntoInterseccion(460, 344, true, false, true, true);
        listaXY.add(xy52);
        X_Y xy53 = new X_Y();
        xy53.puntoCurva(586, 344, false, true, false, true);
        listaXY.add(xy53);
        X_Y xy54 = new X_Y();
        xy54.puntoCurva(586, 398, false, true, true, false);
        listaXY.add(xy54);
        X_Y xy55 = new X_Y();
        xy55.puntoCurva(510, 398, true, false, false, true);
        listaXY.add(xy55);
        X_Y xy56 = new X_Y();
        xy56.puntoCurva(510, 458, true, false, true, false);
        listaXY.add(xy56);
        X_Y xy57 = new X_Y();
        xy57.puntoCiego(534, 458);
        listaXY.add(xy57);
        X_Y xy58 = new X_Y();
        xy58.puntoCurva(390, 160, true, false, true, false);
        listaXY.add(xy58);
        X_Y xy59 = new X_Y();
        xy59.puntoCurva(460, 160, false, true, false, true);
        listaXY.add(xy59);
        X_Y xy60 = new X_Y();
        xy60.puntoCiego(390, 52);
        listaXY.add(xy60);
        X_Y xy61 = new X_Y();
        xy61.puntoInterseccion(446, 160, true, true, true, false);
        listaXY.add(xy61);
        X_Y xy62 = new X_Y();
        xy62.puntoCurva(446, 56, true, false, false, true);
        listaXY.add(xy62);
        X_Y xy63 = new X_Y();
        xy63.puntoCiego(590, 56);
        listaXY.add(xy63);
                X_Y xy64 = new X_Y();
        xy64.puntoInterseccion(460, 170, true, false, true, true);
        listaXY.add(xy64);
                X_Y xy65 = new X_Y();
        xy65.puntoCurva(512, 170, false, true, true, false);
        listaXY.add(xy65);
                X_Y xy66 = new X_Y();
        xy66.puntoInterseccion(512, 114, true, true, false, true);
        listaXY.add(xy66);
                X_Y xy67 = new X_Y();
        xy67.puntoCiego(492, 114);
        listaXY.add(xy67);
                X_Y xy68 = new X_Y();
        xy68.puntoCurva(586, 114, false, true, false, true);
        listaXY.add(xy68);
                X_Y xy69 = new X_Y();
        xy69.puntoInterseccion(586, 170, true, true, true, false);
        listaXY.add(xy69);
                X_Y xy70 = new X_Y();
        xy70.puntoCurva(644, 170, false, true, true, false);
        listaXY.add(xy70);
                X_Y xy71 = new X_Y();
        xy71.puntoCurva(564, 170, true, false, false, true);
        listaXY.add(xy71);
                X_Y xy72 = new X_Y();
        xy72.puntoCiego(644, 56);
        listaXY.add(xy72);
                X_Y xy73 = new X_Y();
        xy73.puntoInterseccion(564, 230, true, false, true, true);
        listaXY.add(xy73);
                X_Y xy74 = new X_Y();
        xy74.puntoCiego(644, 230);
        listaXY.add(xy74);
                X_Y xy75 = new X_Y();
        xy75.puntoCurva(564, 288, true, false, true, false);
        listaXY.add(xy75);
                X_Y xy76 = new X_Y();
        xy76.puntoCurva(640, 288, false, true, false, true);
        listaXY.add(xy76);
                X_Y xy77 = new X_Y();
        xy77.puntoInterseccion(564, 260, false, true, true, true);
        listaXY.add(xy77);
                X_Y xy78 = new X_Y();
        xy78.puntoInterseccion(512, 260, true, false, true, true);
        listaXY.add(xy78);
                X_Y xy79 = new X_Y();
        xy79.puntoInterseccion(512, 344, true, true, true, false);
        listaXY.add(xy79);
                X_Y xy80 = new X_Y();
        xy80.puntoCiego(512, 226);
        listaXY.add(xy80);

    }

    public void paraSapo() {
        X_Y xy81 = new X_Y();
        xy81.puntoCiego(666, 516);
        listaXY.add(xy81);

        X_Y xy82 = new X_Y();
        xy82.puntoCiego(70, 19);
        listaXY.add(xy82);
    }

    public ArrayList getListaXY() {
        return listaXY;
    }

    public ArrayList getListainiciales() {
        return listainiciales;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafkom2016;

import java.awt.Color;

/**
 *
 * @author praktikan
 */
public class Elips extends Grafkom {

    Titik pusat;
    int rx, ry;
    Color warna;
    int[] s;

    public Elips(Titik pusat, int rx, int ry, Color warna) {
        this.pusat = pusat;
        this.rx = rx;
        this.ry = ry;
        this.warna = warna;
    }

    public Elips(Titik pusat, int rx, int ry, Color warna, int[] s) {
        this.pusat = pusat;
        this.rx = rx;
        this.ry = ry;
        this.warna = warna;
        this.s = s;
    }

    void elipsPlotPoints(int x, int y) {
        for (int i = 0; i <= s.length - 1; i++) {
            switch (s[i]) {
                case 1:
                    if ((pusat.x + x < Grafkom.lebar && pusat.x + x >= 0) && (pusat.y - y < Grafkom.tinggi && pusat.y - y >= 0)) {
                        myImage.setRGB(pusat.x + x, pusat.y - y, warna.getRGB());
                        break;
                    }
                case 2:
                    if ((pusat.x + x < Grafkom.lebar && pusat.x + x >= 0) && (pusat.y + y < Grafkom.tinggi && pusat.y + y >= 0)) {
                        myImage.setRGB(pusat.x + x, pusat.y + y, warna.getRGB());
                        break;
                    }
                case 3:
                    if ((pusat.x - x < Grafkom.lebar && pusat.x - x >= 0) && (pusat.y + y < Grafkom.tinggi && pusat.y + y >= 0)) {
                        myImage.setRGB(pusat.x - x, pusat.y + y, warna.getRGB());
                        break;
                    }
                case 4:
                    if ((pusat.x - x < Grafkom.lebar && pusat.x - x >= 0) && (pusat.y - y < Grafkom.tinggi && pusat.y - y >= 0)) {
                        myImage.setRGB(pusat.x - x, pusat.y - y, warna.getRGB());
                        break;
                    }
            }
        }
    }

    void buatGambar() {
        int x, y, px, py, p;
        x = 0;
        y = ry;
        px = 0;
        py = (2 * (rx * rx)) * y;
        elipsPlotPoints(x, y);
        p = (int) Math.round((ry * ry) - ((rx * rx) * ry) + (0.25 * (rx * rx)));
        while (px < py) {
            x++;
            px += 2 * (ry * ry);
            if (p < 0) {
                p += (ry * ry) + px;
            } else {
                y -= 1;
                py -= 2 * (rx * rx);
                p += (ry * ry) + px - py;
            }
            elipsPlotPoints(x, y);
        }
        p = (int) Math.round((ry * ry) * (x + 0.5) * (x + 0.5) + (rx * rx) * (y - 1) * (y - 1) - (rx * rx) * (ry * ry));
        while (y > 0) {
            y--;
            py -= 2 * (rx * rx);
            if (p > 0) {
                p += (rx * rx) - py;
            } else {
                x++;
                px += 2 * (ry * ry);
                p += (ry * ry) + px - py;
            }
            elipsPlotPoints(x, y);
        }
    }

//    public static void main(String[] args) {
//        Titik pusat = new Titik(200, 0);
//        Elips e = new Elips(pusat, 100, 50, Color.RED, new int[]{1, 2, 3, 4});
//        e.buatGambar();
//        tampilkan("latihan elips");
//    }

}

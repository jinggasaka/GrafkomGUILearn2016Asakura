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
public class Lingkaran extends Grafkom {

    Titik pusat;
    int radius;
    Color warna;
    int[] s;

    public Lingkaran(Titik pusat, int radius, Color warna) {
        this.pusat = pusat;
        this.radius = radius;
        this.warna = warna;
    }

    public Lingkaran(Titik pusat, int radius, Color warna, int[] s) {
        this.pusat = pusat;
        this.radius = radius;
        this.warna = warna;
        this.s = s;
    }

    void circlePlotPoints(int x, int y) {
        for (int i = 0; i <= s.length - 1; i++) {
            if (s[i] == 1) {
                if ((pusat.x + x < Grafkom.lebar && pusat.x + x >= 0) && (pusat.y - y < Grafkom.tinggi && pusat.y - y >= 0)) {
                    myImage.setRGB(pusat.x + x, pusat.y - y, warna.getRGB());
                }
            }//1
            if (s[i] == 2) {
                if ((pusat.x + x < Grafkom.lebar && pusat.x + x >= 0) && (pusat.y - x < Grafkom.tinggi && pusat.y - x >= 0)) {
                    myImage.setRGB(pusat.x + y, pusat.y - x, warna.getRGB());
                }
            }//2
            if (s[i] == 4) {
                if ((pusat.x + y < Grafkom.lebar && pusat.x + y >= 0) && (pusat.y + x < Grafkom.tinggi && pusat.y + x >= 0)) {
                    myImage.setRGB(pusat.x + y, pusat.y + x, warna.getRGB());
                }
            }//4
            if (s[i] == 5) {
                if ((pusat.x + x < Grafkom.lebar && pusat.x + x >= 0) && (pusat.y + y < Grafkom.tinggi && pusat.y + y >= 0)) {
                    myImage.setRGB(pusat.x + x, pusat.y + y, warna.getRGB());
                }
            }//5
            if (s[i] == 7) {
                if ((pusat.x - x < Grafkom.lebar && pusat.x - x >= 0) && (pusat.y + y < Grafkom.tinggi && pusat.y + y >= 0)) {
                    myImage.setRGB(pusat.x - x, pusat.y + y, warna.getRGB());
                }
            }//7
            if (s[i] == 8) {
                if ((pusat.x - y < Grafkom.lebar && pusat.x - y >= 0) && (pusat.y + x < Grafkom.tinggi && pusat.y + x >= 0)) {
                    myImage.setRGB(pusat.x - y, pusat.y + x, warna.getRGB());
                }
            }//8
            if (s[i] == 10) {
                if ((pusat.x - y < Grafkom.lebar && pusat.x - y >= 0) && (pusat.y - x < Grafkom.tinggi && pusat.y - x >= 0)) {
                    myImage.setRGB(pusat.x - y, pusat.y - x, warna.getRGB());
                }
            }//10
            if (s[i] == 11) {
                if ((pusat.x - x < Grafkom.lebar && pusat.x - x >= 0) && (pusat.y - y < Grafkom.tinggi && pusat.y - y >= 0)) {
                    myImage.setRGB(pusat.x - x, pusat.y - y, warna.getRGB());
                }
            }//11
        }
    }

    void buatGambar() {
        int x, y, p;
        x = 0;
        y = radius;
        p = 1 - radius;
        circlePlotPoints(x, y);
        while (x < y) {
            x++;
            if (p < 0) {
                p += 2 * x + 1;
            } else {
                y -= 1;
                p += 2 * (x - y) + 1;
            }
            circlePlotPoints(x, y);
        }
    }

    public static void buatA() {
        new Lingkaran(new Titik(200, 100), 50, Color.RED, new int[]{1, 2, 10, 11}).buatGambar();
        new Lingkaran(new Titik(200, 100), 20, Color.RED, new int[]{1, 2, 10, 11}).buatGambar();
        new Lingkaran(new Titik(190, 148), 40, Color.RED, new int[]{1, 10, 11}).buatGambar();
        new Lingkaran(new Titik(190, 148), 40, Color.RED, new int[]{1, 10, 11}).buatGambar();
        new Lingkaran(new Titik(190, 143), 40, Color.RED, new int[]{5}).buatGambar();
        new Lingkaran(new Titik(165, 168), 15, Color.RED, new int[]{7, 8}).buatGambar();
        new Garis(new Titik(150, 100), new Titik(180, 100), Color.BLACK).buatGambarDDA();
        new Garis(new Titik(220, 100), new Titik(220, 120), Color.BLACK).buatGambarDDA();
        new Garis(new Titik(220, 170), new Titik(220, 183), Color.BLACK).buatGambarDDA();
        new Garis(new Titik(250, 100), new Titik(250, 183), Color.BLACK).buatGambarDDA();
        new Garis(new Titik(220, 183), new Titik(250, 183), Color.BLACK).buatGambarDDA();
        new Garis(new Titik(166, 183), new Titik(189, 183), Color.BLACK).buatGambarDDA();
        new Garis(new Titik(150, 148), new Titik(150, 170), Color.BLACK).buatGambarDDA();
    }

    public static void buatN() {
        new Lingkaran(new Titik(360, 110), 60, Color.RED, new int[]{1, 2}).buatGambar();
        new Lingkaran(new Titik(360, 110), 30, Color.RED, new int[]{1, 2, 10, 11}).buatGambar();
        Titik[] n = new Titik[]{new Titik(330, 50), new Titik(300, 50), new Titik(300, 183), new Titik(330, 183), new Titik(330, 110)};
        new Polyline(n).buatGambarnya();
        new Garis(new Titik(330, 50), new Titik(330, 70), Color.BLACK).buatGambarDDA();
        new Garis(new Titik(330, 70), new Titik(360, 50), Color.BLACK).buatGambarDDA();
        Titik[] n2 = new Titik[]{new Titik(390, 110), new Titik(390, 183), new Titik(420, 183), new Titik(420, 110)};
        new Polyline(n2).buatGambarnya();
    }

    public static void main(String[] args) {
//        Lingkaran pacman = new Lingkaran(new Titik(100, 100), 50, Color.RED, new int[]{1, 5, 7, 8, 10, 11});
//        pacman.buatGambar();
//
//        Titik[] t = new Titik[]{new Titik(135, 65), new Titik(100, 100), new Titik(135, 135)};
//        Polyline mulut = new Polyline(t);
//        mulut.buatGambarnya();
//
//        Lingkaran mata = new Lingkaran(new Titik(100, 75), 5, Color.RED, new int[]{1, 2, 4, 5, 7, 8, 10, 11});
//        mata.buatGambar();
//
//        buatA();
//        buatN();
        ////////////////////CONTOH BISA DI LUAR KOTAK
        for (int i = 0; i < 300; i++){
        Lingkaran mata = new Lingkaran(new Titik(100, 70), i, Color.RED, new int[]{1, 2, 4, 5, 7, 8, 10, 11});
        mata.buatGambar();}
        tampilkan("lingkaran");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafkom2016;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author praktikan
 */
public class Garis extends Grafkom {

    Titik titikAwal;
    Titik titikAkhir;
    Color werno;

    public Garis() {

    }

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Garis(Titik titikAwal, Titik titikAkhir, Color werno) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        this.werno = werno;
    }

    void buatGambarDDA() {
        double step;
        double dx, dy, x_inc, y_inc;
        double x, y;
        Titik t;
        if (titikAwal.x != titikAkhir.x || titikAwal.y != titikAkhir.y) {
            dx = titikAkhir.x - titikAwal.x;
            dy = titikAkhir.y - titikAwal.y;
            x = titikAwal.x;
            y = titikAwal.y;
            t = new Titik((int) x, (int) y, werno);
            if (Math.abs(dx) > Math.abs(dy)) {
                step = (int) Math.round(Math.abs(dx));
            } else {
                step = (int) Math.round(Math.abs(dy));
            }
            x_inc = dx / step;
            y_inc = dy / step;
            t.buatGambar();
            for (int i = 1; i <= step; i++) {
                x += x_inc;
                y += y_inc;
                t.x = (int) x;
                t.y = (int) y;
                t.buatGambar();
            }
        }
    }

    static void gambarBg() {
        for (int i = 1; i <= myImage.getWidth(); i += 2) {
            new Garis(new Titik(i, 0), new Titik(i, myImage.getHeight() - 1), new Color(255, 245, 130)).buatGambarDDA();
        }
    }

    static void buatGambarA() {
        int a1x1 = 75;
        int a1y1 = 480;
        int a1x2;
        int a1y2 = 30;
        for (a1x2 = 300; a1x2 <= 525; a1x2 += 1) {
            new Garis(new Titik(a1x1, a1y1), new Titik(a1x2, a1y2), new Color(166, 212, 174)).buatGambarDDA();
            a1x1 += 2;
            a1y2 += 2;
//            System.out.println(a1x1+" "+a1y1+" "+a1x2+" "+a1y2);
        }

//        int a2x1 = 330 + 160;
//        int a2y1 = 512;
//        int a2x2 = 159 + 160;
//        int a2y2 = 170;
//        for (a2x2 = 319; a2x2 >= 148; a2x2 -= 1) {
//            new Garis(new Titik(a2x1, a2y1), new Titik(a2x2, a2y2), new Color(75, 141, 127)).buatGambarDDA();
//            a2x1 -= 2;
//            a2y2 += 2;
////            System.out.println(a2x1 + " " + a2y1 + " " + a2x2 + " " + a2y2);
//        }

    }

    static void buatGambarM() {

        new Garis(new Titik(600, 30), new Titik(600, 480), Color.BLACK).buatGambarDDA();
        new Garis(new Titik(600, 480), new Titik(825, 480), Color.BLACK).buatGambarDDA();
        new Garis(new Titik(600, 30), new Titik(825, 480), Color.BLACK).buatGambarDDA();

        int m1x1 = 630;
        int m1y1 = 90;
        int m1x2 = 841;
        int m1y2;
        for (m1y2 = 512; m1y2 >= 91; m1y2 -= 2) {
            new Garis(new Titik(m1x1, m1y1), new Titik(m1x2, m1y2), new Color(185, 204, 188)).buatGambarDDA();
//            System.out.println(m1x1 + " " + m1y1 + " " + m1x2 + " " + m1y2);
            m1x1 += 2;
            m1x2 += 1;
        }

        int m2x1;
        int m2y1 = 480;
        int m2x2 = 1083;
        int m2y2 = 30;
        for (m2x1 = 858; m2x1 <= 1083; m2x1 += 2) {
            new Garis(new Titik(m2x1, m2y1), new Titik(m2x2, m2y2), new Color(98, 195, 208)).buatGambarDDA();
//            System.out.println(m2x1 + " " + m2y1 + " " + m2x2 + " " + m2y2);
            m2y2 += 4;

        }

    }

//    public static void main(String[] args) {
//        gambarBg();
//        buatGambarA();
//        buatGambarM();
//        tampilkan("Uji Coba");
//
//    }

}

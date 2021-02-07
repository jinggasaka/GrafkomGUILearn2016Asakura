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
public class Titik extends Grafkom {

    int x, y;
    Color warna = Color.BLACK;

    //konstruktor x y warna
    public Titik(int x, int y, Color warna) {
        this.x = x;
        this.y = y;
        this.warna = warna;
    }

    /**
     *
     * @param x mendefinisikan posisi di garis x
     * @param y mendefinisakan posisi di garis y
     *
     * konstruktor posisi tanpa warna
     */
    public Titik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * konstruktor kosong, digunakan ketika kita ingin membuat titik yang tidak
     * kita ketahui posisi x, y, dan warna dari titik tersebut
     */
    public Titik() {

    }

    /**
     * meletakkan titik di dalam kanvas
     */
    void buatGambar() {
        if ((x < Grafkom.lebar && x >= 0) && (y < Grafkom.tinggi && y >= 0)) {
            myImage.setRGB(x, y, warna.getRGB());
        }
    }

    /**
     * menggambar banyak buat titik di layar
     */
    void cobaTitik() {
        Titik t = new Titik(10, 20, Color.RED);
        t.buatGambar();
        // Titik t1 = new Titik(20, 10, Color.BLUE);
        // t1.buatGambar();
        Titik t2 = new Titik(11, 20, Color.RED);
        t2.buatGambar();
        Titik t3 = new Titik(12, 20, Color.RED);
        t3.buatGambar();
        Titik t4 = new Titik(13, 20, Color.RED);
        t4.buatGambar();
        Titik t5 = new Titik(14, 20, Color.RED);
        t5.buatGambar();
        Titik t6 = new Titik(15, 20, Color.RED);
        t6.buatGambar();
        Titik t7 = new Titik(16, 20, Color.RED);
        t7.buatGambar();
        Titik t8 = new Titik(17, 20, Color.RED);
        t8.buatGambar();
        Titik t9 = new Titik(18, 20, Color.RED);
        t9.buatGambar();
        Titik t10 = new Titik(19, 20, Color.RED);
        t10.buatGambar();
        Grafkom.tampilkan("Test");
    }

    /**
     *
     */
    static void buatGaris() {
        for (int i = -10; i <= 200; i++) {
            Titik t = new Titik(i, 20, Color.RED);
            t.buatGambar();
        }
        Grafkom.tampilkan("Test");
    }

    static void buatGarisPt(int batas) {
        for (int i = 10; i <= batas; i += 10) {
            for (int j = i; j <= batas; j += 10) {
                Titik t1 = new Titik(i, j, Color.RED);
                t1.buatGambar();
            }
        }
        Grafkom.tampilkan("Tugas");
    }

    public static void main(String[] args) {
        buatGaris();
    }
}

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
public class Animasi extends Grafkom {

    static void gambarOrang() {
        //kepala
        Titik kepala = new Titik(600, 200);
        Lingkaran kepala1 = new Lingkaran(kepala, 30, Color.black, new int[]{1, 2, 4, 5, 7, 8,10,11});
        kepala1.buatGambar();
        //badan
        new Garis(new Titik(600, 230), new Titik(600, 300), Color.black).buatGambarDDA();
        //tangan
        new Garis(new Titik(600, 265), new Titik(560, 265), Color.black).buatGambarDDA();
        //pancing
        new Garis(new Titik(560, 265), new Titik(500, 200), Color.black).buatGambarDDA();
        new Garis(new Titik(500, 200), new Titik(450, 500), Color.black).buatGambarDDA();

    }
    static void gambarPutriDuyungTiduran() {
        //kepala
        Titik kepaladuyung = new Titik(500, 175);
        Lingkaran kepaladuyung1 = new Lingkaran(kepaladuyung, 30, Color.red, new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        kepaladuyung1.buatGambar();

        Titik badanduyung = new Titik(600, 200);
        Lingkaran badanduyung1 = new Lingkaran(badanduyung, 100, Color.black, new int[]{6});
        badanduyung1.buatGambar();

//    Titik pusat3 = new Titik(620, 275);
//    Elips a3 = new Elips(pusat3, 100, 30, Color.pink, new int[]{1,2,3,4});
//    a3.buatGambar();
        Titik badanduyungtengah = new Titik(500, 205);
        Lingkaran badanduyungtgh1 = new Lingkaran(badanduyungtengah, 70, Color.black, new int[]{4});
        badanduyungtgh1.buatGambar();

        Titik kaki = new Titik(440, 360);
        Lingkaran kaki1 = new Lingkaran(kaki, 150, Color.black, new int[]{2, 3});
        kaki1.buatGambar();

        Titik kaki2 = new Titik(650, 270);
        Lingkaran kaki22 = new Lingkaran(kaki2, 150, Color.black, new int[]{6, 5});
        kaki22.buatGambar();

        //ekor
        new Garis(new Titik(545, 465), new Titik(650, 420), Color.blue).buatGambarDDA();

        Titik boobs = new Titik(500, 230);
        Lingkaran boobs1 = new Lingkaran(boobs, 5, Color.red, new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        boobs1.buatGambar();

        Titik boobs11 = new Titik(510, 228);
        Lingkaran boobs111 = new Lingkaran(boobs11, 5, Color.red, new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        boobs111.buatGambar();

        new Garis(new Titik(450, 300), new Titik(500, 220), Color.blue).buatGambarDDA();
        new Garis(new Titik(650, 250), new Titik(500, 220), Color.blue).buatGambarDDA();

    }

    static void mahkota() {
        new Garis(new Titik(200, 500), new Titik(100, 100), Color.blue).buatGambarDDA();
        new Garis(new Titik(100, 100), new Titik(200, 200), Color.blue).buatGambarDDA();
        new Garis(new Titik(200, 200), new Titik(300, 50), Color.blue).buatGambarDDA();
        new Garis(new Titik(300, 50), new Titik(400, 200), Color.blue).buatGambarDDA();
        new Garis(new Titik(500, 100), new Titik(400, 200), Color.blue).buatGambarDDA();
        new Garis(new Titik(500, 100), new Titik(400, 500), Color.blue).buatGambarDDA();
        new Garis(new Titik(200, 500), new Titik(400, 500), Color.blue).buatGambarDDA();
        //new Garis(new Titik(450, 300), new Titik(500, 220), Color.blue).buatGarisDDA();
    }

    static void gambarraja() {
        //kepala
        Titik kepaladuyung = new Titik(500, 175);
        Lingkaran kepaladuyung1 = new Lingkaran(kepaladuyung, 30, Color.red, new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        kepaladuyung1.buatGambar();

        Titik badanduyung = new Titik(600, 200);
        Lingkaran badanduyung1 = new Lingkaran(badanduyung, 100, Color.black, new int[]{6});
        badanduyung1.buatGambar();

//    Titik pusat3 = new Titik(620, 275);
//    Elips a3 = new Elips(pusat3, 100, 30, Color.pink, new int[]{1,2,3,4});
//    a3.buatGambar();
        Titik badanduyungtengah = new Titik(500, 205);
        Lingkaran badanduyungtgh1 = new Lingkaran(badanduyungtengah, 70, Color.black, new int[]{4});
        badanduyungtgh1.buatGambar();

        Titik kaki = new Titik(440, 360);
        Lingkaran kaki1 = new Lingkaran(kaki, 150, Color.black, new int[]{2, 3});
        kaki1.buatGambar();

        Titik kaki2 = new Titik(650, 270);
        Lingkaran kaki22 = new Lingkaran(kaki2, 150, Color.black, new int[]{6, 5});
        kaki22.buatGambar();

        //ekor
        new Garis(new Titik(545, 465), new Titik(650, 420), Color.blue).buatGambarDDA();

        new Garis(new Titik(450, 300), new Titik(500, 220), Color.blue).buatGambarDDA();
        new Garis(new Titik(650, 250), new Titik(500, 220), Color.blue).buatGambarDDA();

    }
    static void gambarKapal() {
        
        for (int i = 0; i < 300; i++) {
            Titik p = new Titik(900, 300);
            Elips h = new Elips(p, 100+i, i, Color.ORANGE, new int[]{2, 3});
            h.buatGambar();
        }
        
         for (int i = 0; i < 200; i++) {
                new Garis(new Titik(700, 100+i), new Titik(1200, 100+i), Color.YELLOW).buatGambarDDA();
         }
        
    }

    static void gambarLaut() {
        for (int a = 0; a < 200; a++) {
            Titik pusat = new Titik(100, 500 + a);
            Elips e = new Elips(pusat, 100, 30, Color.BLUE, new int[]{1, 4});
            e.buatGambar();

            Titik p = new Titik(300, 500 + a);
            Elips f = new Elips(p, 100, 30, Color.BLUE, new int[]{2, 3});
            f.buatGambar();

            Titik p1 = new Titik(500, 500 + a);
            Elips g = new Elips(p1, 100, 30, Color.BLUE, new int[]{1, 4});
            g.buatGambar();

            Titik p2 = new Titik(700, 500 + a);
            Elips h = new Elips(p2, 100, 30, Color.BLUE, new int[]{2, 3});
            h.buatGambar();

            Titik p3 = new Titik(900, 500 + a);
            Elips i = new Elips(p3, 100, 30, Color.BLUE, new int[]{1, 4});
            i.buatGambar();

            Titik p4 = new Titik(1100, 500 + a);
            Elips j = new Elips(p4, 100, 30, Color.BLUE, new int[]{2, 3});
            j.buatGambar();
        }

    }

    static void gambarMatahari() {
        ////////////////////CONTOH BISA DI LUAR KOTAK
        for (int i = 0; i < 100; i++) {
            Lingkaran mata = new Lingkaran(new Titik(100, 70), i, Color.RED, new int[]{1, 2, 4, 5, 7, 8, 10, 11});
            mata.buatGambar();
        }
        tampilkan("lingkaran");
    }

    public static void main(String[] args) {
        gambarMatahari();
        gambarKapal();
        gambarOrang();
        gambarLaut();
        tampilkan("Animasi");

    }
}

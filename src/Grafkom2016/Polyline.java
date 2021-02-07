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
public class Polyline extends Grafkom {

    Titik[] titik;

    public Polyline(Titik[] titik) {
        this.titik = titik;
    }

    void buatGambarnya() {
        for (int i = 0; i < titik.length - 1; i++) {
            new Garis(titik[i], titik[i + 1], Color.BLUE).buatGambarDDA();
        }
    }

    void buatGambarnya(Color c) {
        for (int i = 0; i < titik.length - 1; i++) {
            new Garis(titik[i], titik[i + 1], c).buatGambarDDA();
        }
    }

    void buatGambarnyaBW() {
        for (int i = 0; i < titik.length - 1; i++) {
            new Garis(titik[i], titik[i + 1], titik[i].warna).buatGambarDDA();
        }
    }

//    public static void main(String[] args) {
////        Titik[]t=new Titik[7];
////        t[0]=new Titik(75, 150);
////        t[1]=new Titik(75, 100);
////        t[2]=new Titik(50, 100);
////        t[3]=new Titik(100, 50);
////        t[4]=new Titik(150, 100);
////        t[5]=new Titik(125, 100);
////        t[6]=new Titik(125, 150);
////        
//        Titik[]a=new Titik[9];
//        a[0]=new Titik(226, 92);
//        a[1]=new Titik(200, 161);
//        a[2]=new Titik(222, 161);
//        a[3]=new Titik(225, 150);
//        a[4]=new Titik(250, 150);
//        a[5]=new Titik(253, 161);
//        a[6]=new Titik(275, 161);
//        a[7]=new Titik(250, 92);
//        a[8]=new Titik(226, 92);
////        
//        Titik[]a2=new Titik[4];
//        a2[0]=new Titik(230, 135);
//        a2[1]=new Titik(245, 135);
//        a2[2]=new Titik(237, 110);
//        a2[3]=new Titik(230, 135);
////        
////        Titik[]n=new Titik[11];
////        n[0]=new Titik(282, 92);
////        n[1]=new Titik(282, 161);
////        n[2]=new Titik(302, 161);
////        n[3]=new Titik(302, 123);
////        n[4]=new Titik(328, 161);
////        n[5]=new Titik(348, 161);
////        n[6]=new Titik(348, 92);
////        n[7]=new Titik(328, 92);
////        n[8]=new Titik(328, 130);
////        n[9]=new Titik(302, 92);
////        n[10]=new Titik(282, 92);
////        
////        Polyline p = new Polyline(a);
//        Polyline q = new Polyline(a2);
////        Polyline g = new Polyline(n);
////        
////        p.buatGambarnya();
//        q.buatGambarnya();
////        g.buatGambarnya();
//
//        Polyline w1 = new Polyline(a);
//        w1.buatGambarnya(Color.RED);
//
////        Titik[] n = new Titik[11];
////        n[0] = new Titik(282, 92, Color.WHITE);
////        n[1] = new Titik(282, 161, Color.BLUE);
////        n[2] = new Titik(302, 161, Color.CYAN);
////        n[3] = new Titik(302, 123, Color.RED);
////        n[4] = new Titik(328, 161, Color.YELLOW);
////        n[5] = new Titik(348, 161, Color.GREEN);
////        n[6] = new Titik(348, 92, Color.LIGHT_GRAY);
////        n[7] = new Titik(328, 92, Color.MAGENTA);
////        n[8] = new Titik(328, 130, Color.ORANGE);
////        n[9] = new Titik(302, 92, Color.PINK);
////        n[10] = new Titik(282, 92, Color.BLACK);
////
////        Polyline w2 = new Polyline(n);
////        w2.buatGambarnyaBW();
//
//        tampilkan("Polyline");
//    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafkom2016;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author praktikan
 */
public class Grafkom extends JPanel {

    static int tinggi = 600;
    static int lebar = 1200;
    static BufferedImage myImage = new BufferedImage(lebar, tinggi, BufferedImage.TYPE_INT_ARGB);

    public Dimension getPreferredSize() {
        return new Dimension(myImage.getWidth(), myImage.getHeight());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(myImage, null, null);
    }

    static public void tampilkan(String judul) {
        JFrame frame = new JFrame(judul);
        Grafkom panel = new Grafkom();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

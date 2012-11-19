/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.imageio.stream.*;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class ImagePanel extends JPanel {

    private BufferedImage logo;

    /** Creates a new instance of ImagePanel */
    public ImagePanel() {
        try {
// buka file. Cari file gambar lain di computer anda
            File img = new File("coba.jpg");
// baca image
            logo = ImageIO.read(img);
//img.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        g.drawImage(logo,
                90, 90, 480, 360,
                0, 0, logo.getWidth(null), logo.getHeight(null),
                null);
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("Using Java2D");
        frame.setLayout(new BorderLayout());
        ImagePanel gc = new ImagePanel();
        frame.add(gc, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 550);
        frame.setVisible(true);
    }
}

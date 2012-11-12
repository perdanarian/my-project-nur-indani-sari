/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.imageio.stream.*;
import javax.swing.*;
/**
 *
 * @author Asus
 */
public class Mobil extends JPanel {

    public Mobil() {
        setBackground(Color.white);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.setColor(Color.BLUE);
//        g.drawLine(0, 10, 50, 60);
        g.setColor(Color.red);
        g.drawRect(10, 10, 300, 200);
        g.setColor(Color.yellow);
         g.drawRect(310, 60, 150, 150);
         g.setColor(Color.red);
          g.drawRect(30, 30, 50, 50);
          g.setColor(Color.green);
           g.drawRect(90, 30, 50, 50);
           g.setColor(Color.blue);
            g.drawRect(150, 30, 50, 50);
            g.setColor(Color.red);
             g.drawRect(210, 30, 70, 100);
             g.setColor(Color.pink);
//        g.setColor(new Color(255, 0, 0));
//        g.fillOval(100, 10, 50, 50);
//        g.setColor(new Color(0, 255, 0));
//        g.fillArc(150, 10, 50, 50, 0, 180);
        Graphics2D g2 = (Graphics2D) g;
// fill RoundRectangle2D.Double
//        GradientPaint redtowhite = new GradientPaint(100, 20, Color.red, 300, 30, Color.black);
//        g2.setPaint(redtowhite);
//        g2.fill(new RoundRectangle2D.Double(400, 30, 80, 70, 100, 100));
////g2.setPaint();
//        g2.drawString("Filled RoundRectangle2D", 200, 80);
//        g2.drawRect(300, 50, 100, 100);
//        g2.setColor(Color.red);
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("Grafik 2 Dimensi");
        frame.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setLayout(new BorderLayout());
        Mobil shapePanel = new Mobil();
        frame.add(shapePanel, BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}

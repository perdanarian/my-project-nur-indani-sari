/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.view.PanelTambahFotoAnggota;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class TestPanelTambahFotoAnggota {
public static void main(String args[]) {
        JFrame frame = new JFrame("Using Java2D");
        frame.setLayout(new BorderLayout());
        PanelTambahFotoAnggota gc = new PanelTambahFotoAnggota();
        frame.add(gc, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}

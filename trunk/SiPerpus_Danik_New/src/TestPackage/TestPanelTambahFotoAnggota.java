/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.view.PanelTambahFotoAnggota;
import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class TestPanelTambahFotoAnggota {
    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        PanelTambahFotoAnggota testAnggota = new PanelTambahFotoAnggota();
        testFrame.getContentPane().add(testAnggota);
        testFrame.setSize(750, 700);
        testFrame.setVisible(true);
        testFrame.setTitle("PANEL TAMBAH FOTO ANGGOTA");
    }
}

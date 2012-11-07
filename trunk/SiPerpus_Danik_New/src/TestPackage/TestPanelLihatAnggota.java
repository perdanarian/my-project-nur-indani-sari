/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.Anggota;
import com.view.PanelLihatAnggota;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class TestPanelLihatAnggota {
 public static void main(String[] args) {
        ArrayList<Anggota> test1 = new ArrayList<Anggota>();
        Anggota test11 = new Anggota();
        try {
            test11.setIdAnggota("1234567890");
            test11.setNama("Pemrograman Java");
        } catch (Exception ex) {
            Logger.getLogger(TestPanelLihatAnggota.class.getName()).log(Level.SEVERE, null,
                    ex);
        }

        Anggota test12 = new Anggota();
        try {
            test12.setIdAnggota("1234567891");
            test12.setNama("Struktur Data");
        } catch (Exception ex) {
            Logger.getLogger(TestPanelLihatAnggota.class.getName()).log(Level.SEVERE, null,
                    ex);
        }

        test1.add(test11);
        test1.add(test12);

        JFrame test = new JFrame();
        PanelLihatAnggota ptk = new PanelLihatAnggota(test1);
        test.getContentPane().add(ptk);
        test.setSize(350, 250);
        test.setVisible(true);
        test.setTitle("Panel Lihat Anggota");
    }
}

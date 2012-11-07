/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.Anggota;
import com.model.Pinjaman;
import com.model.Publikasi;
import com.view.PanelLihatPinjaman;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class TestPanelLihatPinjaman {
public static void main(String[] args) {
        ArrayList<Pinjaman> test1 = new ArrayList<Pinjaman>();
        Pinjaman test11 = new Pinjaman();
        Anggota agg = new Anggota();
        Publikasi pub = new Publikasi() {

            public int hitungDenda(int lamaPinjam) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        try {
            agg.setIdAnggota("1234567890");
            pub.setIdKoleksi("1212121212");

            test11.setPeminjam(agg);
            test11.setPublikasi(pub);
        } catch (Exception ex) {
            Logger.getLogger(TestPanelLihatPinjaman.class.getName()).log(Level.SEVERE, null,
                    ex);
        }

        Pinjaman test12 = new Pinjaman();
        Anggota agg1 = new Anggota();
        Publikasi pub1 = new Publikasi() {

            public int hitungDenda(int lamaPinjam) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        try {
            agg1.setIdAnggota("1234567891");
            pub1.setIdKoleksi("2121212121");
            test12.setPeminjam(agg1);
            test12.setPublikasi(pub1);
        } catch (Exception ex) {
            Logger.getLogger(TestPanelLihatPinjaman.class.getName()).log(Level.SEVERE, null,
                    ex);
        }

        test1.add(test11);
        test1.add(test12);

        JFrame test = new JFrame();
        PanelLihatPinjaman ptk = new PanelLihatPinjaman(test1);
        test.getContentPane().add(ptk);
        test.setSize(350, 250);
        test.setVisible(true);
        test.setTitle("Panel Lihat Anggota");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.Buku;
import com.model.Publikasi;
import com.view.PanelLihatPublikasi;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class TestPanelLihatPublikasi {

public static void main(String[] args) {
ArrayList<Publikasi> test1 = new ArrayList<Publikasi>();
Buku test11= new Buku();
try {
test11.setIdKoleksi("1234567890");
test11.setJudul("Pemrograman Java");
} catch (Exception ex) { Logger.getLogger(TestPanelLihatPublikasi.class.getName()).log(Level.SEVERE,	null,
ex);
}

Buku test12= new Buku();
try {
test12.setIdKoleksi("1234567891");
test12.setJudul("Struktur Data");
} catch (Exception ex) { Logger.getLogger(TestPanelLihatPublikasi.class.getName()).log(Level.SEVERE,	null,
ex);
}

test1.add(test11);
test1.add(test12);

JFrame test = new JFrame();
PanelLihatPublikasi ptk = new PanelLihatPublikasi(test1);
test.getContentPane().add(ptk);
test.setSize(350, 250); test.setVisible(true); test.setTitle("Panel Lihat Publikasi");
}
}

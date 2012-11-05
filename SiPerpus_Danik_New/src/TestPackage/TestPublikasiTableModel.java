/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.Buku;
import com.model.Publikasi;
import com.model.PublikasiTableModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class TestPublikasiTableModel {
public static void main(String[] args) {
ArrayList<Publikasi> test1 = new ArrayList<Publikasi>(); Buku test11= new Buku();
try { test11.setIdKoleksi("1234567890"); test11.setJudul("Pemrograman Java");
} catch (Exception ex) { Logger.getLogger(TestPublikasiTableModel.class.getName()).log(Level.SEVERE,	null,
ex);

}

Buku test12= new Buku();
try {
test12.setIdKoleksi("1234567891");
test12.setJudul("Struktur Data");
} catch (Exception ex) { Logger.getLogger(TestPublikasiTableModel.class.getName()).log(Level.SEVERE,	null,
ex);
}

test1.add(test11);
test1.add(test12);


PublikasiTableModel test2 = new PublikasiTableModel(test1);
System.out.println("idKoleksi	:"	+	test2.getValueAt(0,	0)+"	judul:" +test2.getValueAt(0, 1));
System.out.println("idKoleksi	:"	+	test2.getValueAt(1,	0)+"	judul:"+test2.getValueAt(1, 1));
}

}

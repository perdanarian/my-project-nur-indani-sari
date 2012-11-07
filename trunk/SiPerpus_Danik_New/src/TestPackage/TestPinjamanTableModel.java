/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.Anggota;
import com.model.Pinjaman;
import com.model.PinjamanTableModel;
import com.model.Publikasi;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class TestPinjamanTableModel {
public static void main(String[] args) {
ArrayList<Pinjaman> test1 = new ArrayList<Pinjaman>();
Pinjaman test11= new Pinjaman();
Anggota agg = new Anggota();
Publikasi pub = new Publikasi() {

            public int hitungDenda(int lamaPinjam) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };

try { agg.setIdAnggota("1234567890"); pub.setIdKoleksi("1122334455");
test11.setPeminjam(agg);
test11.setPublikasi(pub);
} catch (Exception ex) { Logger.getLogger(TestPinjamanTableModel.class.getName()).log(Level.SEVERE,	null,
ex);
}


Pinjaman test12= new Pinjaman();
Anggota agg1 = new Anggota();
Publikasi pub1 = new Publikasi() {

            public int hitungDenda(int lamaPinjam) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
try {
agg1.setIdAnggota("1234567891");
pub1.setIdKoleksi("5544332211");
test12.setPeminjam(agg1);
test12.setPublikasi(pub1);
} catch (Exception ex) { Logger.getLogger(TestPinjamanTableModel.class.getName()).log(Level.SEVERE,	null,
ex);
}

test1.add(test11);
test1.add(test12);


PinjamanTableModel test2 = new PinjamanTableModel(test1);
System.out.println("idAnggota	:"	+	test2.getValueAt(0,	0)+"	idKoleksi:" +test2.getValueAt(0, 1));
System.out.println("idggotaAn	:"	+	test2.getValueAt(1,	0)+"	idKoleksi:" +test2.getValueAt(1, 1));
}
}

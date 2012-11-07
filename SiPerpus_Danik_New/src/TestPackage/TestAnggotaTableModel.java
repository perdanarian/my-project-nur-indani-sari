/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.Anggota;
import com.model.AnggotaTableModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class TestAnggotaTableModel {
public static void main(String[] args) {
ArrayList<Anggota> test1 = new ArrayList<Anggota>();
Anggota test11= new Anggota();
try { test11.setIdAnggota("1234567890"); test11.setNama(" Java");
} catch (Exception ex) { Logger.getLogger(TestAnggotaTableModel.class.getName()).log(Level.SEVERE,	null,
ex);

}

Anggota test12= new Anggota();
try {
test12.setIdAnggota("1234567891");
test12.setNama("Struktur Data");
} catch (Exception ex) { Logger.getLogger(TestAnggotaTableModel.class.getName()).log(Level.SEVERE,	null,
ex);
}

test1.add(test11);
test1.add(test12);


AnggotaTableModel test2 = new AnggotaTableModel(test1);
System.out.println("idAnggota	:"	+	test2.getValueAt(0,	0)+"	nama:" +test2.getValueAt(0, 1));
System.out.println("idggotaAn	:"	+	test2.getValueAt(1,	0)+"	nama:" +test2.getValueAt(1, 1));
}

}

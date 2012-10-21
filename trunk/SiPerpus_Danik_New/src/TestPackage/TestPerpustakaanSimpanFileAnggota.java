/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.Anggota;
import com.model.Perpustakaan;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class TestPerpustakaanSimpanFileAnggota {
public static void main(String[] args) throws IOException {
    Anggota anggota1 = new Anggota();
try { anggota1.setIdAnggota("9876543210");
anggota1.setNama("jogiyanto");
} catch (Exception ex) {
Logger.getLogger(TestPerpustakaanSimpanFileAnggota.class.getName()
).log(Level.SEVERE, null, ex);
}
Anggota anggota2 = new Anggota();
try { anggota2.setIdAnggota("9876543211");
anggota2.setNama("jodi");
} catch (Exception ex) {
Logger.getLogger(TestPerpustakaanSimpanFileAnggota.class.getName()
).log(Level.SEVERE, null, ex);
}
Perpustakaan.tambahAnggota(anggota1);
Perpustakaan.tambahAnggota(anggota2);
Perpustakaan.simpanFileAnggota();
}
}

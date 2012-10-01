/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.Buku;
import com.model.Perpustakaan;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class TestPerpustakaanSimpanFilePublikasi {
public static void main(String[] args) throws IOException {
Buku buku1 = new Buku();
buku1.setIsbn("92-001");
try {
buku1.setIdKoleksi("9876543210");
} catch (Exception ex) {
Logger.getLogger(TestPerpustakaanSimpanFilePublikasi.class.getName
()).log(Level.SEVERE, null, ex);
}
buku1.setJudul("Orkom");
buku1.setPenerbit("Andi");
buku1.setPenulis("jogiyanto");
buku1.setTahun("2001");
Buku buku2 = new Buku();
buku2.setIsbn("92-002");
try {
buku2.setIdKoleksi("9876543211");
} catch (Exception ex) {
Logger.getLogger(TestPerpustakaanSimpanFilePublikasi.class.getName
()).log(Level.SEVERE, null, ex);
}
buku2.setJudul("Pemrograman Java");
buku2.setPenerbit("Andi");
buku2.setPenulis("jogiyanto");
buku2.setTahun("2001");
Perpustakaan.tambahPublikasi(buku1);
Perpustakaan.tambahPublikasi(buku2);
Perpustakaan.simpanFilePublikasi();
}
}

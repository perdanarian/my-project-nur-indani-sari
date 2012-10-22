/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.Anggota;
import com.model.Perpustakaan;
import com.model.Pinjaman;
import com.model.Publikasi;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class TestPerpustakaanSimpanFilePinjaman {
    public static void main(String[] args) throws IOException {
        Pinjaman pin = new Pinjaman();
        Anggota aa = new Anggota();
        Publikasi pp = new Publikasi() {

            public int hitungDenda(int lamaPinjam) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        aa.setIdAnggota("1122334455");
        pp.setIdKoleksi("5544332211");
        pin.setPeminjam(aa);
        pin.setPublikasi(pp);

        Pinjaman pin2 = new Pinjaman();
        Anggota ab = new Anggota();
        Publikasi pb = new Publikasi() {

            public int hitungDenda(int lamaPinjam) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        ab.setIdAnggota("1234512345");
        pb.setIdKoleksi("5432154321");
        pin2.setPeminjam(ab);
        pin2.setPublikasi(pb);
        Perpustakaan.tambahPinjaman(pin);
        Perpustakaan.tambahPinjaman(pin2);
        Perpustakaan.simpanFilePinjaman();
    }
}

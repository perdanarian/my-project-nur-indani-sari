/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.Anggota;
import com.model.Perpustakaan;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class TestCariAnggota {
    public static void main(String[] args) {
        Anggota test1 = new Anggota();
        test1.setIdAnggota("1234567007");
        test1.setNama("James Bond");

        Anggota test2 = new Anggota();
        test2.setIdAnggota("1234567008");
        test2.setNama("Saras");

        Anggota test3 = new Anggota();
        test3.setIdAnggota("1234567212");
        test3.setNama("Wiro Sableng");

        Perpustakaan.DAFTAR_ANGGOTA.add(test1);
        Perpustakaan.DAFTAR_ANGGOTA.add(test2);
        Perpustakaan.DAFTAR_ANGGOTA.add(test3);

        ArrayList<Anggota> test4 = Perpustakaan.cariAnggota("Saras");
        for (int i = 0; i < test4.size(); i++) {
            System.out.println("Nama = "+test4.get(i).getNama());

        }
    }
}

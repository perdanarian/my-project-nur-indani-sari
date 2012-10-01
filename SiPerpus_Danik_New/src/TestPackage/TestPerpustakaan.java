package TestPackage;
import com.model.Anggota;
import com.model.Perpustakaan;
import com.model.Buku;
import com.model.Pinjaman;
import com.model.Publikasi;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TestPerpustakaan {   
  public static void main (String args[])  {
      System.out.println("Nama Perpustakaan = " + Perpustakaan.NAMA);
      Anggota test2 = new Anggota();
      test2.setNama("Danik");
        try {
            test2.setIdAnggota("1234567890");
        } catch (Exception ex) {
            Logger.getLogger(TestPerpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
      Perpustakaan.tambahAnggota(test2);
      System.out.print("Daftar Anggota");
      System.out.println(Perpustakaan.bacaDaftarAnggota());
      Publikasi test = new Buku();
      test.setJudul("Biologi");
      test.setIdKoleksi("k11");
      test.setPenerbit("Erlangga");
      test.setPenulis("Toni");
      test.setTahun("1998");
      Perpustakaan.tambahPublikasi(test);
      System.out.print("Daftar Publikasi");
      System.out.println(Perpustakaan.bacaDaftarPublikasi());
      Date tanggalPinjam = new Date();
      tanggalPinjam.setDate(8);
      Date tanggalKembali = new Date();
      tanggalKembali.setDate(18);
      Pinjaman test5 = new Pinjaman();
      test5.setPeminjam(test2);
      test5.setPublikasi(test);
      test5.setTanggalPinjam(tanggalPinjam);
      test5.setTanggalKembali(tanggalKembali);
      Perpustakaan.tambahPinjaman(test5);
      System.out.print("Daftar Pinjaman");
      System.out.println(Perpustakaan.bacaDaftarPinjaman());}
} 

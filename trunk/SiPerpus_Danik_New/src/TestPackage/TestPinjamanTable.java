/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.Anggota;
import com.model.Perpustakaan;
import com.model.Pinjaman;
import com.model.Publikasi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Asus
 */
public class TestPinjamanTable {
public static void main(String[] args) throws SQLException {
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
            pub.setIdKoleksi("1122334455");
            test11.setPeminjam(agg);
            test11.setPublikasi(pub);
        } catch (Exception ex) {
            Logger.getLogger(TestPinjamanTable.class.getName()).log(Level.SEVERE, null,
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
            pub1.setIdKoleksi("0987654321");
            test1.add(test11);
            test1.add(test12);
        } catch (Exception ex) {
            Logger.getLogger(TestPinjamanTable.class.getName()).log(Level.SEVERE, null,
                    ex);
        }

       

        Perpustakaan.tambahTabelPinjaman(test11);
        Perpustakaan.tambahTabelPinjaman(test12);


        String jdbcUrl = "jdbc:oracle:thin:@172.23.9.185:1521:orcl";
        String userid = "MHS115314023"; // gantikan dengan username anda
        String password = "MHS115314023"; // gantikan dengan password anda

        Connection conn;
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, password);
            System.out.println("Koneksi is OK");
            java.sql.Statement statement = conn.createStatement();

            String sql = "select * from pinjaman";
            ResultSet result = statement.executeQuery(sql);

            while (result.next() == true) {
                System.out.println(result.getString(1) + " " + result.getString(2));
            }

        } catch (SQLException e) {
// perform error handling here
            System.out.println("error :" + e.getMessage());
        }

    }
}

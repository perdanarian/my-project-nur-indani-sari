/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.Anggota;
import com.model.Perpustakaan;
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
public class TestAnggotaTable {
public static void main(String[] args) throws SQLException {
        ArrayList<Anggota> test1 = new ArrayList<Anggota>();
        Anggota test11 = new Anggota();
        try {
            test11.setIdAnggota("1234567890");
            test11.setNama("Pemrograman Java");
        } catch (Exception ex) {
            Logger.getLogger(TestAnggotaTable.class.getName()).log(Level.SEVERE, null,
                    ex);
        }

        Anggota test12 = new Anggota();
        try {
            test12.setIdAnggota("1234567891");
            test12.setNama("Struktur Data");
        } catch (Exception ex) {
            Logger.getLogger(TestAnggotaTable.class.getName()).log(Level.SEVERE, null,
                    ex);
        }

        test1.add(test11);
        test1.add(test12);

        Perpustakaan.tambahTabelAnggota(test11);
        Perpustakaan.tambahTabelAnggota(test12);


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

            String sql = "select * from anggota";
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

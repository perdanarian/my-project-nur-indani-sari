/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.model.Buku;
import com.model.Perpustakaan;
import com.model.Publikasi;
import java.beans.Statement;
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
public class TestPublikasiTable {
public static void main(String[] args) throws SQLException {
ArrayList<Publikasi> test1 = new ArrayList<Publikasi>();
Buku test11= new Buku();
try {
test11.setIdKoleksi("1234567890");
test11.setJudul("Pemrograman Java");
} catch (Exception ex) { Logger.getLogger(TestPublikasiTable.class.getName()).log(Level.SEVERE,	null,
ex);
}

Buku test12= new Buku();
try {
test12.setIdKoleksi("1234567891");
test12.setJudul("Struktur Data");
} catch (Exception ex) { Logger.getLogger(TestPublikasiTable.class.getName()).log(Level.SEVERE,	null,
ex);
}

test1.add(test11);
test1.add(test12);

Perpustakaan.tambahTabelPublikasi(test11);
Perpustakaan.tambahTabelPublikasi(test12);


String jdbcUrl = "jdbc:oracle:thin:@172.23.9.185:1521:orcl"; String userid = "hr"; // gantikan dengan username anda
String password = "hr"; // gantikan dengan password anda

Connection conn;
try {
OracleDataSource ds;
ds = new OracleDataSource();
ds.setURL(jdbcUrl);
conn = ds.getConnection(userid, password);
System.out.println("Koneksi is OK");
java.sql.Statement statement = conn.createStatement();

String sql = "select * from publikasi";
ResultSet result= statement.executeQuery(sql);

while(result.next()==true){
System.out.println(result.getString(1)+" "+result.getString(2));
}

} catch (SQLException e) {
// perform error handling here
System.out.println("error :"+ e.getMessage());
}

}

}

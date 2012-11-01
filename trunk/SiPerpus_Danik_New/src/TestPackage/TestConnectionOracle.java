/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

/**
 *
 * @author Asus
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;

public class TestConnectionOracle {

public static void main(String[] args) {
// jdbc:oracle:thin merupaka jenis JDBC
// angka 172.23.9.185 merupakan IP server oracle
// angka 1521 menunjukkan port server Oracle yang bisa diakses
// orcl merupakan nama listener server database oracle
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


String sql = "select * from regions";
Statement statement = conn.createStatement();
ResultSet result= statement.executeQuery(sql);

while(result.next()==true){ System.out.println(result.getInt(1)+" "+result.getString(2));
}

} catch (SQLException e) {
// perform error handling here
System.out.println("error :"+ e.getMessage());
}

}
}


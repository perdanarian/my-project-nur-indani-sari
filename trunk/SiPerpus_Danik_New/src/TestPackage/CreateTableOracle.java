/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Asus
 */
public class CreateTableOracle {
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
conn = ds.getConnection(userid, password); System.out.println("Koneksi is OK");
Statement statement = conn.createStatement();


String sql = " CREATE table ANGGOTA ( IDANGGOTA VARCHAR2(10) NOT NULL,NAMA	VARCHAR2(100) NOT NULL, "
        + "constraint	ANGGOTA_PK primary key (IDANGGOTA) ENABLE)";

statement.executeUpdate(sql);
String sql1 = " CREATE TABLE	PUBLIKASI(	IDKOLEKSI VARCHAR2(10),"
        + "JUDUL VARCHAR2(200), PENULIS VARCHAR2(100), PENERBIT VARCHAR2(100), TAHUN NUMBER,"
        + ", CONSTRAINT PUBLIKASI_PK PRIMARY KEY ( IDKOLEKSI ) ENABLE)";

statement.executeUpdate(sql1);

String sql2 = " CREATE TABLE	PINJAMAN (	IDANGGOTA VARCHAR2(10),IDKOLEKSI VARCHAR2(10),"
        + "TGL_PINJAM DATE, TGL_KEMBALI DATE,CONSTRAINT PINJAMAN_PK PRIMARY KEY (IDANGGOTA, "
        + "IDKOLEKSI) ENABLE, CONSTRAINT PINJAMAN_FK1 FOREIGN KEY (IDANGGOTA)"
        + "REFERENCES	ANGGOTA (IDANGGOTA) ON DELETE CASCADE ENABLE, "
        + "CONSTRAINT PINJAMAN_FK2 FOREIGN KEY (IDKOLEKSI) REFERENCES	"
        + "PUBLIKASI (IDKOLEKSI) ON DELETE CASCADE ENABLE)";

statement.executeUpdate(sql2);


} catch (SQLException e) {
// perform error handling here
System.out.println("error :"+ e.getMessage());
}

}

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Asus
 */
public class OraConnection {
public static Connection open(String url,String userId,String password){

//	String url = String koneksi ke server oracle
//	String userid = username
//	String password = password user oracle

Connection conn=null;
try {
OracleDataSource ds;
ds = new OracleDataSource();
ds.setURL(url);
conn = ds.getConnection(userId, password);
System.out.println("Koneksi is OK");
} catch (SQLException e) {
// perform error handling here
System.out.println("error :"+ e.getMessage());
}

return conn;
}

}

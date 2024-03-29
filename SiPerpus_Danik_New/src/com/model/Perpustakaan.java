package com.model;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Perpustakaan {
    private TimerBacaPublikasi TIMER_BACA_PUBLIKASI;
    private TimerSimpanPublikasi TIMER_SIMPAN_PUBLIKASI;
    public static String NAMA = "PERPUSTAKAAN KU";
    public static ArrayList <Publikasi> DAFTAR_PUBLIKASI = new ArrayList<Publikasi>();
    public static ArrayList <Anggota> DAFTAR_ANGGOTA = new ArrayList<Anggota>();
    public static ArrayList <Pinjaman> DAFTAR_PINJAMAN = new ArrayList<Pinjaman>();
    public static void tambahPublikasi (Publikasi publikasi){
        DAFTAR_PUBLIKASI.add(publikasi);}
    public static void tambahAnggota (Anggota anggota) {
       DAFTAR_ANGGOTA.add(anggota); }
    public static void tambahPinjaman (Pinjaman pinjaman) {
        DAFTAR_PINJAMAN.add(pinjaman);}
    public  static String bacaDaftarPublikasi () {
        if (DAFTAR_PUBLIKASI.isEmpty() == false){
            String hasil = new String();
            for (int i = 0; i < DAFTAR_PUBLIKASI.size(); i++) {
                hasil +="\n*Judul      : " +DAFTAR_PUBLIKASI.get(i).getJudul() + "\n";
                hasil += " Id koleksi : " +DAFTAR_PUBLIKASI.get(i).getIdKoleksi() + "\n";
                hasil += " Penulis    : " +DAFTAR_PUBLIKASI.get(i).getPenulis() + "\n";
                hasil += " Penerbit   : " +DAFTAR_PUBLIKASI.get(i).getPenerbit() + "\n";
                hasil += " Tahun      : " +DAFTAR_PUBLIKASI.get(i).getTahun();}
            return hasil;}
        return "kosong";
    }
    public static String bacaDaftarAnggota () {
        if (DAFTAR_ANGGOTA.isEmpty() == false){
            String hasil = new String();
            for (int i = 0; i < DAFTAR_ANGGOTA.size(); i++) {
                hasil += "\n*Nama       : " +DAFTAR_ANGGOTA.get(i).getNama() + "\n";
                hasil += " Id Anggota : " +DAFTAR_ANGGOTA.get(i).getIdAnggota();}
            return hasil;}
        return null;
    }
    public static String bacaDaftarPinjaman () {
        if (DAFTAR_PINJAMAN.isEmpty() == false) {
            String hasil = new String();
            for (int i = 0; i < DAFTAR_PINJAMAN.size(); i++) {
                hasil += "\n*Nama           : " +DAFTAR_PINJAMAN.get(i).getPeminjam().getNama() + "\n";
                hasil += " Id Anggota     : " +DAFTAR_PINJAMAN.get(i).getPeminjam().getIdAnggota() + "\n";
                hasil += " Judul          : " +DAFTAR_PINJAMAN.get(i).getPublikasi().getJudul() + "\n";
                hasil += " Id Koleksi     : " +DAFTAR_PINJAMAN.get(i).getPublikasi().getIdKoleksi() + "\n";
                hasil += " Penulis        : " +DAFTAR_PINJAMAN.get(i).getPublikasi().getPenulis() + "\n";
                hasil += " Penerbit       : " +DAFTAR_PINJAMAN.get(i).getPublikasi().getPenerbit() + "\n";
                hasil += " Tahun          : " +DAFTAR_PINJAMAN.get(i).getPublikasi().getTahun() + "\n";
                hasil += " Tanggal Pinjam : " +DAFTAR_PINJAMAN.get(i).getTanggalPinjam() + "\n";
                hasil += " Tanggal KembaLi: " +DAFTAR_PINJAMAN.get(i).getTanggalKembali();}
            return hasil;}
        return null;
    }
    public static void simpanFilePublikasi() throws IOException {
        FileOutputStream outStream = null;
        if (DAFTAR_PUBLIKASI.isEmpty()){
            JOptionPane.showMessageDialog(null,"Daftar Publikasi Kosong");
        }
    else {

            try {
                File outFile = new File("publikasi.dat");
                outStream = new FileOutputStream(outFile);
                ObjectOutputStream outObjectStream = new ObjectOutputStream(outStream);
                outObjectStream.writeObject(DAFTAR_PUBLIKASI);
                outStream.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    public static void bacaFilePublikasi() {
        try {
            FileInputStream inStream = null;
            File inFile = new File("publikasi.dat");
            inStream = new FileInputStream(inFile);
            ObjectInputStream inObjectStream = null;
            try {
                inObjectStream = new ObjectInputStream(inStream);
            } catch (IOException ex) {
                Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                DAFTAR_PUBLIKASI = (ArrayList<Publikasi>) inObjectStream.readObject();
            } catch (IOException ex) {
                Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void simpanFileAnggota() throws IOException {
        FileOutputStream outStream = null;
        if (DAFTAR_ANGGOTA.isEmpty()){
            JOptionPane.showMessageDialog(null,"Daftar Anggota Kosong");
        }
    else {

            try {
                File outFile = new File("anggota.dat");
                outStream = new FileOutputStream(outFile);
                String data = new String();
                for(int i=0; i<DAFTAR_ANGGOTA.size();i++) {
                    data += "Id Anggota : " + DAFTAR_ANGGOTA.get(i).getIdAnggota() + "\tNama : " + DAFTAR_ANGGOTA.get(i).getNama() + "\n";
                }
                outStream.write(data.getBytes());
                outStream.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    public static void bacaFileAnggota()  {
        try {
            FileInputStream inStream = null;
            String data = new String();
            File inFile = new File("anggota.dat");
            try {
                inStream = new FileInputStream(inFile);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            }
            int a;
            while ((a = inStream.read()) != -1) {
                data = data + (char) a;
            }
            inStream.close();
            System.out.println(data);
        } catch (IOException ex) {
            Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

public static void simpanFilePinjaman() throws IOException {
        FileOutputStream outStream = null;
        if (DAFTAR_PINJAMAN.isEmpty()){
            JOptionPane.showMessageDialog(null,"Daftar Pinjaman Kosong");
        }
    else {

            try {
                File outFile = new File("pinjaman.dat");
                outStream = new FileOutputStream(outFile);
                String data = new String();
                for(int i=0; i<DAFTAR_PINJAMAN.size();i++) {
                    data += "Id Anggota : " + DAFTAR_PINJAMAN.get(i).getPeminjam().getIdAnggota() + "\tId Koleksi : " + DAFTAR_PINJAMAN.get(i).getPublikasi().getIdKoleksi() + "\n";
                }
                outStream.write(data.getBytes());
                outStream.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    public static void bacaFilePinjaman()  {
        try {
            FileInputStream inStream = null;
            String data = new String();
            File inFile = new File("pinjaman.dat");
            try {
                inStream = new FileInputStream(inFile);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            }
            int a;
            while ((a = inStream.read()) != -1) {
                data = data + (char) a;
            }
            inStream.close();
            System.out.println(data);
        } catch (IOException ex) {
            Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public static void tambahTabelPublikasi (Publikasi publikasi){
        try {
            Connection conn = OraConnection.open("jdbc:oracle:thin:@172.23.9.185:1521:orcl", "MHS115314023", "MHS115314023");
            java.sql.Statement statement = null;
            statement = conn.createStatement();
            String sql = "insert into publikasi (id_koleksi,judul,penulis,penerbit,tahun) values ('" + publikasi.getIdKoleksi() + "','" + publikasi.getJudul() +
                    "','" + publikasi.getPenulis() + "','" + publikasi.getPenerbit() +
                    "','" + publikasi.getTahun() +"')";
            statement.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void simpanTabelPublikasi() {
        if (DAFTAR_PUBLIKASI.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Daftar Publikasi Kosong di fungsi simpanTabelPublikasi");
        } else {
            Connection conn = OraConnection.open("jdbc:oracle:thin:@172.23.9.185:1521:orcl","MHS115314023", "MHS115314023");
            try {
                java.sql.Statement statement = conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (int i=0; i<DAFTAR_PUBLIKASI.size(); i++){
                String sql = "insert into publikasi (id_koleksi,judul,penulis,penerbit,tahun) values ('"+DAFTAR_PUBLIKASI.get(i).getIdKoleksi() + "','" + DAFTAR_PUBLIKASI.get(i).getJudul()+
                        DAFTAR_PUBLIKASI.get(i).getPenulis() + "','" + DAFTAR_PUBLIKASI.get(i).getPenerbit() + "','" +
                        DAFTAR_PUBLIKASI.get(i).getTahun() +"')";
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void bacaTabelPublikasi(){
       DAFTAR_PUBLIKASI= new ArrayList<Publikasi>();
       Connection conn = OraConnection.open("jdbc:oracle:thin:@172.23.9.185:1521:orcl","MHS115314023", "MHS115314023");
        java.sql.Statement statement = null;
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
       String sql = "select * from publikasi";
       ResultSet result = null;
        try {
            result = statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (result.next()) {
                Publikasi temp = new Publikasi() {

                    public int hitungDenda(int lamaPinjam) {
                        throw new UnsupportedOperationException("Not supported yet.");
                    }
                };
                temp.setIdKoleksi(result.getString("id_koleksi"));
                temp.setJudul(result.getString("judul"));
                temp.setPenulis(result.getString("penulis"));
                temp.setPenerbit(result.getString("penerbit"));
                temp.setTahun(result.getInt("tahun"));
                DAFTAR_PUBLIKASI.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    public static void tambahTabelAnggota (Anggota anggota){
        try {
            Connection conn = OraConnection.open("jdbc:oracle:thin:@172.23.9.185:1521:orcl", "MHS115314023", "MHS115314023");
            java.sql.Statement statement = null;
            statement = conn.createStatement();
            String sql = "insert into anggota (id_anggota,nama) values ('" + anggota.getIdAnggota() + "','" + anggota.getNama() + "')";
            statement.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void simpanTabelAnggota() {
        if (DAFTAR_ANGGOTA.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Daftar Anggota Kosong");
        } else {
            Connection conn = OraConnection.open("jdbc:oracle:thin:@172.23.9.185:1521:orcl","MHS115314023", "MHS115314023");
            try {
                java.sql.Statement statement = conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (int i=0; i<DAFTAR_ANGGOTA.size(); i++){
                String sql = "insert into anggota (id_anggota,nama) values ('"+DAFTAR_ANGGOTA.get(i).getIdAnggota() + "','" + DAFTAR_ANGGOTA.get(i).getNama()+ "')";
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void bacaTabelAnggota(){
       DAFTAR_ANGGOTA= new ArrayList<Anggota>();
       Connection conn = OraConnection.open("jdbc:oracle:thin:@172.23.9.185:1521:orcl","MHS115314023", "MHS115314023");
        java.sql.Statement statement = null;
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
       String sql = "select * from anggota";
       ResultSet result = null;
        try {
            result = statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (result.next()) {
                Anggota temp = new Anggota() {

                    public int hitungDenda(int lamaPinjam) {
                        throw new UnsupportedOperationException("Not supported yet.");
                    }
                };
                temp.setIdAnggota(result.getString("id_anggota"));
                temp.setNama(result.getString("nama"));
                DAFTAR_ANGGOTA.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Perpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    public void aturTimer (){

    }
    public static ArrayList<Anggota> cariAnggota(String nama) {
        ArrayList<Anggota> hasil = new ArrayList<Anggota>();
        for (int i=0; i < DAFTAR_ANGGOTA.size(); i++) {
            Anggota temp = DAFTAR_ANGGOTA.get(i);
            if (temp.getNama().contains(nama)){
                hasil.add(temp);
            }
        }
        if(hasil.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan");
        }
        return hasil;
    }
}

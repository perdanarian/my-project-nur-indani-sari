package com.model;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Perpustakaan {
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
}
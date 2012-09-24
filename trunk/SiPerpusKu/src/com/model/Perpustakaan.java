package com.model;
import java.util.ArrayList;
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
}

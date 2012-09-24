package com.model;
import java.util.Date;
public class Pinjaman {
    private Anggota peminjam;
    private Publikasi publikasi;
    private Date tanggalPinjam;
    private Date tanggalKembali;
    public Pinjaman(){}
    public Anggota getPeminjam() {
        return peminjam;}
    public void setPeminjam(Anggota peminjam) {
        this.peminjam = peminjam;}
    public Publikasi getPublikasi() {
        return publikasi;}
    public void setPublikasi(Publikasi publikasi) {
        this.publikasi = publikasi;}
    public Date getTanggalPinjam() {
        return tanggalPinjam;}
    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;}
    public Date getTanggalKembali() {
        return tanggalKembali;}
    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;}
}

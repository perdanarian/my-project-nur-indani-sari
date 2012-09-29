package com.model; 
public abstract class Publikasi implements Sirkulasi {
    private String idKoleksi;    
    public String judul;        
    private String penulis;      
    private String penerbit;     
    private String tahun;
    public Publikasi() {}
    public String getIdKoleksi() { 
        return idKoleksi;}
    public void setIdKoleksi(String idKoleksi) { 
        this.idKoleksi = idKoleksi;}
    public String getJudul() {     
        return judul;}
    public void setJudul(String judul) {         
        this.judul = judul;}
    public String getPenulis() {   
        return penulis;}
    public void setPenulis(String penulis) {     
        this.penulis = penulis;}
    public String getPenerbit() {  
        return penerbit;}
    public void setPenerbit(String penerbit) {   
        this.penerbit = penerbit;}
    public String getTahun() {
        return tahun;}
    public void setTahun(String tahun) {
        this.tahun = tahun;}
}



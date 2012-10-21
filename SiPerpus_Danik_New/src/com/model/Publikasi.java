package com.model;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public abstract class Publikasi implements Sirkulasi,Serializable {
    private String idKoleksi;    
    public String judul;        
    private String penulis;      
    private String penerbit;     
    private String tahun;
    public Publikasi() {}
    public String getIdKoleksi() { 
        return idKoleksi;}
    public void setIdKoleksi(String idKoleksi) { 
        if (idKoleksi.length()==10) {
            this.idKoleksi=idKoleksi;
        }
        else {
            try {
                throw new Exception("panjang idKoleksi harus 10 digit");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                Logger.getLogger(Publikasi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }}
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



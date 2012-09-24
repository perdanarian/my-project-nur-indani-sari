package com.model; 
public class Buku extends Publikasi {       
    private String isbn;                   
    public final int MAX_LAMA_PINJAM = 14;  
    public final int BESAR_DENDA = 1000;    
    public Buku() {} 
    public String getIsbn() {         
        return isbn;}
    public void setIsbn(String isbn) { 
        this.isbn = isbn;}
    public boolean isTerlambat(int lamaPinjam) { 
        if (lamaPinjam <= MAX_LAMA_PINJAM) {     
            return false;                        
        } else {
            return true;}}
    public int hitungDenda(int lamaPinjam) { 
        if (lamaPinjam > MAX_LAMA_PINJAM ) { 
            return BESAR_DENDA * (lamaPinjam-MAX_LAMA_PINJAM);}
        else {
            return 0;}}
}



package com.model; 
public class Majalah extends Publikasi { 
    private String issn;                    
    public final int MAX_LAMA_PINJAM = 7;   
    public final int BESAR_DENDA = 5000;     
    public Majalah() {} 
    public String getIssn() { 
        return issn;}
    public void setIssn(String issn) { 
        this.issn = issn;}
    public boolean isTerlambat(int lamaPinjam) { 
        if (lamaPinjam <= MAX_LAMA_PINJAM) {     
            return false;                        
        } else {
            return true;}}
    public int hitungDenda(int lamaPinjam) { 
        if (lamaPinjam > MAX_LAMA_PINJAM ) { 
            return BESAR_DENDA *(lamaPinjam-MAX_LAMA_PINJAM);
        }
        else {
            return 0;}}
}




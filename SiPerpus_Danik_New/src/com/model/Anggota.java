package com.model;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Anggota {
    private String idAnggota;
    private String nama;
    public Anggota() {}
    public String getIdAnggota() {
        return idAnggota;}
    public void setIdAnggota(String idAnggota) {
        if (idAnggota.length()==10) {
            this.idAnggota=idAnggota;
        }
        else {
            try {
                throw new Exception("panjang idAnggota harus 10 digit");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                Logger.getLogger(Anggota.class.getName()).log(Level.SEVERE, null, ex);
            }
        }}
    public String getNama() {
        return nama;}
    public void setNama(String nama) {
        this.nama = nama;}
}

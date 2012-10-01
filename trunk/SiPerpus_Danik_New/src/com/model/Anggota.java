package com.model;
public class Anggota {
    private String idAnggota;
    private String nama;
    public Anggota() {}
    public String getIdAnggota() {
        return idAnggota;}
    public void setIdAnggota(String idAnggota) throws Exception {
        if (idAnggota.length()==10) {
            this.idAnggota=idAnggota;
        }
        else {
            throw new Exception("panjang idAnggota salah");
        }}
    public String getNama() {
        return nama;}
    public void setNama(String nama) {
        this.nama = nama;}
}

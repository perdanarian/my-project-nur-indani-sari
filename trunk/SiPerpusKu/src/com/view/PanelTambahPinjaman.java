package com.view;

import com.model.Perpustakaan;
import java.awt.Color;
import javax.swing.*;

public class PanelTambahPinjaman extends JPanel {
    private JLabel labelPanel;
    private JLabel labelKodeAnggota;
    private JTextField textKodeAnggota;
    private JLabel labelKodeKoleksi;
    private JTextField textKodeKoleksi;
    private JButton tombolSimpan;
    private JButton tombolBatal;

    public PanelTambahPinjaman () {

        setLayout(null);

        labelPanel = new JLabel (Perpustakaan.NAMA);
        labelPanel.setBounds(190, 15, 200, 40);
        add(labelPanel);

        labelKodeAnggota = new JLabel ("Id Anggota");
        labelKodeAnggota.setBounds(50,90,250, 50);
        add(labelKodeAnggota);

        labelKodeKoleksi = new JLabel ("Id Koleksi");
        labelKodeKoleksi.setBounds(50,132,250,50);
        add(labelKodeKoleksi);

        textKodeAnggota = new JTextField(20);
        textKodeAnggota.setBounds(150,100,270,32);
        textKodeAnggota.setBackground(Color.WHITE);
        add(textKodeAnggota);

        textKodeKoleksi = new JTextField(20);
        textKodeKoleksi.setBounds(150,142,270,32);
        textKodeKoleksi.setBackground(Color.WHITE);
        add(textKodeKoleksi);

        tombolSimpan = new JButton ("Simpan");
        tombolSimpan.setBounds(95, 280, 110, 30);
        add(tombolSimpan);

        tombolBatal = new JButton ("Batal");
        tombolBatal.setBounds(290, 280, 110, 30);
        add(tombolBatal);

        setVisible(true);
    }
}

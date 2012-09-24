package com.view;

import com.model.Perpustakaan;
import java.awt.Color;
import javax.swing.*;

public class PanelTambahAnggota extends JPanel {
    private JLabel labelPanel;
    private JLabel labelKodeAnggota;
    private JTextField textKodeAnggota;
    private JLabel labelNama;
    private JTextField textNama;
    private JButton tombolSimpan;
    private JButton tombolBatal;

    public PanelTambahAnggota() {

        setLayout(null);

        labelPanel = new JLabel (Perpustakaan.NAMA);
        labelPanel.setBounds(190, 15, 200, 40);
        add(labelPanel);

        labelKodeAnggota = new JLabel ("Id Anggota");
        labelKodeAnggota.setBounds(50,90,100, 50);
        add(labelKodeAnggota);

        labelNama = new JLabel ("Nama");
        labelNama.setBounds (50,132,100,50);
        add(labelNama);

        textKodeAnggota = new JTextField(20);
        textKodeAnggota.setBounds(150,100,270,32);
        textKodeAnggota.setBackground(Color.WHITE);
        add(textKodeAnggota);

        textNama = new JTextField(20);
        textNama.setBounds(150,142,270,32);
        textNama.setBackground(Color.WHITE);
        add(textNama);

        tombolSimpan = new JButton ("Simpan");
        tombolSimpan.setBounds(95, 280, 110, 30);
        add(tombolSimpan);

        tombolBatal = new JButton ("Batal");
        tombolBatal.setBounds(290, 280, 110, 30);
        add(tombolBatal);

        setVisible(true);
    }
}

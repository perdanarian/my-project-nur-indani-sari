package com.view;

import com.model.Anggota;
import com.model.Perpustakaan;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        tombolSimpan.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                tombolSimpanAction();
            }
        });

        tombolBatal = new JButton ("Batal");
        tombolBatal.setBounds(290, 280, 110, 30);
        add(tombolBatal);
        tombolBatal.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                tombolBatalAction();
            }
        });

        setVisible(true);
    }
    public void tombolSimpanAction() {
        Anggota agg = new Anggota();
        agg.setIdAnggota(textKodeAnggota.getText());
        agg.setNama(textNama.getText());
        Perpustakaan.tambahAnggota(agg);
        Perpustakaan.tambahTabelAnggota(agg);
        JOptionPane.showMessageDialog( this,"Id Anggota : "+agg.getIdAnggota() +
                                          "\nNama       : "+agg.getNama());
    }
    public void tombolBatalAction() {
        System.exit(0);
    }
}

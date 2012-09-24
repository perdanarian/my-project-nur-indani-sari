package com.view;

import com.model.Perpustakaan;
import java.awt.Color;
import javax.swing.*;

public class PanelTambahPublikasi extends JPanel {

    private JLabel labelPanel;
    private JLabel labelKodeKoleksi;
    private JTextField textKodeKoleksi;
    private JLabel labelJudul;
    private JTextField textJudul;
    private JLabel labelPenulis;
    private JTextField textPenulis;
    private JLabel labelPenerbit;
    private JTextField textPenerbit;
    private JLabel labelTahun;
    private JTextField textTahun;
    private JButton tombolSimpan;
    private JButton tombolBatal;
    private JRadioButton radioBuku;
    private JRadioButton radioMajalah;

    public PanelTambahPublikasi(){
        
        setLayout(null);
        
        labelPanel = new JLabel (Perpustakaan.NAMA);
        labelPanel.setBounds(190, 15, 200, 40);
        add(labelPanel);
        
        radioBuku = new JRadioButton ("Buku");
        radioBuku.setBounds(125, 50, 100, 50);
        add(radioBuku);

        radioMajalah = new JRadioButton ("Majalah");
        radioMajalah.setBounds(310,50,100, 50);
        add(radioMajalah);

        labelKodeKoleksi = new JLabel ("Id Koleksi");
        labelKodeKoleksi.setBounds(50,90,100, 50);
        add(labelKodeKoleksi);
        
        labelJudul = new JLabel ("Judul");
        labelJudul.setBounds(50,122,100,50);
        add(labelJudul);
        
        labelPenulis = new JLabel ("Penulis");
        labelPenulis.setBounds (50, 154, 100, 50);
        add(labelPenulis);
        
        labelPenerbit = new JLabel ("Penerbit");
        labelPenerbit.setBounds(50, 186, 100, 50);
        add(labelPenerbit);
        
        labelTahun = new JLabel ("Tahun");
        labelTahun.setBounds(50,218,100,50);
        add(labelTahun);


        textKodeKoleksi = new JTextField(20);
        textKodeKoleksi.setBounds(150,100,270,32);
        textKodeKoleksi.setBackground(Color.WHITE);
        add(textKodeKoleksi);

        textJudul = new JTextField(20);
        textJudul.setBounds(150,132,270,32);
        textJudul.setBackground(Color.WHITE);
        add(textJudul);

        textPenulis = new JTextField(20);
        textPenulis.setBounds(150,164,270,32);
        textPenulis.setBackground(Color.WHITE);
        add(textPenulis);

        textPenerbit = new JTextField(20);
        textPenerbit.setBounds(150,196,270,32);
        textPenerbit.setBackground(Color.WHITE);
        add(textPenerbit);

        textTahun = new JTextField(20);
        textTahun.setBounds(150,228,270,32);
        textTahun.setBackground(Color.WHITE);
        add(textTahun);

        tombolSimpan = new JButton ("Simpan");
        tombolSimpan.setBounds(95, 280, 110, 30);
        add(tombolSimpan);

        tombolBatal = new JButton ("Batal");
        tombolBatal.setBounds(290, 280, 110, 30);
        add(tombolBatal);

        setVisible(true);
    }}

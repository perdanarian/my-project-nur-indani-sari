/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.view;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.*;

/**
 *
 * @author Asus
 */

public class PanelTambahFotoAnggota extends JPanel{
    private JLabel labelKodeAnggota;
    private JTextField textKodeAnggota;
    private JButton tombolSimpan;
    private JButton tombolCariGambar;
    private File file;
    private BufferedImage image;

    public PanelTambahFotoAnggota(){
    inisialisasi();
    }
    public void inisialisasi(){
        setLayout(null);
        labelKodeAnggota = new JLabel("Kode");
        labelKodeAnggota.setBounds(50, 500, 100, 50);
        add(labelKodeAnggota);

        textKodeAnggota = new JTextField();
        textKodeAnggota.setBounds(150, 500, 200, 50);
        add(textKodeAnggota);

        tombolCariGambar = new JButton("Cari Gambar");
        tombolCariGambar.setBounds(400, 500, 150, 50);
        add(tombolCariGambar);

        tombolSimpan = new JButton("Simpan");
        tombolSimpan.setBounds(580, 500, 100, 50);
        add(tombolSimpan);



        setVisible(true);

    }
}

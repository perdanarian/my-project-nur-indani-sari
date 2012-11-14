/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
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
    private File file= null;
    private BufferedImage image=null;

    public PanelTambahFotoAnggota(){
        try {
            inisialisasi();
            file = new File("noPicture.png");
            image = ImageIO.read(file);
            image.getGraphics();
        } catch (IOException ex) {
            Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void inisialisasi(){
        setLayout(new BorderLayout());



        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new FlowLayout());


        labelKodeAnggota = new JLabel("Kode");
        labelKodeAnggota.setBounds(50, 500, 100, 50);
        panelTombol.add(labelKodeAnggota);

        textKodeAnggota = new JTextField();
        textKodeAnggota.setColumns(10);
        textKodeAnggota.setBounds(150, 500, 200, 50);
        panelTombol.add(textKodeAnggota);

        tombolCariGambar = new JButton("Cari Gambar");
        tombolCariGambar.setBounds(400, 500, 150, 50);
        panelTombol.add(tombolCariGambar);

        tombolSimpan = new JButton("Simpan");
        tombolSimpan.setBounds(580, 500, 100, 50);
        panelTombol.add(tombolSimpan);

        tombolSimpan.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                tombolSimpanAction();
            }
        });

        tombolCariGambar.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                tombolCariGambarAction();
            }
        });

        textKodeAnggota.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                textKodeAnggotaAction();
            }
        });

        add(panelTombol, BorderLayout.SOUTH);
        setVisible(true);

    }
    public void tombolSimpanAction(){
        FileInputStream inStream = null;
        try {
//            File tujuan = new File(textKodeAnggota.getText() + ".jpg");
            //        FileInputStream inStream = null;
            String data = new String();
//            File inFile = new File(file);
            inStream = new FileInputStream(file);
            File tujuan = new File(textKodeAnggota.getText() + ".jpg");
            int a;
            while ((a = inStream.read()) != -1) {
                data = data + (char) a;
            }
            inStream.close();
            System.out.println(data);
        } catch (IOException ex) {
            Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                inStream.close();
            } catch (IOException ex) {
                Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void tombolCariGambarAction() {
        JFileChooser chooser = new JFileChooser();
        int status = chooser.showOpenDialog(this);
        int APPROVE_ACTION = 0;
        if (status==APPROVE_ACTION) {
            file = chooser.getSelectedFile();
            repaint();
        }
    }
    public void textKodeAnggotaAction() {

    }
    public void paintComponents(Graphics g){
        try {
            image = ImageIO.read(file);
            g.drawImage(image,50,50,300,200,0,0,image.getWidth(null),image.getHeight(null),null);
        } catch (IOException ex) {
            Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

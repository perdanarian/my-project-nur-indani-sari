/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author Asus
 */

public class PanelTambahFotoAnggota extends JPanel {
    private JLabel labelKodeAnggota;
    private JTextField textKodeAnggota;
    private JButton tombolSimpan;
    private JButton tombolCariGambar;
    private File file;
    private BufferedImage image;
    public PanelTambahFotoAnggota() {
        setLayout(new BorderLayout());

            if(file==null){
            File img = new File("noPicture.png");
            try {
                image = ImageIO.read(img);
            } catch (IOException ex) {
                Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
            }
}
 else {
            try {File img = new File(file.getName());

                image = ImageIO.read(img);
                image.getGraphics();
            } catch (IOException ex) {
                Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
            }

}



        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new FlowLayout());

        labelKodeAnggota = new JLabel("Kode");
        panelTombol.add(labelKodeAnggota);

        textKodeAnggota = new JTextField();
        textKodeAnggota.setColumns(10);
        panelTombol.add(textKodeAnggota);

        tombolCariGambar = new JButton("Cari Gambar");
        panelTombol.add(tombolCariGambar);

        tombolSimpan = new JButton("Simpan");
        panelTombol.add(tombolSimpan);

//        panelTombol.setLayout(new BorderLayout());
        add(panelTombol, BorderLayout.SOUTH);
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
    }

    public void paintComponent(Graphics g) {
        g.drawImage(image,
                90, 90, 480, 360,
                0, 0, image.getWidth(null), image.getHeight(null),
                null);
    }
 public void tombolSimpanAction(){
        try {
            //        FileOutputStream os = null;
            //        try {
            File fileBaru = new File(textKodeAnggota.getText() + ".png");
            FileOutputStream outStream = null;
            outStream = new FileOutputStream(fileBaru);
            //            os = new FileOutputStream(fileBaru);
            FileInputStream inStream = null;
            inStream = new FileInputStream(file);
            for (int i = 0; i < fileBaru.length(); i++) {
                try {
                    outStream.write(inStream.read());
                } catch (IOException ex) {
                    Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void tombolCariGambarAction() {
        try {
            JFileChooser chooser = new JFileChooser();
            int status = chooser.showOpenDialog(this);
            int APPROVE_ACTION = 0;
            if (status == APPROVE_ACTION) {
                file = chooser.getSelectedFile();
                repaint();
            }
            image = ImageIO.read(file);
            image.getGraphics();
        } catch (IOException ex) {
            Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void textKodeAnggotaAction() {
    file = new File(textKodeAnggota.getText()+".png");
    repaint();
    }
}
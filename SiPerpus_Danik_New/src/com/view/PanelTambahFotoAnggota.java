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

        File file = new File("noPicture.png");
            try {
                image = ImageIO.read(file);
            } catch (IOException ex) {
                Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public void paintComponent(Graphics g) {
        g.drawImage(getImage(), 0, 0, 600, 550, 0, 0, getImage().getWidth(null),
                getImage().getHeight(null), null);
    }
 public void tombolSimpanAction(){
        try {
            File fileBaru = new File(textKodeAnggota.getText() + ".png");
            FileOutputStream outStream = null;
            outStream = new FileOutputStream(fileBaru);
            FileInputStream inStream = null;
            inStream = new FileInputStream(getFile());
            for (int i = 0; i < file.length(); i++) {
                try {
                    outStream.write(inStream.read());
                } catch (IOException ex) {
                    Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void tombolCariGambarAction() {
        try {
            JFileChooser chooser = new JFileChooser();
            int status = chooser.showOpenDialog(this);
            int APPROVE_ACTION = 0;
            if (status == APPROVE_ACTION) {
                setFile(chooser.getSelectedFile());
                repaint();
            }
            setImage(ImageIO.read(getFile()));
            getImage().getGraphics();
        } catch (IOException ex) {
            Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void textKodeAnggotaAction() {
        try {
            setFile(new File(textKodeAnggota.getText() + ".png"));
            setImage(ImageIO.read(getFile()));
            repaint();
        } catch (IOException ex) {
            Logger.getLogger(PanelTambahFotoAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}

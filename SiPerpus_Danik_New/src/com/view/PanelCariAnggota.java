/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.view;

import com.model.Perpustakaan;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class PanelCariAnggota extends JPanel {
    private JLabel labelPanel;
    private JTextArea areaAnggota;
    private JTextField cariAnggota;
    private JButton cari;



    public PanelCariAnggota() {
        setLayout(null);

        labelPanel = new JLabel("Masukkan nama");
        labelPanel.setBounds(50, 15, 100, 30);
        add(labelPanel);

        cariAnggota = new JTextField();
        cariAnggota.setBounds(200, 15, 100, 30);
        add(cariAnggota);

        cari = new JButton("Cari");
        cari.setBounds(300, 15, 100, 30);
        add(cari);
        cari.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                tombolCariAction();
            }
        });
        areaAnggota = new JTextArea();
        areaAnggota.setBounds(100, 50, 300, 250);
        add(areaAnggota);
        setVisible(true);
    }

    public void tombolCariAction() {
        Perpustakaan.bacaTabelAnggota();
        Perpustakaan.cariAnggota(cariAnggota.getText());
        areaAnggota.setText(Perpustakaan.DAFTAR_ANGGOTA.toString());
    }

    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        PanelCariAnggota testAnggota = new PanelCariAnggota();
        testFrame.getContentPane().add(testAnggota);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("PanelCariAnggota]");
    }

}

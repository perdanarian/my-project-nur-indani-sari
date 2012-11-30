/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.view;

import com.model.Anggota;
import com.model.Perpustakaan;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
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
        labelPanel.setBounds(30, 15, 100, 30);
        add(labelPanel);

        cariAnggota = new JTextField();
        cariAnggota.setBounds(140, 15, 150, 30);
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
        ArrayList<Anggota> test4 = Perpustakaan.cariAnggota(cariAnggota.getText());
        for (int i = 0; i < test4.size(); i++) {
            String temp = "";
            temp = "* Nama : "+ test4.get(i).getNama() +
                 "\n  Id   : " + test4.get(i).getIdAnggota();
            areaAnggota.setText(temp);
        }
        
    }

}

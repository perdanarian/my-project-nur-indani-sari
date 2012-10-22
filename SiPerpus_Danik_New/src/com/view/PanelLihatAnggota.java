/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.view;

import com.model.Perpustakaan;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Asus
 */
public class PanelLihatAnggota extends JPanel {
    private JLabel labelPanel;
    private JTextArea areaAnggota;

    public PanelLihatAnggota() {
        setLayout(null);

        labelPanel = new JLabel("FORM LIHAT ANGGOTA");
        labelPanel.setBounds(100, 15, 300, 40);
        add(labelPanel);

        areaAnggota = new JTextArea(Perpustakaan.bacaDaftarAnggota());
        areaAnggota.setBounds(100, 50, 300, 250);
        add(areaAnggota);
        setVisible(true);
    }
}

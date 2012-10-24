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
public class PanelLihatPinjaman extends JPanel {
    private JLabel labelPanel;
    private JTextArea areaPinjaman;

    public PanelLihatPinjaman() {
        setLayout(null);

        labelPanel = new JLabel("FORM LIHAT PINJAMAN");
        labelPanel.setBounds(100, 15, 300, 40);
        add(labelPanel);
        Perpustakaan.bacaFilePinjaman();
        areaPinjaman = new JTextArea(Perpustakaan.bacaDaftarPinjaman());
        areaPinjaman.setBounds(100, 50, 300, 250);
        add(areaPinjaman);
        setVisible(true);
    }
}

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
public class PanelLihatPublikasi extends JPanel {
    private JLabel labelPanel;
    private JTextArea areaPublikasi;

    public PanelLihatPublikasi() {
        setLayout(null);

        labelPanel = new JLabel("FORM LIHAT PUBLIKASI");
        labelPanel.setBounds(100, 15, 300, 40);
        add(labelPanel);
        Perpustakaan.bacaFilePublikasi();
        areaPublikasi = new JTextArea(Perpustakaan.bacaDaftarPublikasi());
        areaPublikasi.setBounds(100, 50, 300, 250);
        add(areaPublikasi);
        setVisible(true);
    }
}

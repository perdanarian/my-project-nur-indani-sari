/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.view;

import com.model.Publikasi;
import com.model.PublikasiTableModel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author Asus
 */
public class PanelLihatPublikasi extends JPanel{
private JTable tablePublikasi;
private JLabel labelPanel;
public PanelLihatPublikasi(){}
private ArrayList<Publikasi> data;

public PanelLihatPublikasi(ArrayList<Publikasi> data) {
this.data = data;
setLayout(new BorderLayout());

labelPanel = new JLabel("Form Lihat Publikasi"); labelPanel.setHorizontalAlignment(JLabel.CENTER); add(labelPanel,BorderLayout.NORTH);

tablePublikasi = new JTable(); tablePublikasi.setModel(new PublikasiTableModel(data));
add(tablePublikasi,BorderLayout.CENTER);

}

public ArrayList<Publikasi> getData() {
return data;
}

public void setData(ArrayList<Publikasi> data) {
this.data = data;
}

}


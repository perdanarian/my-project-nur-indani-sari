/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.view;

import com.model.Anggota;
import com.model.AnggotaTableModel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author Asus
 */
public class PanelLihatAnggota extends JPanel{
private JTable tableAnggota;
private JLabel labelPanel;
public PanelLihatAnggota(){}
private ArrayList<Anggota> data;

public PanelLihatAnggota(ArrayList<Anggota> data) {
this.data = data;
setLayout(new BorderLayout());

labelPanel = new JLabel("Form Lihat Publikasi");
labelPanel.setHorizontalAlignment(JLabel.CENTER);
add(labelPanel,BorderLayout.NORTH);

tableAnggota = new JTable();
tableAnggota.setModel(new AnggotaTableModel(data));
add(tableAnggota,BorderLayout.CENTER);

}

public ArrayList<Anggota> getData() {
return data;
}

public void setData(ArrayList<Anggota> data) {
this.data = data;
}

}


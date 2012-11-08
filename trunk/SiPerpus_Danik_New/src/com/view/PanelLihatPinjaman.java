/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.view;

import com.model.Pinjaman;
import com.model.PinjamanTableModel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author Asus
 */
public class PanelLihatPinjaman extends JPanel{
private JTable tablePinjaman;
private JLabel labelPanel;
public PanelLihatPinjaman(){}
private ArrayList<Pinjaman> data;

public PanelLihatPinjaman(ArrayList<Pinjaman> data) {
this.data = data;
setLayout(new BorderLayout());

labelPanel = new JLabel("Form Lihat Pinjaman");
labelPanel.setHorizontalAlignment(JLabel.CENTER);
add(labelPanel,BorderLayout.NORTH);

tablePinjaman = new JTable();
tablePinjaman.setModel(new PinjamanTableModel(data));
add(tablePinjaman,BorderLayout.CENTER);

}

public ArrayList<Pinjaman> getData() {
return data;
}

public void setData(ArrayList<Pinjaman> data) {
this.data = data;
}

}

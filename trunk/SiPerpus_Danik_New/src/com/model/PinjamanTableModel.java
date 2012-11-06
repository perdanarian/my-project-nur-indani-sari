/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asus
 */
public class PinjamanTableModel extends AbstractTableModel {

    String columNames[] = {"IdAnggota", "IdKoleksi"};
    private ArrayList<Pinjaman> data;

    public PinjamanTableModel() {
    }

    public PinjamanTableModel(ArrayList<Pinjaman> data) {
        this.data = data;
    }

    public int getRowCount() {
        return getData().size();
    }

    public int getColumnCount() {
        return columNames.length;
    }

    @Override
    public String getColumnName(int col) {
        return columNames[col];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Pinjaman temp = getData().get(rowIndex);
        if (columnIndex == 0) {
            return temp.getPeminjam().getIdAnggota();
        } else {
            return temp.getPublikasi().getIdKoleksi();
        }
    }

    public ArrayList<Pinjaman> getData() {
        return data;
    }

    public void setData(ArrayList<Pinjaman> data) {
        this.data = data;
    }
}

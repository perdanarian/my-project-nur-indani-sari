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
public class AnggotaTableModel extends AbstractTableModel {

    String columNames[] = {"IdAnggota", "Nama"};
    private ArrayList<Anggota> data;

    public AnggotaTableModel() {
    }

    public AnggotaTableModel(ArrayList<Anggota> data) {
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
        Anggota temp = getData().get(rowIndex);
        if (columnIndex == 0) {
            return temp.getIdAnggota();
        } else {
            return temp.getNama();
        }
    }

    public ArrayList<Anggota> getData() {
        return data;
    }

    public void setData(ArrayList<Anggota> data) {
        this.data = data;
    }
}

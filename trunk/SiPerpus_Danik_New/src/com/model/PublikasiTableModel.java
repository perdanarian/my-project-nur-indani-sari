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
public class PublikasiTableModel extends AbstractTableModel {

    String columNames[] = {"IdKoleksi", "Judul", "Penulis", "Penerbit", "Tahun"};
    private ArrayList<Publikasi> data;

    public PublikasiTableModel() {
    }

    public PublikasiTableModel(ArrayList<Publikasi> data) {
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
        Publikasi temp = getData().get(rowIndex);
        if (columnIndex == 0) {
            return temp.getIdKoleksi();
        } else if (columnIndex == 1) {
            return temp.getJudul();
        } else if (columnIndex == 2) {
            return temp.getPenulis();
        } else if (columnIndex == 3) {
            return temp.getPenerbit();
        } else {
            return temp.getTahun();
        }
    }

    public ArrayList<Publikasi> getData() {
        return data;
    }

    public void setData(ArrayList<Publikasi> data) {
        this.data = data;
    }
}

package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FrameUtama extends JFrame implements ActionListener{
   private JMenuBar menuBar;
   private JMenu menuPublikasi;
   private JMenu menuAnggota;
   private JMenu menuPinjaman;
   private JMenuItem menuTambahPublikasi;
   private JMenuItem menuTambahAnggota;
   private JMenuItem menuTambahPinjaman;
   
   
   public FrameUtama () {
       inisialisasi(); 
   }
   
   public void inisialisasi () {
       
       this.setSize(700,700);
       menuBar = new JMenuBar();
       this.setJMenuBar(menuBar);
       menuPublikasi = new JMenu("Publikasi");
       menuBar.add(menuPublikasi);
       menuAnggota = new JMenu("Anggota");
       menuBar.add(menuAnggota);
       menuPinjaman = new JMenu ("Pinjaman");
       menuBar.add(menuPinjaman);
       menuTambahPublikasi = new JMenuItem("Tambah Publikasi");
       menuPublikasi.add(menuTambahPublikasi);
       menuTambahAnggota = new JMenuItem("Tambah Anggota");
       menuAnggota.add(menuTambahAnggota);
       menuTambahPinjaman = new JMenuItem ("Tambah Pinjaman");
       menuPinjaman.add(menuTambahPinjaman);
       
       menuTambahPublikasi.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuTambahPublikasiAction ();
           }
       
       });
       menuTambahAnggota.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuTambahAnggotaAction ();
           }
       
       });
       menuTambahPinjaman.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuTambahPinjamanAction ();
            }
        });
   }

   public void menuTambahPublikasiAction () {
        JDialog testFrame = new JDialog();
        PanelTambahPublikasi testPanel = new PanelTambahPublikasi();
        testFrame.getContentPane().add(testPanel);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Design Preview [PanelTambahPublikasi]");    
   }
   
   public void menuTambahAnggotaAction () {
       JDialog testFrame = new JDialog();
        PanelTambahAnggota testAnggota = new PanelTambahAnggota();
        testFrame.getContentPane().add(testAnggota);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Design Preview [PanelTambahAnggota]");
   }
   public void menuTambahPinjamanAction () {
        JDialog testFrame = new JDialog();
        PanelTambahPinjaman testPinjaman = new PanelTambahPinjaman();
        testFrame.getContentPane().add(testPinjaman);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Design Preview [PanelTambahPinjaman]");
   }
   public void actionPerformed(ActionEvent e) {
    }  
}

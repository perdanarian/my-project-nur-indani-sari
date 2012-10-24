package com.view;

import com.model.Anggota;
import com.model.Perpustakaan;
import com.model.Pinjaman;
import com.model.Publikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class FrameUtama extends JFrame implements ActionListener{
   private JMenuBar menuBar;
   private JMenu menuPublikasi;
   private JMenu menuAnggota;
   private JMenu menuPinjaman;
   private JMenuItem menuTambahPublikasi;
   private JMenuItem menuTambahAnggota;
   private JMenuItem menuTambahPinjaman;
   private JMenuItem menuSimpanFilePublikasi;
   private JMenuItem menuBacaFilePublikasi;
   private JMenuItem menuSimpanFileAnggota;
   private JMenuItem menuBacaFileAnggota;
   private JMenuItem menuSimpanFilePinjaman;
   private JMenuItem menuBacaFilePinjaman;
   
   
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
       menuSimpanFilePublikasi = new JMenuItem("Simpan");
       menuBacaFilePublikasi = new JMenuItem ("Baca");
       menuPublikasi.add(menuTambahPublikasi);
       menuPublikasi.add(menuSimpanFilePublikasi);
       menuPublikasi.add(menuBacaFilePublikasi);
       menuTambahAnggota = new JMenuItem("Tambah Anggota");
       menuSimpanFileAnggota = new JMenuItem("Simpan");
       menuBacaFileAnggota = new JMenuItem ("Baca");
       menuAnggota.add(menuTambahAnggota);
       menuAnggota.add(menuSimpanFileAnggota);
       menuAnggota.add(menuBacaFileAnggota);
       menuTambahPinjaman = new JMenuItem ("Tambah Pinjaman");
       menuSimpanFilePinjaman = new JMenuItem("Simpan");
       menuBacaFilePinjaman = new JMenuItem ("Baca");
       menuPinjaman.add(menuTambahPinjaman);
       menuPinjaman.add(menuSimpanFilePinjaman);
       menuPinjaman.add(menuBacaFilePinjaman);
       
       menuTambahPublikasi.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuTambahPublikasiAction ();
           }
       
       });
       menuSimpanFilePublikasi.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                try {
                    menuSimpanFilePublikasiAction();
                } catch (IOException ex) {
                    Logger.getLogger(FrameUtama.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
       });
       menuBacaFilePublikasi.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuBacaFilePublikasiAction();
           }
       });
       menuTambahAnggota.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuTambahAnggotaAction ();
           }
       
       });
       menuSimpanFileAnggota.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                try {
                    menuSimpanFileAnggotaAction();
                } catch (IOException ex) {
                    Logger.getLogger(FrameUtama.class.getName()).log(Level.SEVERE, null, ex);
                }
           }

       });
       menuBacaFileAnggota.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuBacaFileAnggotaAction();
           }
       });
       menuTambahPinjaman.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuTambahPinjamanAction ();
            }
        });
        menuSimpanFilePinjaman.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                try {
                    menuSimpanFilePinjamanAction();
                } catch (IOException ex) {
                    Logger.getLogger(FrameUtama.class.getName()).log(Level.SEVERE, null, ex);
                }
           }

       });
       menuBacaFilePinjaman.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuBacaFilePinjamanAction();
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
   public void menuSimpanFilePublikasiAction () throws IOException {
         Perpustakaan.simpanFilePublikasi();
   }

   public void menuBacaFilePublikasiAction () {
        JFrame testFrame = new JFrame();
        PanelLihatPublikasi testPanel = new PanelLihatPublikasi();
        testFrame.getContentPane().add(testPanel);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Panel Lihat Publikasi");
   }
   
   public void menuTambahAnggotaAction () {
        JDialog testFrame = new JDialog();
        PanelTambahAnggota testAnggota = new PanelTambahAnggota();
        testFrame.getContentPane().add(testAnggota);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Design Preview [PanelTambahAnggota]");
   }
   public void menuSimpanFileAnggotaAction () throws IOException {
         Perpustakaan.simpanFileAnggota();
   }
   public void menuBacaFileAnggotaAction () {
        JFrame testFrame = new JFrame();
        PanelLihatAnggota testPanel = new PanelLihatAnggota();
        testFrame.getContentPane().add(testPanel);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Panel Lihat Anggota");
   }
   public void menuTambahPinjamanAction () {
        JDialog testFrame = new JDialog();
        PanelTambahPinjaman testPinjaman = new PanelTambahPinjaman();
        testFrame.getContentPane().add(testPinjaman);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Design Preview [PanelTambahPinjaman]");
   }
   public void menuSimpanFilePinjamanAction () throws IOException {
         Perpustakaan.simpanFilePinjaman();
   }
   public void menuBacaFilePinjamanAction () {
        JFrame testFrame = new JFrame();
        PanelLihatPinjaman testPanel = new PanelLihatPinjaman();
        testFrame.getContentPane().add(testPanel);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Panel Lihat Pinjaman");
   }
   public void actionPerformed(ActionEvent e) {
    }  
}

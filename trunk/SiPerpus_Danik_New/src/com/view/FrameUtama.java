package com.view;

import com.model.Perpustakaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class FrameUtama extends JFrame {
   private JMenuBar menuBar;
   private JMenu menuPublikasi;
   private JMenu menuAnggota;
   private JMenu menuPinjaman;
   private JMenuItem menuTambahPublikasi;
   private JMenuItem menuTambahAnggota;
   private JMenuItem menuTambahPinjaman;
   private JMenuItem menuSimpanFilePublikasi;
   private JMenuItem menuBacaFilePublikasi;
   private JMenuItem menuLihatPublikasi;
   private JMenuItem menuSimpanPublikasiKeTable;
   private JMenuItem menuBacaPublikasiDariTable;
   private JMenuItem menuSimpanFileAnggota;
   private JMenuItem menuBacaFileAnggota;
   private JMenuItem menuLihatAnggota;
   private JMenuItem menuSimpanAnggotaKeTable;
   private JMenuItem menuBacaAnggotaDariTable;
   private JMenuItem menuSimpanFilePinjaman;
   private JMenuItem menuBacaFilePinjaman;
   private JMenuItem menuLihatPinjaman;
   private JMenuItem menuSimpanPinjamanKeTable;
   private JMenuItem menuBacaPinjamanDariTable;
   
   
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
       menuLihatPublikasi = new JMenuItem("Lihat Publikasi");
       menuSimpanPublikasiKeTable = new JMenuItem("Simpan Ke Tabel");
       menuBacaPublikasiDariTable = new JMenuItem("Baca Dari Tabel");
       menuPublikasi.add(menuTambahPublikasi);
       menuPublikasi.add(menuSimpanFilePublikasi);
       menuPublikasi.add(menuBacaFilePublikasi);
       menuPublikasi.add(menuLihatPublikasi);
       menuPublikasi.add(menuSimpanPublikasiKeTable);
       menuPublikasi.add(menuBacaPublikasiDariTable);
       menuTambahAnggota = new JMenuItem("Tambah Anggota");
       menuSimpanFileAnggota = new JMenuItem("Simpan");
       menuBacaFileAnggota = new JMenuItem ("Baca");
       menuLihatAnggota = new JMenuItem("Lihat Anggota");
       menuSimpanAnggotaKeTable = new JMenuItem("Simpan Ke Tabel");
       menuBacaAnggotaDariTable = new JMenuItem("Baca Dari Tabel");
       menuAnggota.add(menuTambahAnggota);
       menuAnggota.add(menuSimpanFileAnggota);
       menuAnggota.add(menuBacaFileAnggota);
       menuAnggota.add(menuLihatAnggota);
       menuAnggota.add(menuSimpanAnggotaKeTable);
       menuAnggota.add(menuBacaAnggotaDariTable);
       menuTambahPinjaman = new JMenuItem ("Tambah Pinjaman");
       menuSimpanFilePinjaman = new JMenuItem("Simpan");
       menuBacaFilePinjaman = new JMenuItem ("Baca");
       menuLihatPinjaman = new JMenuItem("Lihat Pinjaman");
       menuSimpanPinjamanKeTable = new JMenuItem("Simpan Ke Tabel");
       menuBacaPinjamanDariTable = new JMenuItem("Baca Dari Tabel");
       menuPinjaman.add(menuTambahPinjaman);
       menuPinjaman.add(menuSimpanFilePinjaman);
       menuPinjaman.add(menuBacaFilePinjaman);
       menuPinjaman.add(menuLihatPinjaman);
       menuPinjaman.add(menuSimpanPinjamanKeTable);
       menuPinjaman.add(menuBacaPinjamanDariTable);
       
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
       menuLihatPublikasi.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuLihatPublikasiAction();
           }
       });
       menuLihatAnggota.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuLihatAnggotaAction();
           }
       });
       menuLihatPinjaman.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuLihatPinjamanAction();
           }
       });
       menuSimpanPublikasiKeTable.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuSimpanPublikasiKeTableAction();
           }
       });
       menuSimpanAnggotaKeTable.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuSimpanAnggotaKeTableAction();
           }
       });
       menuSimpanPinjamanKeTable.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuSimpanPinjamanKeTableAction();
           }
       });
       menuBacaPublikasiDariTable.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuBacaPublikasiDariTableAction();
           }
       });
       menuBacaAnggotaDariTable.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuBacaAnggotaDariTableAction();
           }
       });
       menuBacaPinjamanDariTable.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuBacaPinjamanDariTableAction();
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
        PanelBacaPublikasi testPanel = new PanelBacaPublikasi();
        testFrame.getContentPane().add(testPanel);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Panel Baca Publikasi");
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
        PanelBacaAnggota testPanel = new PanelBacaAnggota();
        testFrame.getContentPane().add(testPanel);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Panel Baca Anggota");
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
        PanelBacaPinjaman testPanel = new PanelBacaPinjaman();
        testFrame.getContentPane().add(testPanel);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Panel Baca Pinjaman");
   }
   public void menuLihatPublikasiAction() {
        JDialog testFrame = new JDialog();
        PanelLihatPublikasi test = new PanelLihatPublikasi(Perpustakaan.DAFTAR_PUBLIKASI);
        testFrame.getContentPane().add(test);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Design Preview [PanelLihatPublikasi]");
   }
   public void menuSimpanPublikasiKeTableAction(){
        Perpustakaan.simpanTabelPublikasi();
   }
   public void menuBacaPublikasiDariTableAction(){
        Perpustakaan.bacaTabelPublikasi();
   }
   public void menuLihatAnggotaAction() {
        JDialog testFrame = new JDialog();
        PanelLihatAnggota test = new PanelLihatAnggota(Perpustakaan.DAFTAR_ANGGOTA);
        testFrame.getContentPane().add(test);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Design Preview [PanelLihatAnggota]");
   }
   public void menuSimpanAnggotaKeTableAction(){
        Perpustakaan.simpanTabelAnggota();
   }
   public void menuBacaAnggotaDariTableAction(){
        Perpustakaan.bacaTabelAnggota();
   }
   public void menuLihatPinjamanAction() {
        JDialog testFrame = new JDialog();
        PanelLihatPinjaman test = new PanelLihatPinjaman(Perpustakaan.DAFTAR_PINJAMAN);
        testFrame.getContentPane().add(test);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Design Preview [PanelLihatPinjaman]");
   }
   public void menuSimpanPinjamanKeTableAction(){
        Perpustakaan.simpanTabelPinjaman();
   }
   public void menuBacaPinjamanDariTableAction(){
        Perpustakaan.bacaTabelPinjaman();
   }
     
}

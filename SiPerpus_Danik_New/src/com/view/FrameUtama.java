package com.view;

import com.model.Perpustakaan;
import com.model.TimerBacaAnggota;
import com.model.TimerBacaPublikasi;
import com.model.TimerSimpanPublikasi;
import java.awt.BorderLayout;
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
   private JMenuItem menuTambahFotoAnggota;
   private JMenuItem menuSimpanFilePinjaman;
   private JMenuItem menuBacaFilePinjaman;
   private JMenuItem menuCariAnggota;


   public FrameUtama () {
       inisialisasi();
       TimerBacaPublikasi timerBacaPub = new TimerBacaPublikasi(5000);
       TimerSimpanPublikasi timerSimpanPub = new TimerSimpanPublikasi(5000);
       TimerBacaAnggota timerBacaAng = new TimerBacaAnggota(5000);
       TimerSimpanPublikasi timerSimpanAng = new TimerSimpanPublikasi(5000);
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
       menuTambahFotoAnggota =  new JMenuItem("Tambah Foto Anggota");
       menuCariAnggota = new JMenuItem ("Cari Anggota");
       menuAnggota.add(menuTambahAnggota);
       menuAnggota.add(menuSimpanFileAnggota);
       menuAnggota.add(menuBacaFileAnggota);
       menuAnggota.add(menuLihatAnggota);
       menuAnggota.add(menuSimpanAnggotaKeTable);
       menuAnggota.add(menuBacaAnggotaDariTable);
       menuAnggota.add(menuTambahFotoAnggota);
       menuAnggota.add(menuCariAnggota);
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
        menuTambahFotoAnggota.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuTambahFotoAnggotaAction();
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
       menuCariAnggota.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               menuCariAnggotaDariTableAction();
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
        testFrame.setTitle("Panel Tambah Foto Anggota");
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
   public void menuTambahFotoAnggotaAction() {
       JFrame frame = new JFrame("Using Java2D");
        frame.setLayout(new BorderLayout());
        PanelTambahFotoAnggota gc = new PanelTambahFotoAnggota();
        frame.add(gc, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
   }
   public void menuCariAnggotaDariTableAction() {
        JFrame testFrame = new JFrame();
        PanelCariAnggota testAnggota = new PanelCariAnggota();
        testFrame.getContentPane().add(testAnggota);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Panel Cari Anggota");
   }
}

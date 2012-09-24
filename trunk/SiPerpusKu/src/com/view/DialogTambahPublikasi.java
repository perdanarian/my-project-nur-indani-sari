/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.JDialog;

/**
 *
 * @author admin
 */
public class DialogTambahPublikasi extends JDialog{
  public DialogTambahPublikasi () {
      
  }  
  
  public DialogTambahPublikasi (Frame owner) {
      super(owner);
      setLayout (new FlowLayout());
      add(new PanelTambahPublikasi());
      setVisible(true);
      setSize (500,400);
  }
  
  
}

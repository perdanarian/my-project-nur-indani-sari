/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import com.view.PanelLihatPublikasi;
import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class TestPanelLihatPublikasi {
    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        PanelLihatPublikasi testPanel = new PanelLihatPublikasi();
        testFrame.getContentPane().add(testPanel);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Panel Lihat Publikasi");
}}

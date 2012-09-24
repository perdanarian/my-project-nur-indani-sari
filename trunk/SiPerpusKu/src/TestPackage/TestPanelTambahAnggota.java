package TestPackage;

import com.view.PanelTambahAnggota;
import javax.swing.*;

public class TestPanelTambahAnggota {
    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        PanelTambahAnggota testAnggota = new PanelTambahAnggota();
        testFrame.getContentPane().add(testAnggota);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Design Preview [PanelTambahAnggota]");
    }
}

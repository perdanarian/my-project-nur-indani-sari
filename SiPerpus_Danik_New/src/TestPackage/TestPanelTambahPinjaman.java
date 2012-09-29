package TestPackage;

import com.view.PanelTambahPinjaman;
import javax.swing.JFrame;

public class TestPanelTambahPinjaman {
    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        PanelTambahPinjaman testPinjaman = new PanelTambahPinjaman();
        testFrame.getContentPane().add(testPinjaman);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Design Preview [PanelTambahPinjaman]");
    }
}

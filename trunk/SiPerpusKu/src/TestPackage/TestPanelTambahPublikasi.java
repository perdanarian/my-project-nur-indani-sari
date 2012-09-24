package TestPackage;

import com.view.PanelTambahPublikasi;
import javax.swing.*;

public class TestPanelTambahPublikasi {
    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        PanelTambahPublikasi testPanel = new PanelTambahPublikasi();
        testFrame.getContentPane().add(testPanel);
        testFrame.setSize(500, 400);
        testFrame.setVisible(true);
        testFrame.setTitle("Design Preview [PanelTambahPublikasi]");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import com.view.DialogTambahPublikasi;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class TestDialogTambahPublikasi {
    public static void main(String[] args) {
        JFrame test = new JFrame();
        DialogTambahPublikasi test1 = new DialogTambahPublikasi(test);
        test.setSize(800,700);
        test.setVisible(true);
    }
}

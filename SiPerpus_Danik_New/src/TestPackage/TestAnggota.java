package TestPackage;

import com.model.Anggota;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TestAnggota {
    public static void main(String[] args)  {
        System.out.println("~~ANGGOTA~~");
        Anggota agg1 = new Anggota();
        agg1.setNama("Denok");
        try {
            agg1.setIdAnggota("1234567890");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(TestAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Nama       : " +agg1.getNama() +
                         "\nId Anggota : " + agg1.getIdAnggota());
    }
}

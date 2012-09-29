package TestPackage;

import com.model.Anggota;

public class TestAnggota {
    public static void main(String[] args) {
        System.out.println("~~ANGGOTA~~");
        Anggota agg1 = new Anggota();
        agg1.setNama("Denok");
        agg1.setIdAnggota("k11");
        System.out.println("Nama       : " +agg1.getNama() +
                         "\nId Anggota : " + agg1.getIdAnggota());
    }
}

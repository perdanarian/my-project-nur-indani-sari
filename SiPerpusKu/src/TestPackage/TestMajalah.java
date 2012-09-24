package TestPackage;
import com.model.Majalah;
import java.util.Scanner;
public class TestMajalah {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Majalah m = new Majalah();        
       System.out.print("Masukkan id majalah                  : "); 
       String idKoleksi = sc.next(); 
       m.setIdKoleksi(idKoleksi);  
       System.out.print("Masukkan judul majalah               : "); 
       String judul = sc.next();     
       m.setJudul(judul);           
       System.out.print("Masukkan nama penulis majalah        : ");
       String penulis = sc.next();  
       m.setPenulis(penulis);     
       System.out.print("Masukkan nama penerbit majalah       : "); 
       String penerbit = sc.next(); 
       m.setPenerbit(penerbit);    
       System.out.print("Masukkan ISSN                        : "); 
       String ISSN = sc.next();    
       m.setIssn(ISSN);        
       System.out.print("Masukkan lama pinjam majalah (hari)  : "); 
       int lamaPinjam = sc.nextInt();
       System.out.println("\nDATA MAJALAH YANG DIPINJAM ;" +
                                 "\nID                     : "+m.getIdKoleksi()+
                                 "\nJUDUL                  : "+m.getJudul() +
                                 "\nPENULIS                : "+m.getPenulis() +
                                 "\nTAHUN TERBIT           : "+m.getPenerbit() +
                                 "\nISSN                   : "+m.getIssn() +
                                 "\nLAMA PINJAM (HARI)     : "+lamaPinjam +
                                 "\nMAX LAMA PINJAM (HARI) : "+m.MAX_LAMA_PINJAM +
                                 "\nTERLAMBAT              : "+m.isTerlambat(lamaPinjam) +
                                 "\nBAYAR DENDA            : "+m.hitungDenda(lamaPinjam));}
}

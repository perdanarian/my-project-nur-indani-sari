package TestPackage;       
import com.model.Buku;
import java.util.Scanner; 
public class TestBuku {   
  public static void main (String args[]) { 
     Scanner sc = new Scanner(System.in);  
       Buku c = new Buku(); 
       System.out.print("Masukkan id buku                  : ");
       String idKoleksi = sc.next();
       c.setIdKoleksi(idKoleksi); 
       System.out.print("Masukkan judul buku               : "); 
       String judul = sc.next();     
       c.setJudul(judul);            
       System.out.print("Masukkan nama penulis buku        : ");  
       String penulis = sc.next();   
       c.setPenulis(penulis);      
       System.out.print("Masukkan nama penerbit buku       : ");    
       String penerbit = sc.next(); 
       c.setPenerbit(penerbit);      
       System.out.print("Masukkan ISBN                     : ");      
       String ISBN = sc.next();     
       c.setIsbn(ISBN);            
       System.out.print("Masukkan lama pinjam buku (hari)  : ");     
       int lamaPinjam = sc.nextInt();
       System.out.println("\nDATA BUKU YANG DIPINJAM ;" +
                                 "\nID                     : "+c.getIdKoleksi()+
                                 "\nJUDUL                  : "+c.getJudul() +
                                 "\nPENULIS                : "+c.getPenulis() +
                                 "\nTAHUN TERBIT           : "+c.getPenerbit() +
                                 "\nISBN                   : "+c.getIsbn() +
                                 "\nLAMA PINJAM (HARI)     : "+lamaPinjam +
                                 "\nMAX LAMA PINJAM (HARI) : "+c.MAX_LAMA_PINJAM +
                                 "\nTERLAMBAT              : "+c.isTerlambat(lamaPinjam) +
                                 "\nBAYAR DENDA            : "+c.hitungDenda(lamaPinjam));}
} 
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     

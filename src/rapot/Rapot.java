package rapot;
import java.util.Scanner;
public class Rapot {
static Scanner input = new Scanner(System.in);
     
static void bio(){
    System.out.print("Nama :");
    String nama =input.next();
}
static void kelas(){
    System.out.print("Kelas :");
    String kelas = input.next();
}
 public static void main(String[] args) {  
 float rataRata,jum,nP,nK,nS;
 String lu;
 boolean sudah=true;

            bio();
            kelas();
        String pilih;
    
            System.out.println("Nilai Pengetahuan: ");
            nP = input.nextFloat();
            System.out.println("Nilai Keterampilan: ");
            nK = input.nextFloat();
            System.out.println("Nilai Sikap: ");
            nS = input.nextFloat();
            
            jum = nP + nK + nS; 
             rataRata = (jum)/3; 
            System.out.println("Nilai Rata-rata = "+rataRata);
    
            
            if(rataRata >=81){
             System.out.println("Grade = A");
            }else if(rataRata >= 71 ){
             System.out.println("Grade = B");
            }else if (rataRata >= 61 ){
              System.out.println("Grade = c");
            }else{
                System.out.println("Grade = e");
            }
            
        if (rataRata <= 61== rataRata>= 100) {
            lu = "Naik kelas";
        } else{
          lu = "Tidak naik kelas";
        }
       
        System.out.println("Status = " + " "+ ((lu)));
 
 
        while(sudah){
            System.out.println("Apakah sudah selesai ?");
            System.out.print("Jawab Ya atau Belum: ");
            
            pilih =input.next();
            
            if(pilih.equalsIgnoreCase("ya")){
                sudah=false;
            }
        }
 }
}
    


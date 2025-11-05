import java.util.Scanner;

public class Tugas2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int JumlahCabor = 4;
    int JumlahAtlet = 5;
    
    for (int i = 1; i <= JumlahCabor; i++) {
      String namaCabor = "";

      if (i == 1) {
        namaCabor = "Badminton";
      } else if (i == 2 ) {
        namaCabor = "Tenis Meja";
      } else if (i == 3 ) {
        namaCabor = "Basket";
      } else if (i == 4) {
        namaCabor = "Voli";
      }
      System.out.println("Input Nama Atlet Untuk Cabor Yang Diikuti " + namaCabor + " : ");

      for (int j = 1; j <= JumlahAtlet; j++) {
        System.out.print("Atlet ke-" + j + " : ");
        String NamaAtlet = input.nextLine();

        System.out.println("Tersimpan : " + NamaAtlet + "(" + namaCabor + ")");
      }
    }
    System.out.println("\n===Semua Data Atlet Telah Dimasukkan=== ");
  }
}

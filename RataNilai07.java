import java.util.Scanner;

public class RataNilai07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double nilai, totalNilai = 0, rataNilai;
    int i = 1;

    while (i <= 5) {
      System.out.println("Mahasiswa ke-" + i);
      totalNilai = 0;

      for (int j = 1; j <= 5; j++) {
        System.out.print("Nilai ke-" + j + "=");
        nilai = input.nextDouble();
        totalNilai += nilai;
      }

      rataNilai = totalNilai / 5;
      System.out.println("Rerata Nilai Mahasiswa ke-" + i + "=" + rataNilai);
      System.out.println("----------------------------------");
      i++;
    }
  }



}

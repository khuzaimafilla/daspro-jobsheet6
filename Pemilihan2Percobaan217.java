import java.util.Scanner;

public class Pemilihan2Percobaan217 {
    public static void main(String[] args) {
        Scanner input17 =  new Scanner(System.in);
        int totalSudut, sudut1, sudut2, sudut3;

        System.out.println("Masukkan Sudut 1 : ");
        sudut1 = input17.nextInt();
        System.out.println("Masukkan Sudut 3 : ");
        sudut2 = input17.nextInt();
        System.out.println("Masukkan Sudut 3 : ");
        sudut3 = input17.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga SIku2");
            } else {
                System.out.println("Bukan Segitiga SIku2");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }


    }
}

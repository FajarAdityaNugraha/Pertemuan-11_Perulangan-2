import java.util.Scanner;
public class Individu2 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.print("Masukkan nilai N= ");
        int N = input10.nextInt();
        input10.close();
        if (N < 5) {
            System.out.println("Nilai N harus minimal 5.");
            return;
        }
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
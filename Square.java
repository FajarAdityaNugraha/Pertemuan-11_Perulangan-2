/**
 * Square
 */
import java.util.Scanner;
public class Square {

    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.print("Masukkan nilai N= ");
        int N = input10.nextInt();
        for (int iOuter=1; iOuter<=N; iOuter++){
            for (int i=1; i<=N; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
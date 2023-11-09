/**
 * Quiz
 */
import java.util.Scanner;
import java.util.Random;
public class Quiz {

    public static void main(String[] args) {
        Random random10 = new Random();
        Scanner input10 = new Scanner(System.in);
        char menu='y';
        do{
            int number = random10.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10)= ");
                int answer = input10.nextInt();
                input10.nextLine();
                if (answer<number) {
                    System.out.println("Angka terlalu kecil!");
                } else if (answer>number){
                    System.out.println("Angka terlalu besar!");
                } else {
                    success = true;
                }
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan?(Y/y)= ");
            menu = input10.nextLine().charAt(0);
        } while (menu=='y' || menu=='Y');
    }
}
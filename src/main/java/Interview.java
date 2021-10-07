import java.util.Random;
import java.util.Scanner;

public class Interview {

    deposit deposit;
    Random ran = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deposit = sc.nextInt();

    }

    public double calculateBonus(double deposit) {
        // int deposit=5;
        if ( deposit > 5) {
            if (deposit <= 10) {
                return 5;
            } else {
                if (ran.nextInt(100) < 25) {
                    return deposit / 2;
                }
            }
        }
        return 0;
    }
}
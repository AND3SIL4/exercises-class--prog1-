package exercises;
import java.util.Scanner;

public class Primary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the quantity of numbers to show: ");
        int quantity = scanner.nextInt();
        int iteration = 0;
        int number = 0;

        while (iteration < quantity) {
            if (isPrime(number)) {
                System.out.println(number);
                iteration++;
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
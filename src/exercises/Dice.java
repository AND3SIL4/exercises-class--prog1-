package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the result number: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 6) {
            System.out.println("ERROR: incorrect number");
            return;
        }
        int result = dictionary().get(number);
        String word = getNumber(result);
        System.out.println("The opposite result is: " + word);
    }

    public static Map<Integer, Integer> dictionary() {
        Map<Integer, Integer> dic = new HashMap<>();
        dic.put(1, 6);
        dic.put(6, 1);
        dic.put(2, 5);
        dic.put(5, 2);
        dic.put(3, 4);
        dic.put(4, 3);
        return dic;
    }

    //Method to get the number of face
    private static String getNumber(int number) {
        return switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            default -> "ERROR: incorrect number";
        };
    }
}

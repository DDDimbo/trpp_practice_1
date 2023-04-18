package final_exam;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String result = task3(4);
    }

    public static String task3(int n) {
        if (n == 1)
            return "YES";
        if (n < 0)
            return "NO";
        if (n % 2 == 0)
            return task3(n / 2);
        else
            return "NO";
    }
}

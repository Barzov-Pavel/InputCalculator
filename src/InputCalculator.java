import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int avg = 0;
        int count = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }

            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + (Math.round((double)sum / (double)count)));
        scanner.close();
    }
}

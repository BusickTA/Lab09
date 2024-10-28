import java.util.Random;
import java.util.Scanner;

public class LinearScan9 {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        Random rnd = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int userValue = SafeInput.getRangedInt(scanner, "Please enter a value between 1 and 100", 1, 100);
        System.out.println("You entered: " + userValue);

        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the values in dataPoints is: " + sum);
        System.out.println("The average of the values in dataPoints is: " + average);

        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }

        System.out.println("The value " + userValue + " was found " + count + " time(s) in the dataPoints array.");

        scanner.close();
    }
}
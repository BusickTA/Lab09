import java.util.Random;

public class Array4 {

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


        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the values are: " + sum);
        System.out.println("The average of the values are: " + average);
    }
}

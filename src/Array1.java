import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] grades = new int[100];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = rand.nextInt(31) + 70; //70-100
        }

        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + "  ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

}

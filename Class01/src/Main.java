import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanenr;
        Locale.setDefault(Locale.US);

        int inputInterger = sc.nextInt();

        int[] inputArray = new int[inputInterger];

        for (int position = 0; position < inputInterger; position++) {
            inputArray[position] = sc.nextInt();
        }
        String inputString = sc.nextLine();

        new LearningBasics(inputInterger,inputArray,inputString); // Create Object

    }
}
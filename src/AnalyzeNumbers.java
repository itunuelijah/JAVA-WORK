import java.util.Scanner;

public class AnalyzeNumbers {

    public static void main(String[] args) {
        System.out.print("Enter the number of items: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[] myList = new double[n];

        double total = 0;
        System.out.print("Enter " + n + " values: ");
        for (int i = 0; i < n; i++) {
            myList[i] = input.nextDouble();
            total += myList[i];
        }
        System.out.print( total);
    }

}

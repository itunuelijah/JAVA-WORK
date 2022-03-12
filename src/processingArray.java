import java.util.Scanner;

public class processingArray {


    public static void main(String[] args) {
        double[] myList = new double[6];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++)
            myList[i] = input.nextDouble();

        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() ;
        }

        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }



        for (int i = myList.length-1; i > 0; i--) {
// Generate an index j randomly with 0 <= j <= i
            int j = (int)(Math.random()
                    * (i + 1));
// Swap myList[i] with myList[j]
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }



        double temp = myList[0]; // Retain the first element
// Shift elements left
        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];
        }
// Move the first element to fill in the last position
        myList[myList.length - 1] = temp;




        for (int i = 0; i < myList.length; i++) {
            System.out.print(max + " ");
        }

    }
}

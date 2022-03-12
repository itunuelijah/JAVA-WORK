package arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //code fragment 1
        int[] number = {1,2,3,4,5};
        for (int i = 0; i < number.length; i++) {
            if ( i % 2 == 0 ) {
                System.out.println( number[i] );
            }
        }
    }
}

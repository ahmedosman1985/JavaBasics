package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] numbers=new int [5];
        //below code manually store numbers in the array
        /*numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;
        */

        // Below code take the numbers from user and store them in the array it's good but a lot of code
        /*numbers[0]= scanner.nextInt();
        numbers[1]=scanner.nextInt();
        numbers[2]=scanner.nextInt();
        numbers[3]=scanner.nextInt();
        numbers[4]=scanner.nextInt();
        */
        // print the numbers in array without a loop

        //Below code ises a normal for loop to ask the user for numbers nd store them in array
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=scanner.nextInt();

        }

        System.out.println(Arrays.toString(numbers));


    }
}

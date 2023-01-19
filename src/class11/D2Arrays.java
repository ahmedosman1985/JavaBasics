package class11;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {

        int [][] matrix= {{10, 20, 30},
                          {45, 55, 66},
                          {30,40,20,10,25}
        };
        System.out.println(matrix[2][4]);

        // print elements from first row(Array)
        System.out.println(Arrays.toString(matrix[0]));
        //with the help of a loop
        for (int i = 0; i < matrix[0].length ; i++) {
            System.out.println(matrix[0][i]);
        }
        System.out.println("*********");
        int[] arr=matrix[0]; // getting complete first array from 2d array
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}

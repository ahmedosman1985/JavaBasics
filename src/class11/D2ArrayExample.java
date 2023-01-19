package class11;

public class D2ArrayExample {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                         {45, 55, 66},
                        {30, 40, 20, 10, 25}
        };
        //Write a loop to print akk the elements from this 2D array
        ////This loop will go through rows (my comment)
        //matrix.length tells us how many 1D arrays are present in the 2D array
        for (int i = 0; i < matrix.length ; i++) {
            //this loop will go through columns (my comment)
            //matrix[i].length the size of each 1D array
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println();

        }
    }
}
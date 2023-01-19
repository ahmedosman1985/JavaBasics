package class11;

public class D2ArrayExample1Extension {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                         {45, 55, 66},
                        {30, 40, 20, 10, 25}
        };

        //print using enhanced for loop

        for(int[] arr:matrix){
            for(int number:arr){
                System.out.print(number+" ");
            }
            System.out.println();
        }

    }
}
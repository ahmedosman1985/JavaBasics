package class8;

public class NestedLoops2 {
    public static void main(String[] args) {

        for (int i = 0; i <3 ; i++) { //controls the lines

            for (int j = 0; j <5 ; j++) { //controls the stars in every line
                if(j==1||j==2){
                    continue;
                }
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}

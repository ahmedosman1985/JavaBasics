package class7;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int number=0; //creating a variable of type int
        while(number<10){ //checks the condtition if condition is true to execute the code in the body of while loop
            System.out.println(number);//prints the value of number
            number++;

        }
        //(initialize;condtion;incrementORdecrement)

        for (int i=0;i<10;i++){
            System.out.println(i);
        }
        //using a for loop print odd numbers from 1 to 20;
        for(int num=1;num<20;num+=2){
            System.out.println(num);
        }

    }
}

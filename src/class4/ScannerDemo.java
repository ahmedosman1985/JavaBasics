package class4;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        //below line helps us get the input from the keyboard
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=input.nextLine(); // nextline is used when we have to take sentences from the keybpard
        System.out.println("My Name is "+name);



    }
}

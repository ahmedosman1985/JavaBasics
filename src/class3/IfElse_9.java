package class3;

import java.sql.SQLOutput;

public class IfElse_9 {
    public static void main(String[] args) {

        char c='M';

        if(c=='M'){
            System.out.println("male");
        }

        String name="Nat";
        //with non-primitive data types such as String we can't use == symbol
        if(name.equals("Sam")){
            System.out.println("Amazing student");

            if(!name.equals("Sam")){
                System.out.println("SuperAmazing student");
        }
    }
}}

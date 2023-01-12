package class6;

import java.sql.SQLOutput;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="USA";
        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){ // converts the text to lowercase USA =>usa

            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("kabab");
                break;
            default:
                System.out.println("wrong country");

    }
}}

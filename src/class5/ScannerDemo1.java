package class5;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*System.out.println("Please Enter your age");
        int age=scan.nextInt();
        System.out.println("you are "+age+" years old");

        System.out.println("Please enter your weight");
        double weight= scan.nextDouble();
        System.out.println("your weight is "+weight+" kgs");
        System.out.println("are you hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+ hungry);*/

        /*System.out.println("Please nter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your gender is "+gender);*/

        /*System.out.println("Please Enter your name");
        String name=scan.next(); // will take only the first word, but we use nextLine if we wanna take the whole
        System.out.println("Your name is "+name);*/

        scan.nextLine();// trick to make nextlINE METHOD WORK AFTER WE HAVE USED ANY OTHER METHOD FROM scanner class
        System.out.println("pleae enter your full name");
        String fullName=scan.nextLine();
        System.out.println("your full name is "+fullName);
        scan.close();//to close the scan (importing from user input)

    }
}

package class10;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int [] numbers={10,20,30,40,50};
        System.out.println(numbers[0]);

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("****************");

        // Enhanced/foreach for loop
        for (int number:numbers){
            System.out.println(number);
        }
    }
}

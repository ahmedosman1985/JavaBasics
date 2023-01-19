package class10;
/*
Limitation of Foreach loop
 */
public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        int [] arr={10,13,20,25,45,50};

        //print only the odd numbers from this array with help of normal for loop
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }

        }
        System.out.println("************");
        // Replace all the odd numbers in this array with the help of a normal loop
        for (int i=0;i< arr.length;i++){
            if(arr[i]%2!=0){
                arr[i]=0;
            }
        }
        System.out.println("After Replacing all odd numbers with zero");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }




}}

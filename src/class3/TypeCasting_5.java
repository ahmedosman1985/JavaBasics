package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        //byte shorterNumber=number; we will have error - TypeCasting is about forcing java
        byte shorterNumber=(byte) number;
        float f=10.5f;
        int num= (int)f;
        System.out.println(shorterNumber);
        System.out.println(num);

        /*
        byte/short/int/long/float/double
        from bigger to smaller java will ccomplain that's when we force it but doesn't happen in the opposit
        from small to larger
         */
        byte b=10;
        int number2=b;
        short c=(short) number2;
        System.out.println(b);

        float eggs=12.5f;
        int wholePart= (int)eggs; //type casting we are converting from float to an int
System.out.println(wholePart);

    }
}

import java.util.Arrays;
import java.util.Date;

public class HelloMain {
    public static void main(String[] args) {
        int Age = 24 ;
        float Pricing = 102.34F;

        String message = "Hi My name is \"Abbas\"";

        Date today = new Date();


                System.out.println(message.replace("is", "was"));
                System.out.println(message);
                System.out.println(Age);
                System.out.println(today);
                System.out.println(Pricing);
                /*Ive been playing with integers,strings,boolean.
         /*Also primitive types and reference types as well as some escape sequences
         /*Pretty much Learning to Java
         */

        /*now trying out arrays using integers
         */
        /*int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 2;
        /*Introduced array util below to make numbers in this integer above readable
        and not bring out locations or something else.
        But as we all know this syntax style shown above is outdated
         */
        int[] numbers = {2,3,4,5,1};
       /* Arrays.toString(numbers); function arranges my integers listed in order as string
       */
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

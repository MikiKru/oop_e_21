package lecture2;

import java.util.Arrays;

public class NumericOperations {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,5,4,3,21,7,6};
        // loop foreach
        System.out.println("foreach");
        for(int number : numbers){
            System.out.println(number);
        }
        System.out.println("for");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("STREAM API");
        // CTRL + Space -> gererate predicate
        Arrays.stream(numbers)                              // convert to Stream<Integer>
            .forEach(number -> System.out.println(number)); // void -> return nothing

    }
}

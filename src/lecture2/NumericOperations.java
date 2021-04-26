package lecture2;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class NumericOperations {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,5,4,3,21,7,6};
//        // loop foreach
//        System.out.println("foreach");
//        for(int number : numbers){
//            System.out.println(number);
//        }
//        System.out.println("for");
//        for(int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
        System.out.println("STREAM API");
        // CTRL + Space -> gererate predicate
        Arrays.stream(numbers)                              // convert to Stream<Integer>
            .forEach(number -> System.out.println(number)); // void -> return nothing
        // FILTER ONLY EVEN VALUES FROM ARRAY
        // 4 / 2 = 2*2 | 0
        // 5 / 2 = 2*2 | 1
        // 7 / 2 = 3*2 | 1
        // 5 % 2 = 1
        // 99 % 2 = 1 -> 49 * 2 + 1
        System.out.println("EVEN ELEMENTS");
        Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));
        System.out.println("COUNT ALL EVEN ELEMENTS");
        long countEvens = Arrays.stream(numbers).filter(number -> number % 2 == 0).count();
        System.out.println("How many even elements? " + countEvens);
        System.out.println("COUNT ALL UNIQUE ELEMENTS");
        Arrays.stream(numbers)      // Stream<Integer>
                .distinct()         // Stream<Integer>
                .forEach(number -> System.out.println(number));
        long countUniques = Arrays.stream(numbers)      // Stream<Integer>
                .distinct()         // Stream<Integer>
                .count();
        System.out.println("How many unique elements? " + countUniques);
        System.out.println("MAX: " + Arrays.stream(numbers).max().getAsInt());
        System.out.println("MIN: " + Arrays.stream(numbers).min().getAsInt());
        System.out.println("AVG: " + Arrays.stream(numbers).average().getAsDouble());
        int searchValue = 99;
        System.out.println("TRY TO FIND VALUE " + searchValue);
        OptionalInt optionalInt = Arrays.stream(numbers).filter(number -> number == searchValue).findFirst();
        if(optionalInt.isPresent()){        // if true means that value is found
            System.out.println("FOUND: " + optionalInt.getAsInt());
        } else {                            // else value is not found
            System.out.println("There is no value "+ searchValue + " in our array");
        }
        System.out.println("CONVERSION");
        List<Integer> numbersInList = Arrays.stream(numbers)    // Stream<int>
                .boxed()                                        // Stream<Integer>
                .collect(Collectors.toList());                  // List<Integer>
        System.out.println(numbersInList);

    }
}

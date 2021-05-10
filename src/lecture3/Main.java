package lecture3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<Task> tasks = new ArrayList<>(
            Arrays.asList(
                    new Task("T1", LocalDate.now(), LocalDate.of(2021,6,6),Category.IN_PROGRESS),
                    new Task("T2", LocalDate.now(), LocalDate.of(2021,7,23),Category.IN_PROGRESS),
                    new Task("T3", LocalDate.now(), LocalDate.of(2021,9,14),Category.CREATED),
                    new Task("T4", LocalDate.now(), LocalDate.of(2021,1,3),Category.DONE),
                    new Task("T5", LocalDate.now(), LocalDate.of(2021,12,1),Category.CREATED)
            )
    );

    public static void main(String[] args) {
        System.out.println();
    }
}

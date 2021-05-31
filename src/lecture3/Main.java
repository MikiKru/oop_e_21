package lecture3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("TASKS - elements");
        tasks.stream().forEach(task -> System.out.println(task));
        System.out.println("IN PROGRESS TASKS");
        tasks.stream()
                .filter(task -> task.getCategory() == Category.DONE)
                .forEach(task -> System.out.println(task));
        System.out.println("AGGREGATING TASKS BY CATEGORY");
        // in progress - 2
        // created - 2
        // done - 1
        System.out.println(tasks.stream().collect(Collectors.groupingBy(Task::getCategory)));
        System.out.println("TASK TO STRING");
        String resultToFile = String.format("| %20s | %12s | %12s | %12s |\n",
                "TITLE", "START", "STOP", "CATEGORY")+
                tasks.stream()
                .map(task -> String.valueOf(task.toString()))
                .collect(Collectors.joining("\n"));
        System.out.println(resultToFile);
        File file = new File("task.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(resultToFile);
        printWriter.close();

    }
}

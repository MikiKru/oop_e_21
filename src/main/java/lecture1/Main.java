package lecture1;

import java.time.LocalDateTime;

// CTRL + /     -> comment
// CTRL + D     -> duplication of the line
// psvm         -> public static void main(String[] args) {}
// sout         -> System.out.println();
public class Main {
    public static void main(String[] args) {
        // Type objectName = new Type();
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = task1;
//        System.out.println(task1);
//        System.out.println(task2);
// TASK 1
        task1.setTaskTitle("OOP learning");
        task1.setTaskDeadline(LocalDateTime.now());
        System.out.println("Task1 title: " + task1.getTaskTitle());
        System.out.println("Task1 deadline: " + task1.getTaskDeadline());
// TASK 2
        System.out.println("Task2 title: " + task2.getTaskTitle());
        System.out.println("Task2 deadline: " + task2.getTaskDeadline());
// TASK 3
        System.out.println("Task3 title: " + task3.getTaskTitle());
        System.out.println("Task3 deadline: " + task3.getTaskDeadline());
        System.out.println(task1.toString());
        System.out.println(task2);
        System.out.println(task3);
        Task task4 = new Task("New task name", LocalDateTime.now());
        System.out.println(task4);

    }
}

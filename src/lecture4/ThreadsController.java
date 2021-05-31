package lecture4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreadsController {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        // Each program use main thread as default
        System.out.println("Main thread name: " + Thread.currentThread().getName());
        List<Integer> numbers = new ArrayList<>();
        // create the thread
        Thread thread1 = new Thread(new Runnable() {                    // NEW
            @Override
            public void run() {     // this method implements thread body
                for(int i = 0; i < 10; i++){
                    try {
                        Thread.currentThread().sleep(1_000);        // TIME WAITED
                        System.out.println("ADD");
                        numbers.add(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // TERMINATED
            }
        });
        Thread thread2 = new Thread(new Runnable() {                    // NEW
            @Override
            public void run() {     // this method implements thread body
                try {
                    thread1.join();                                 // currentThread wait for thread1 results
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i = 0; i < 10; i++){
                    try {
                        Thread.currentThread().sleep(500);        // TIME WAITED
                        System.out.println("REMOVE");
                        numbers.remove(0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // TERMINATED
            }
        });
        thread1.start();     // RUNNABLE
        thread2.start();     // RUNNABLE
        // here we are in main thread
        Scanner scanner = new Scanner(new File("task.txt"));
        while (scanner.hasNextLine()){
            Thread.currentThread().sleep(500);
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}

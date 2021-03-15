package lecture1;

import java.time.LocalDateTime;

public class Task {
    // fields -> variables
    private String taskTitle;
    private LocalDateTime taskDeadline;
    // constructor -> initialize the object
    public Task(){}     // default constructor
    // ALT + Ins   -> generate -> constructor
    public Task(String taskTitle, LocalDateTime taskDeadline) {
        this.taskTitle = taskTitle;
        this.taskDeadline = taskDeadline;
    }
    // toString -> text representation of the object
    @Override
    public String toString() {
        return "Task{" +
                "taskTitle='" + taskTitle + '\'' +
                ", taskDeadline=" + taskDeadline +
                '}';
    }

    // method -> getter
    public String getTaskTitle(){
        return taskTitle;
    }
    public LocalDateTime getTaskDeadline(){
        return taskDeadline;
    }
    // method -> setter
    public void setTaskTitle(String taskTitle){
        // this -> object
        this.taskTitle = taskTitle;
    }
    public void setTaskDeadline(LocalDateTime taskDeadline) {
        this.taskDeadline = taskDeadline;
    }
}

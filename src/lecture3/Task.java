package lecture3;

import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate createdDate;
    private LocalDate deadlineDate;
    private Category category;
    // ALT + Insert -> constructor
    public Task(String title, LocalDate createdDate, LocalDate deadlineDate, Category category) {
        this.title = title;
        this.createdDate = createdDate;
        this.deadlineDate = deadlineDate;
        this.category = category;
    }
    // ALT + Insert -> toString()
    @Override
    public String toString() {
        return String.format("| %20s | %12s | %12s | %12s |", title, createdDate, deadlineDate, category.getCategoryName());
    }
    // ALT + Insert -> g & s
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public LocalDate getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }
    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}

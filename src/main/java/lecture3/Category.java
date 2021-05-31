package lecture3;

public enum Category {
    CREATED("created"),
    IN_PROGRESS("in progress"),
    DONE("done");

    public String getCategoryName() {
        return categoryName;
    }

    private final String categoryName;
    // ALT + Insert -> generate
    Category(String categoryName) {
        this.categoryName = categoryName;
    }
}

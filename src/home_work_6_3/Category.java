package home_work_6_3;

import java.io.File;

public class Category {
    private long categoryId;
    private String categoryName;
    private String description;
    private File picture;

    public Category(long categoryId, String categoryName, String description, File picture) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
        this.picture = picture;
    }
}

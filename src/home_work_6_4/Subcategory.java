package home_work_6_4;

import java.util.Date;

public class Subcategory {
    private long id;
    private TorumCategory torumCategory;
    private String title;
    private String description;
    private Date subcatDate;
    private String ip;

    public Subcategory(long id, TorumCategory torumCategory, String title, String description, Date subcatDate, String ip) {
        this.id = id;
        this.torumCategory = torumCategory;
        this.title = title;
        this.description = description;
        this.subcatDate = subcatDate;
        this.ip = ip;
    }
}

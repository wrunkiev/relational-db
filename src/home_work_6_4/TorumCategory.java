package home_work_6_4;

import java.util.Date;

public class TorumCategory {
    private long id;
    private String title;
    private String description;
    private Date catDate;
    private String ip;

    public TorumCategory(long id, String title, String description, Date catDate, String ip) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.catDate = catDate;
        this.ip = ip;
    }
}

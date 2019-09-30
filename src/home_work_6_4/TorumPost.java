package home_work_6_4;

import java.util.Date;

public class TorumPost {
    private long id;
    private Subcategory subcategory;
    private User user;
    private TorumPost parentPost;
    private String title;
    private String content;
    private boolean isPoll;
    private Date postDate;
    private String ip;

    public TorumPost(long id,
                     Subcategory subcategory,
                     User user,
                     TorumPost parentPost,
                     String title,
                     String content,
                     boolean isPoll,
                     Date postDate,
                     String ip) {
        this.id = id;
        this.subcategory = subcategory;
        this.user = user;
        this.parentPost = parentPost;
        this.title = title;
        this.content = content;
        this.isPoll = isPoll;
        this.postDate = postDate;
        this.ip = ip;
    }
}

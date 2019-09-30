package home_work_6_4;

import java.util.Date;

public class TorumPollOption {
    private long id;
    private TorumPost torumPost;
    private String title;
    private Date pollDate;

    public TorumPollOption(long id, TorumPost torumPost, String title, Date pollDate) {
        this.id = id;
        this.torumPost = torumPost;
        this.title = title;
        this.pollDate = pollDate;
    }
}

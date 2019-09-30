package home_work_6_4;

import java.util.Date;

public class TorumPollOptionVote {
    private long id;
    private TorumPollOption torumPollOption;
    private User user;
    private Date pollOptionVoteDate;
    private String ip;

    public TorumPollOptionVote(long id, TorumPollOption torumPollOption, User user, Date pollOptionVoteDate, String ip) {
        this.id = id;
        this.torumPollOption = torumPollOption;
        this.user = user;
        this.pollOptionVoteDate = pollOptionVoteDate;
        this.ip = ip;
    }
}

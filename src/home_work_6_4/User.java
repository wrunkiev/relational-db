package home_work_6_4;

import java.util.Date;

public class User {
    private long id;
    private String nick;
    private String password;
    private String email;
    private Date userDate;
    private float karma;
    private String ip;

    public User(long id, String nick, String password, String email, Date userDate, float karma, String ip) {
        this.id = id;
        this.nick = nick;
        this.password = password;
        this.email = email;
        this.userDate = userDate;
        this.karma = karma;
        this.ip = ip;
    }
}

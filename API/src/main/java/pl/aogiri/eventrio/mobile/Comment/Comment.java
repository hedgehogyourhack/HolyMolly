package pl.aogiri.eventrio.mobile.Comment;

import pl.aogiri.eventrio.mobile.User.User;

import javax.persistence.*;

@Entity
public class Comment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToOne
    private User user;

    private String content;

    private String date;

    public Comment() {
    }

    public Comment(User user, String content, String date) {
        this.user = user;
        this.content = content;
        this.date = date;
    }

    public Comment(Long id, User user, String content, String date) {
        this.id = id;
        this.user = user;
        this.content = content;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

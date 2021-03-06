package pl.aogiri.eventrio.mobile.User;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String pseudonym;

    private String gender;

    @NotNull
    private int lvl;

    private Instant birthday;

    public User() {
    }

    public User(String email, String password, String pseudonym, String gender, Instant birthday, int lvl) {
        this.email = email;
        this.password = password;
        this.pseudonym = pseudonym;
        this.gender = gender;
        this.birthday = birthday;
        this.lvl=lvl;
    }

    public User(Long id, String email, String password, String pseudonym, String gender, Instant birthday, int lvl) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.pseudonym = pseudonym;
        this.gender = gender;
        this.birthday = birthday;
        this.lvl=lvl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Instant getBirthday() {
        return birthday;
    }

    public void setBirthday(Instant birthday) {
        this.birthday = birthday;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}

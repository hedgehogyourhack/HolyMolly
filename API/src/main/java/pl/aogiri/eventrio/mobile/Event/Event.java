package pl.aogiri.eventrio.mobile.Event;

import java.time.Instant;
import java.util.List;

import com.sun.istack.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import pl.aogiri.eventrio.mobile.Comment.Comment;
import pl.aogiri.eventrio.mobile.Tag.Tag;
import pl.aogiri.eventrio.mobile.User.User;

import javax.persistence.*;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull
    private String name;

    @NotNull
    private double lat;

    @NotNull
    private double lng;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Europe/Warsaw")
    @NotNull
    private Instant dateBeg;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Europe/Warsaw")
//	@NotNull
    private Instant dateEnd;

//  @NotNull
//  private Binary image;

    private String address;

    private int status;

    @NotNull
    private Boolean publi;

    private String description;

    @OneToOne
    private User organizer;

    @ManyToMany
    private List<Tag> tags;

    @OneToMany
    private List<Comment> comments;

    @NotNull
    private int lvl;

    public Event() {
    }

    public Event(Long id, String name, double lat, double lng, Instant dateBeg, Instant dateEnd, String address,
                 int status, Boolean publi, String description, User organizer, List<Tag> tags,
                 List<Comment> comments, int lvl) {
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.dateBeg = dateBeg;
        this.dateEnd = dateEnd;
        this.address = address;
        this.status = status;
        this.publi = publi;
        this.description = description;
        this.organizer = organizer;
        this.tags = tags;
        this.comments = comments;
        this.lvl = lvl;
    }

    public Event(String name, double lat, double lng, Instant dateBeg, Instant dateEnd, String address,
                 int status, Boolean publi, String description, User organizer, List<Tag> tags, int lvl) {
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.dateBeg = dateBeg;
        this.dateEnd = dateEnd;
        this.address = address;
        this.status = status;
        this.publi = publi;
        this.description = description;
        this.organizer = organizer;
        this.tags = tags;
        this.lvl = lvl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getOrganizer() {
        return organizer;
    }

    public void setOrganizer(User organizer) {
        this.organizer = organizer;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public Instant getDateBeg() {
        return dateBeg;
    }

    public void setDateBeg(Instant dateBeg) {
        this.dateBeg = dateBeg;
    }

    public Instant getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Instant dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Boolean getPubli() {
        return publi;
    }

    public void setPubli(Boolean publi) {
        this.publi = publi;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}

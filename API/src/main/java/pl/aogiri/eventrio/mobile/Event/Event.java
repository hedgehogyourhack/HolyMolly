package pl.aogiri.eventrio.mobile.Event;

import java.time.Instant;

import com.sun.istack.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    public Event(String name, double lat, double lng, Instant dateBeg, Instant dateEnd, String address, int status, Boolean publi) {
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.dateBeg = dateBeg;
        this.dateEnd = dateEnd;
        this.address = address;
        this.status = status;
        this.publi = publi;
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
}

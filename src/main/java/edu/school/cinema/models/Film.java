package edu.school.cinema.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Films")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "release")
    private String release;

    @Column(name = "age_restriction")
    private String age_restriction;

    @Column(name = "description")
    private String desceiption;

    public Film(Long id, String title, String release, String age_restriction, String desceiption) {
        this.id = id;
        this.title = title;
        this.release = release;
        this.age_restriction = age_restriction;
        this.desceiption = desceiption;
    }

    public Film() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getAge_restriction() {
        return age_restriction;
    }

    public void setAge_restriction(String age_restriction) {
        this.age_restriction = age_restriction;
    }

    public String getDesceiption() {
        return desceiption;
    }

    public void setDesceiption(String desceiption) {
        this.desceiption = desceiption;
    }
}

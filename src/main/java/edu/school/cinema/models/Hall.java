package edu.school.cinema.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Halls")
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seat")
    private int seat;

    public Hall() {
    }

    public Hall(Long id, int seat) {
        this.id = id;
        this.seat = seat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}

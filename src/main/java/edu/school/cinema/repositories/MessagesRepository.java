package edu.school.cinema.repositories;

import edu.school.cinema.models.Film;
import edu.school.cinema.models.Hall;

import java.util.List;

public interface MessagesRepository {

    List<Hall> findAllHalls();
    List<Film> findAllFilms();
}

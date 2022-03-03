package edu.school.cinema.repositories;

import edu.school.cinema.models.Film;
import edu.school.cinema.models.Hall;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Component
public class MessagesRepositoryEntityManagerImpl implements MessagesRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Hall> findAllHalls() {
        return entityManager.createQuery("from Hall", Hall.class).getResultList();
    }

    @Override
    public List<Film> findAllFilms() {
        return null;
    }
}

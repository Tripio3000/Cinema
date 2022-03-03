package edu.school.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomRepository extends JpaRepository<Object, Object>, MessagesRepository{

}

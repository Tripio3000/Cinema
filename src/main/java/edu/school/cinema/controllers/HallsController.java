package edu.school.cinema.controllers;

import edu.school.cinema.repositories.Dao;
import edu.school.cinema.repositories.MessagesRepositoryEntityManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HallsController {

    private MessagesRepositoryEntityManagerImpl messagesRepositoryEntityManager;

    public HallsController(MessagesRepositoryEntityManagerImpl messagesRepositoryEntityManager) {
        this.messagesRepositoryEntityManager = messagesRepositoryEntityManager;
    }

    //    private final Dao dao;
//
//    @Autowired
//    public HallsController(Dao dao) {
//        this.dao = dao;
//    }

    @GetMapping("/halls")
    public String showAllHalls(Model model) {
        model.addAttribute("allhalls", messagesRepositoryEntityManager.findAllHalls());
        return "admin/panel/allhalls";
//        return null;
    }

    @GetMapping("/{id}")
    public String showHallById(@PathVariable("id") int id, Model model) {
//        model.addAttribute("hall", dao.findById(id));
//        return "admin/panel/hall";
        return null;
    }
}

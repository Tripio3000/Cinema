package edu.school.cinema.repositories;
//
//import edu.school.cinema.models.Hall;
//import edu.school.cinema.utils.HibernateSessionFactoryUtil;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
public class Dao {
//
//    public Hall findById(int id) {
//        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Hall.class, id);
//    }
//
//    public void save(Hall user) {
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        Transaction tx1 = session.beginTransaction();
//        session.save(user);
//        tx1.commit();
//        session.close();
//    }
//
//    public void update(Hall user) {
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        Transaction tx1 = session.beginTransaction();
//        session.update(user);
//        tx1.commit();
//        session.close();
//    }
//
//    public void delete(Hall user) {
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        Transaction tx1 = session.beginTransaction();
//        session.delete(user);
//        tx1.commit();
//        session.close();
//    }
//
//    public List<Hall> findAll() {
//        List<Hall> users = (List<Hall>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Hall").list();
//        return users;
//    }
}

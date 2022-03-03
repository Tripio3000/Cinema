package edu.school.cinema.utils;
//
//import edu.school.cinema.models.Film;
//import edu.school.cinema.models.Hall;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//
public class HibernateSessionFactoryUtil {
//    private static SessionFactory sessionFactory;
//
//    private HibernateSessionFactoryUtil() {}
//
//    public static SessionFactory getSessionFactory() {
//        if (sessionFactory == null) {
//            try {
//                Configuration configuration = new Configuration().configure();
//                configuration.addAnnotatedClass(Film.class);
//                configuration.addAnnotatedClass(Hall.class);
//                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
//                sessionFactory = configuration.buildSessionFactory(builder.build());
//
//            } catch (Exception e) {
//                System.out.println("Исключение!" + e);
//            }
//        }
//        return sessionFactory;
//    }
}

package com.exam.service;

import com.exam.entity.Phone;
import com.exam.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhoneService {

    private static Logger LOGGER = Logger.getLogger(PhoneService.class.getSimpleName());


    public boolean save(Phone phone) {
        LOGGER.log(Level.INFO, String.format("Try to save student with rollNumber %s", phone.getId()));
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(phone);
            session.getTransaction().commit();
            LOGGER.log(Level.INFO, String.format("Save success..."));
        } catch (Exception $e) {
            LOGGER.log(Level.INFO, String.format("Error when save student with rollNumber %s ", phone.getId()));
        }
        return false;
//
//        Transaction transaction = null;
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            transaction = session.beginTransaction();
//            session.save(Phone.Builder.aPhone()
//                    .withId("A123")
//                    .withName("Iphone 8")
//                    .withBrand("Apple")
//                    .withPrice((long) 10000000)
//                    .withDescription("Phone's Quyen")
//                    .build());
//            transaction.commit();
//        } catch (Exception $e) {
//            if (transaction == null) {
//                transaction.rollback();
//            }
//            $e.printStackTrace();
//            LOGGER.log(Level.INFO, String.format("Error when save student with rollNumber %s ", phone.getId()));
//        }
//        return false;
    }

    public List<Phone> getPhone() {

        LOGGER.log(Level.INFO, String.format("Try to save student with rollNumber %s", phone.getId()));
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            List<Phone> labels = session.createQuery("from Label", Label.class)
                    .list();
            session.getTransaction().commit();
            LOGGER.log(Level.INFO, String.format("Save success..."));
        } catch (Exception $e) {
            LOGGER.log(Level.INFO, String.format("Error when save student with rollNumber %s ", phone.getId()));
        }
        return false;
    }
}

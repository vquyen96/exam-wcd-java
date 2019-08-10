package com.exam.config;

import com.exam.entity.Phone;
import com.exam.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainThread {
    public static void main(String[] args) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(Phone.Builder.aPhone()
                    .withId("A123")
                    .withName("Iphone 8")
                    .withBrand("Apple")
                    .withPrice((long) 10000000)
                    .withDescription("Phone's Quyen")
                    .build());
            transaction.commit();
        } catch (Exception $e) {
            if (transaction == null) {
                transaction.rollback();
            }
            $e.printStackTrace();
        }
    }
}

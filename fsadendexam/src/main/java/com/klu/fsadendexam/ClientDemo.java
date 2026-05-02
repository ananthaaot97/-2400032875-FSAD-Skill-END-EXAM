package com.klu.fsadendexam;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

public class ClientDemo
{
    public static void main(String[] args)
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();

        // -------- INSERT --------
        Transaction tx = session.beginTransaction();

        Transport t1 = new Transport("Bus", new Date(), "Active", "Public");
        Transport t2 = new Transport("Train", new Date(), "Active", "Rail");
        Transport t3 = new Transport("Truck", new Date(), "Inactive", "Goods");

        session.save(t1);
        session.save(t2);
        session.save(t3);

        tx.commit();

        // -------- FETCH USING HQL --------
        session.beginTransaction();

        String hql = "FROM Transport";
        Query<Transport> query = session.createQuery(hql, Transport.class);

        List<Transport> list = query.getResultList();

        System.out.println("---- Transport Records ----");

        for (Transport t : list)
        {
            System.out.println(
                    t.getId() + " | " +
                    t.getName() + " | " +
                    t.getDate() + " | " +
                    t.getStatus() + " | " +
                    t.getType()
            );
        }

        session.getTransaction().commit();

        session.close();
        sf.close();
    }
}
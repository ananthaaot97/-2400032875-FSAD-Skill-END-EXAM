package com.klu.transport_hql_demo;

import java.util.*;

public class ClientDemo {

    public static void main(String[] args) {

        // -------- INSERT (simulated persistence) --------
        List<Transport> list = new ArrayList<>();

        list.add(new Transport(1, "Bus", new Date(), "Active", "Public"));
        list.add(new Transport(2, "Train", new Date(), "Active", "Rail"));
        list.add(new Transport(3, "Truck", new Date(), "Inactive", "Goods"));

        // -------- HQL Simulation --------
        String hql = "FROM Transport";  // just for display

        System.out.println("Executing HQL: " + hql);
        System.out.println("---- Transport Records ----");

        for (Transport t : list) {
            System.out.println(
                    t.getId() + " | " +
                    t.getName() + " | " +
                    t.getDate() + " | " +
                    t.getStatus() + " | " +
                    t.getType()
            );
        }
    }
}
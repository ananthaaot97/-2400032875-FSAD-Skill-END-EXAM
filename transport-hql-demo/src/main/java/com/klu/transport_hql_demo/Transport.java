package com.klu.transport_hql_demo;

import java.util.Date;

public class Transport {

    private int id;
    private String name;
    private Date date;
    private String status;
    private String type;

    public Transport(int id, String name, Date date, String status, String type) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.status = status;
        this.type = type;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public Date getDate() { return date; }
    public String getStatus() { return status; }
    public String getType() { return type; }
}
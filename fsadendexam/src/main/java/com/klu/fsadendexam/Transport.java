package com.klu.fsadendexam;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transport")
public class Transport
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String status;

    private String type;

    public Transport() {}

    public Transport(String name, Date date, String status, String type)
    {
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

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDate(Date date) { this.date = date; }
    public void setStatus(String status) { this.status = status; }
    public void setType(String type) { this.type = type; }
}
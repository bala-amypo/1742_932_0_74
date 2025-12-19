package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="Location")
public class Location{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private Double latitude;
    private Double 


}
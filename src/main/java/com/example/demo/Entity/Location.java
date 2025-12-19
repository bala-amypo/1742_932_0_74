package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="Location")
public class Location{

    public Location(){

    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private Double latitude;
    private Double longitude;
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLatitude(Double latitude)




}
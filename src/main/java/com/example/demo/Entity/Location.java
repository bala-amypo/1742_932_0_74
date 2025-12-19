package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="Location")
public class Location{

    public Location(){

    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;
    public Long getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLatitude(Double latitude){
        this.latitude = latitude;
    }
    public Double getLatitude(){
        return latitude;
    }
    public void setLongitude(Double longitude){
        this.longitude = longitude;
    }
    public Double getLongitude(){
        return longitude;   
    }




}
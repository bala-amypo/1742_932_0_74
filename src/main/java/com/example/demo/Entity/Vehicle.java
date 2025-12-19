package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Vehicle",uniqueConstraints={
    @UniqueConstraint(columnNames="vehicleNumber")
})
public class Vehicle{
    public Vehicle(){

    }
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="user_id",nullable=false)
    private User user;
    private String vehicleNumber;
    private Double capacitykg;
    private Double fuelEfficiency;

    public Long getId(){
        return id;
    }
    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public void setCapacitykg(Double capacitykg){
        this.capacitykg = capacitykg;
    }
    public Double getCapacitykg(){
        return capacitykg;
    }
    public void setUser(User user){
        this.user = user;
    }
    public User getUser(){
        return user;
    }
    public void setFuelEfficiency(Double fuelEfficiency ){
        this.fuelEfficiency = fuelEfficiency;
    }
    public Double getFuelEfficiency(){
        return fuelEfficiency;
    }

    

}
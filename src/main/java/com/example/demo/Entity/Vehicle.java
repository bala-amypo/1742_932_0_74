package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Vehicle",uniqueConstraints={
    @UniqueConstraint(columnNames="vehicleNumber")
})
public class Vehicle(){
    public Vehicle(){

    }
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="user",nullable=false)
    private User user;
    private String vehicleNumber;
    private Double capacitykg;
    private Double fuelEfficiency;

    public Long getID(){
        return id;
    }
    public void setVehicle(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }
    public String getVehicle(){
        return vehicleNumber;
    }
    public void setCapacity(Double capacitykg){
        this.capacitykg = capacitykg;
    }
    public Double getCapacity(){
        return capacitykg;
    }
    public User setUser(User user){
        this.user = user;
    }
    public void setFuel(Double fuelEfficiency ){
        this.fuelEfficiency = fuelEfficiency;
    }

    

}
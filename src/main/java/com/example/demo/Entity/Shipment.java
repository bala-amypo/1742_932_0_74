package com.example.demo.Entity;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Shipment")
public class Shipment{
    public Shipment(){

    }
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="vehicle_id",nullable=false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name="pickuplocation_id",nullable=false)
    private Location location;

    @ManyToOne
    @JoinColumn(name="droplocaion_id",nullable=false)
    private Location location;

    private Double weight;

    private LocalDate scheduledDate;

    public Long getID(){
        return id;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public void setLocation(Location location){
        this.location = location;
    }
    public Location getLocation(){
        return location;
    }
    



}
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
    private Location pickuplocation;

    @ManyToOne
    @JoinColumn(name="droplocaion_id",nullable=false)
    private Location droplocation;

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
    public void setPickLocation(Location pickuplocation){
        this.location = pickuplocation;
    }
    public Location getPickLocation(){
        return pickuplocation;
    }
    public void setDropLocation
    public void setWeight(Double weight){
        this.weight = weight;
    }
    public Double getWeight(){
        return weight;
    }
    public void setScheduledDate(LocalDate scheduledDate){
        this.scheduledDate = scheduledDate;
    }
    public LocalDate getScheduledDate(){
        return scheduledDate;
    }



}
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
    @JoinColumn(name="pick_uplocation_id",nullable=false)
    private Location pickuplocation;

    @ManyToOne
    @JoinColumn(name="drop_locaion_id",nullable=false)
    private Location droplocation;

    private Double weight;

    private LocalDate scheduledDate;

    public Long getId(){
        return id;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public void setPickLocation(Location pickuplocation){
        this.pickuplocation = pickuplocation;
    }
    public Location getPickLocation(){
        return pickuplocation;
    }
    public void setDropLocation(Location droplocation){
        this.droplocation = droplocation;
    }
    public Location getDropLocation(){
        return droplocation;
    }
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
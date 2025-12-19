package com.example.demo.Entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="RouterOptimiztionResult")
public class RouterOptimiztionResult{
    public RouterOptimiztionResult(){
        
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="shipment_id",nullable=false)
    private Shipment shipment;

    private Double optimizedDistanceKm;
    private Double estimatedFuelUsage;

    public Long getId(){
        return id;
    }
    public void setShipment(Shipment shipment){
        this.shipment = shipment;
    }
    public Shipment getShipment(){
        return shipment;
    }
  
    public void setOptimizedDistanceKm(Double optimizedDistanceKm){
        this.optimizedDistanceKm = optimizedDistanceKm;
    }
    public Double getOptimizedDistanceKm(){
        return optimizedDistanceKm;
    }
    public void setEstimatedFuelUsage(Double estimatedFuelUsage){
        this.estimatedFuelUsage = estimatedFuelUsage;
    }

    public Double getEstimatedFuelUsage(){
        return estimatedFuelUsage;
    }

}
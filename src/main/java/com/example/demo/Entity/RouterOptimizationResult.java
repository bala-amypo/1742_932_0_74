package com.example.demo.Entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="RouterOptimiztionResult")
public class RouterOptimiztionResult{
    public RouterOptimiztionResult(){
        
    }

    @Id
    @GeneratedValue(strategy=GenrationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(ColumnNames="shipment_id",nullable=false)
    private Shipment shipment

    private Double optimizedDistanceKm;
    private Double estimatedFuelUsage;

    public Long getId(){
        return id;
    }
    public void setShipment(Shipment shipment){
        this.shipment = shipment;
    }
    public Shipment get


}
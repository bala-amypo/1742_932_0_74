package com.example.demo.Entity;
import jakarta.persistence.*;

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
    private Double estimated


}
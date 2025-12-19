package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="Shipment")
public class Shipment{
    public Shipment(){

    }
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name="vehicle_id",nullable=false)
    private Vehicle vehicle;
    @ManyToOne
    @JoinColumn(name="")

}
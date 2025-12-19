package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Vehicle",uniqueConstraints={
    @UniqueConstraint(columnNames="vehicleNumber")
})
public class Vehicle(){
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    

}
package com.example.demo.Entity;
import jakarta.persistence.*;


@Entity
@Table(name="User",uniqueConstraints={
    @UniqueConstraint()
)}
public class User{
 
    @ID
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;


    



}
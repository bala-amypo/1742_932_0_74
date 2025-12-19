package com.example.demo.Entity;
import jakarta.persistence.*;


@Entity

public class User{
 
    @ID
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    

    



}
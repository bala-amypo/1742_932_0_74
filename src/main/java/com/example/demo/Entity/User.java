package com.example.demo.Entity;
import jakarta.persistence.*;


@Entity
@Table(name="User",uniqueConstraints={
    @UniqueConstraint(columnNames="email")
})
public class User{
 
    public enum Role{
       Strin 'User',
       Admin
    } 
    @ID
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;


    



}
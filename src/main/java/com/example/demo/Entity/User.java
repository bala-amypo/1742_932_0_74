package com.example.demo.Entity;
import jakarta.persistence.*;


@Entity
@Table(name="User",uniqueConstraints={
    @UniqueConstraint(columnNames="email")
})
public class User{
 
    public enum Role{
        User,
       Admin
    } 
    @ID
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    @Enumerated(EnumType.String)
    private Role role = Role.User;


    



}
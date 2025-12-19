package com.example.demo.Entity;
import jakarta.persistence.*;


@Entity
@Table(name="User",uniqueConstraints={
    @UniqueConstraint(columnNames="email")
})
public class User{
    public User(){

    }
 
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

    public Long getid(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPass(String pass){
        this.password = pass;
    }
    public String getpass(){
        return password;
    }
    public void setRole(String role){
      this.role = role;
    }
    public String getRole(){
        return role;
    }


    



}
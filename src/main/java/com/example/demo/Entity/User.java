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
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String email;
        private String password;
        @Enumerated(EnumType.STRING)
        private Role role = Role.User;

        public Long getId(){
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
        public String getPass(){
            return password;
        }
        public void setRole(Role role){
        this.role = role;
        }
        public Role getRole(){
            return role;
        }


        



    }
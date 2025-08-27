package org.model;

// encapsulation concept
public class User {
    private Integer Id;
    private String name;
    private String email;

    public static void main(String... args){
        System.out.println("hello this class User is running");
    }
    //  constructor
    public User(Integer id, String name, String email) {
        Id = id;
        this.name = name;
        this.email = email;
    }

    // getter and setters
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

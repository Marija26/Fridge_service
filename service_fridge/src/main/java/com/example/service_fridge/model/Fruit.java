package com.example.service_fridge.model;


import javax.persistence.*;

@Entity
@Table(name = "Fridge")
public class Fruit {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "colour")
    private String colour;

    public Fruit() {
    }

    public Fruit(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Fruit(Long id, String colour) {
        this.id = id;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}

package cz.spsmb.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
    @Entity
    @Table(name = "car")
    public class Car implements Serializable {

        @Id
        @Column(name = "car_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;
        String brand;

        int price;
        @ManyToOne
        @JoinColumn(name = "person_id", nullable = false)
        Person person;




        public void setId(long id) {
            this.id = id;
        }



        public void setBrand(String brand) {
            this.brand = brand;
        }

        public long getId() {
            return id;
        }


        public String getBrand() {
            return brand;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Joke{" +
                    "id=" + id +
                    ", brand='" + brand + '\'' +
                    ", price='" +
                    '}';
        }}






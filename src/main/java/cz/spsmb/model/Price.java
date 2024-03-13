package cz.spsmb.model;

import jakarta.persistence.*;

import java.io.Serializable;

    @Entity
    @Table(name = "price")
    public class Price implements Serializable {
        @Id
        @Column(name = "price_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;
        int price;
        @ManyToOne
        @JoinColumn(name = "car_id", nullable = false)
        Car car;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getPrice() {
            return price;
        }

        public  void setPrice(int price) {
            this.price = price;
        }


        public Car getCar() {
            return car;
        }

        public  void setCar(Car car) {
            this.car = car;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }


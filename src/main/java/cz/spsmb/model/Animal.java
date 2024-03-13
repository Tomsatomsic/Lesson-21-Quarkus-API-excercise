package cz.spsmb.model;
import jakarta.persistence.*;
import java.io.Serializable;
import jakarta.persistence.*;
import java.io.Serializable;

    @Entity
    @Table(name = "animal_table")
    public class Animal implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;
        String name;
        String kind;
        @ManyToOne
        @JoinColumn(name = "person_id", nullable = false)
        Person person;
        public Animal(){};

        public Animal(String name, String kind){
            this.name = name;
            this.kind = kind;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", kind=" + kind +
                    '}';
        }
    }



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
    @Table(name = "kind")
    public class Kind implements Serializable {
        @Id
        @Column(name = "kind_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;
        String name;

        String kind;
        @OneToMany(mappedBy = "id")
        List<Animal> animalList = new ArrayList<>();

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

        public List<Animal> getAnimalList() {
            return animalList;
        }

        public void setJokeList(List<Animal> animalList) {
            this.animalList = animalList;
        }

        @Override
        public String toString() {
            return "Category{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", animalList=" + animalList +
                    '}';
        }
    }



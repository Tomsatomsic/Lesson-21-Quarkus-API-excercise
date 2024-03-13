package cz.spsmb.dao;

import cz.spsmb.model.Animal;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

    @ApplicationScoped
    public class AnimalRepository implements PanacheRepository<Animal> {

        public Optional<Animal> listByName(String name){
            return find("name", name).singleResultOptional();
        }
    }





package cz.spsmb.dao;

import cz.spsmb.model.Car;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;


import java.util.List;


    @ApplicationScoped
    public class CarRepository implements PanacheRepository<Car> {

        public List<Car> listByName(String name){

            return find("name", name).list();
        }

        public Car listById(Long id){
            return findById(id);
        }

    }


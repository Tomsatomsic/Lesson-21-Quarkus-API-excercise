package cz.spsmb.rest;

import cz.spsmb.DTO.AnimalDTO;
import cz.spsmb.DTO.CarDTO;
import cz.spsmb.DTO.PersonDTO;
import cz.spsmb.dao.CarRepository;
import cz.spsmb.model.Animal;
import cz.spsmb.model.Car;
import cz.spsmb.model.Person;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


import java.util.List;

@Path("/cars")
public class CarResource {

    @Inject
    CarRepository carRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response list() {
        List<Car> cars = carRepository.listAll();
        return Response.ok().entity(cars).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response getById(@PathParam("id") Long id) {
        Car car = carRepository.findById(id);
        return Response.ok().entity(car).build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response deleteById(@PathParam("id") Long id) {
        carRepository.deleteById(id);
        return Response.ok().entity("ok").build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response save(CarDTO carDTO) {
        if (validateInput(carDTO)) {
            Car car = new Car();
            car.setPrice(carDTO.getPrice());
            car.setPrice(carDTO.getPrice());


            carRepository.persist(car);
            return Response.ok().entity("ok").build();
        }
        return Response.status(400).entity("Invalid inputs").build();
    }

    private boolean validateInput(CarDTO carDTO) {
        return !(carDTO.getBrand().isEmpty());
    }

}



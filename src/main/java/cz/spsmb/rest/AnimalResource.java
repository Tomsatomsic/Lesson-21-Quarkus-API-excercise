package cz.spsmb.rest;

import cz.spsmb.DTO.AnimalDTO;
import cz.spsmb.dao.AnimalRepository;
import cz.spsmb.model.Animal;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


import java.util.List;

    @Path("/animals")
    public class AnimalResource {

        @Inject
        AnimalRepository animalRepository;

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        @Consumes(MediaType.APPLICATION_JSON)
        @Transactional
        public Response list() {
            List<Animal> animals = animalRepository.listAll();
            return Response.ok().entity(animals).build();
        }

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        @Consumes(MediaType.APPLICATION_JSON)
        @Path("{id}")
        public Response getById(@PathParam("id") Long id) {
            Animal animal = animalRepository.findById(id);
            return Response.ok().entity(animal).build();
        }

        @DELETE
        @Produces(MediaType.APPLICATION_JSON)
        @Consumes(MediaType.APPLICATION_JSON)
        @Path("{id}")
        public Response deleteById(@PathParam("id") Long id) {
            animalRepository.deleteById(id);
            return Response.ok().entity("ok").build();
        }

        @POST
        @Produces(MediaType.APPLICATION_JSON)
        @Consumes(MediaType.APPLICATION_JSON)
        @Transactional
        public Response save(AnimalDTO animalDTO) {
            if (validateInput(animalDTO)) {
                Animal animal = new Animal();
                animal.setName(animalDTO.getName());
                animal.setKind(animalDTO.getKind());


                animalRepository.persist(animal);
                return Response.ok().entity("ok").build();
            }
            return Response.status(400).entity("Invalid inputs").build();
        }

        private boolean validateInput(AnimalDTO animalDTO) {
            return !(animalDTO.getName().isEmpty());
        }

    }




package com.openbootcamp.demospringrest.controllers;

import com.openbootcamp.demospringrest.Services.BootcamperService;
import com.openbootcamp.demospringrest.models.Bootcamper;
import org.glassfish.jersey.internal.inject.Custom;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
    //@GET
    //@Path("/")
    /*public String hola(){
        return "hola";
    }*/

    private final BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService){
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("uno"));
        this.bootcamperService.add(new Bootcamper("dos"));
        this.bootcamperService.add(new Bootcamper("tres"));
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos(){
        return bootcamperService.getAll();
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterBootcampers(Bootcamper bootcamper){
        bootcamperService.add(bootcamper);
        return Response.created(URI.create("/bootcampers/"+ bootcamper.getNombre())).build();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre){
        return bootcamperService.get(nombre);
    }
}

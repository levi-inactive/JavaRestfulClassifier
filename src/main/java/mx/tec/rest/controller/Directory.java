package mx.tec.rest.controller;

import mx.tec.rest.model.*;
import mx.tec.rest.service.*;

import javax.jws.WebParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class Directory {
    @POST
    @Path("/classify")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public int classify(@WebParam ClassifierRequest request) {
        return new ClassifierService().classifyFlow(request).getClassEnumeration();
    }
}

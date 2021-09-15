package com.dvdat.demoMicroprofile;

import com.dvdat.demoMicroprofile.annotations.JsonSerializable;
import com.dvdat.demoMicroprofile.model.Address;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

/**
 *
 */
@Path("/hello")
@Singleton
@JsonSerializable
public class HelloController {

    @GET
    @Operation(operationId = "sayHello", summary = "To say hello to user")
    @APIResponses
    public String sayHello(@Parameter(description = "name of the user") @QueryParam("name") String name) {
        return "Hello " + name;
    }

    @POST
    public Response createAddress(Address address) {
        System.out.println("Receive address: " + address);
        return Response.ok().build();
    }
}

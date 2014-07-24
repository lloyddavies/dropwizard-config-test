package net.lloyddavies.dropwizard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
    private final String message;

    public MessageResource(String message) {
        this.message = message;
    }

    @GET
    public String getMessage() {
        return message;
    }
}
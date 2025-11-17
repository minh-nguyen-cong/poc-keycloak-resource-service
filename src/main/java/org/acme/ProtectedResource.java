package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.security.Authenticated;

@Path("/api/protected")
@Authenticated
public class ProtectedResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getProtectedResource() {
        return "This is a protected resource";
    }
}

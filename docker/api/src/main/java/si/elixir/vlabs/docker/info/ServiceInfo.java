package si.elixir.vlabs.docker.info;

import si.elixir.vlabs.docker.ProjectDetails;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/info")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ServiceInfo {

    @GET
    public Response info() {
        // TODO: export files
        return Response.ok(new ProjectDetails()).build();
    }
}

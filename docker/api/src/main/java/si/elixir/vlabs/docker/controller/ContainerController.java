package si.elixir.vlabs.docker.controller;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DefaultDockerClientConfig;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/container")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContainerController {

    @GET
    public Response getContainerStatuses() {
        //DockerClient dockerClient = DefaultDockerClientConfig.createDefaultConfigBuilder().build();
        return Response.ok("OK").build();
    }

    @GET
    @Path("/{id}")
    public Response getContainerStatus(@PathParam("id") Integer id) {
        return Response.ok(id.toString()).build();
    }

    @POST
    @Path("/start")
    public Response startContainer() {
        return Response.status(Response.Status.ACCEPTED).build();
    }

    @POST
    @Path("/stop")
    public Response stopContainer() {
        return Response.status(Response.Status.ACCEPTED).build();
    }

    @PUT
    @Path("/restart/{id}")
    public Response restartContainer(@PathParam("id") Integer id) {
        return Response.status(Response.Status.ACCEPTED).build();
    }

    @DELETE
    @Path("/remove/{id}")
    public Response removeContainer(@PathParam("id") Integer id) {
        return Response.status(Response.Status.ACCEPTED).build();
    }
}

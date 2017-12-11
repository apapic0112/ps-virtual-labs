package si.elixir.vlabs.docker.controller;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import si.elixir.vlabs.docker.Container;
import si.elixir.vlabs.docker.helper.DockerHelper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/container")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContainerController {

    @GET
    public Response getContainerStatuses() {
        //DockerClientConfig dockerClientconfig = DefaultDockerClientConfig.createDefaultConfigBuilder().build();
        //DockerClient dockerClient = DockerClientBuilder.getInstance(dockerClientconfig).build();
        //dockerClient.infoCmd();
        return Response.ok(DockerHelper.getActive()).build();
    }

    @GET
    @Path("/{id}")
    public Response getContainerStatus(@PathParam("id") Integer id) {
        return Response.ok(DockerHelper.getById(id)).build();
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

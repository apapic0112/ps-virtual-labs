package si.elixir.vlabs.users.controller;

import si.elixir.vlabs.users.helper.UserHelper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    @GET
    @Path("/{id}")
    public Response getUserInfo(@PathParam("id") int id) {
        return Response.ok(UserHelper.getUserById(id)).build();
    }
}

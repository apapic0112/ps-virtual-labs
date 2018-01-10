package si.elixir.vlabs.course.controller;

import si.elixir.vlabs.course.helper.CourseHelper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/course")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourseController {

    @GET
    @Path("/{id}")
    public Response getCourseInfo(@PathParam("id") int id) {
        return Response.ok(CourseHelper.getCourseInfo(id)).build();
    }
}

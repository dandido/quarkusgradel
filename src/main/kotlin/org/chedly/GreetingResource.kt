package org.chedly

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

import javax.ws.rs.core.MediaType;
import org.chedly.Greeting;

@Path("/hello")
class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = Greeting("hello")


    @GET
    @Path("/pojo")
    @Produces(MediaType.APPLICATION_JSON)
    fun helloe() = org.chedly.Greeting("hello")
}
package com.login;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.User;

@Path("/users")
public class LoginService {

	public LoginService() {
		// TODO Auto-generated constructor stub
	}
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMsg()
    {
        User user=new User();
        user.setName("陳大文");
        user.setPassword("passwprd");
        return Response.status(200).entity(user).build();
    }
}

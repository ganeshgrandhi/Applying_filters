package se.bth.softhouse.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

import se.bth.softhouse.db.UserDAO;
import se.bth.softhouse.entities.Users;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/users")
public class UserResource {

	public UserDAO userDAO;

	public UserResource(UserDAO dao) {
		this.userDAO = dao;
	}

	@GET
	@Path("/{id}")
	public Users getBy(@PathParam("id") int id) {
		return userDAO.getBy(id);
	}

	@POST
	@Timed
	public void insertUsers(Users users) {
		//userDAO.insertUser(users);
	}
}

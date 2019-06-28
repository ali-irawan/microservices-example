/**
 * 
 */
package id.aliirawan.services.cxf.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import id.aliirawan.services.cxf.api.model.User;

/**
 * User service
 * 
 * @author aliirawan
 *
 */
public interface UserService {

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public User findById(@PathParam("id") Integer id);

	@GET
	@Path("/")
	@Produces("application/json")
	public List<User> findAll();

}

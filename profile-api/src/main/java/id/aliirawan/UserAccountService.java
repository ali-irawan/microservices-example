package id.aliirawan;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import id.aliirawan.model.UserAccount;

public interface UserAccountService {

	@GET
	@Path("/customer/{customerId}")
	@Produces("application/json")
	public List<UserAccount> findAllByUserId(@PathParam("customerId") Integer customerId);
	
}

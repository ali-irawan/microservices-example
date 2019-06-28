package id.aliirawan.services.cxf.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import id.aliirawan.services.cxf.api.model.UserAccount;

public interface UserAccountService {

	@GET
	@Path("/customer/{customerId}")
	@Produces("application/json")
	public List<UserAccount> findAllByUserId(@PathParam("customerId") Integer customerId);
	
}
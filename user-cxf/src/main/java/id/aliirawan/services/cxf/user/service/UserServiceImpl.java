package id.aliirawan.services.cxf.user.service;

import java.util.ArrayList;
import java.util.List;

import id.aliirawan.services.cxf.api.UserAccountService;
import id.aliirawan.services.cxf.api.UserService;
import id.aliirawan.services.cxf.api.model.User;

public class UserServiceImpl implements UserService {

	private UserAccountService userAccountService;

	private List<User> users;
	
	public UserServiceImpl() {
		
		// Create some dummy data for simulation
		
		users = new ArrayList<>();
		users.add(new User(1, "Ali"));
		users.add(new User(2, "Michael"));
		users.add(new User(3, "Aditya"));
	}
	
	@Override
	public User findById(Integer id) {
		User c = users.stream().filter(a -> a.getId().equals(id)).findFirst().get();
		c.setAccounts(userAccountService.findAllByUserId(id));
		return c;
	}

	@Override
	public List<User> findAll() {
		return users;
	}

	/**
	 * @return the userAccountService
	 */
	public UserAccountService getUserAccountService() {
		return userAccountService;
	}

	/**
	 * @param userAccountService the userAccountService to set
	 */
	public void setUserAccountService(UserAccountService userAccountService) {
		this.userAccountService = userAccountService;
	}

	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}

}

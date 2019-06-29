package id.aliirawan.services.cxf.api.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Model class for User
 * An user can have multiple accounts
 * 
 * @author aliirawan
 * @see id.aliirawan.services.cxf.api.model.UserAccount
 */
public class User {

	private Integer id;
	
	private String name;
	
	private List<UserAccount> accounts;

	/**
	 * Default constructor
	 */
	public User() {
	}

	
	/**
	 * @param id
	 * @param name
	 */
	public User(Integer id, String name) {
		this.id = id;
		this.name = name;
	}


	/**
	 * @param id
	 * @param name
	 * @param accounts
	 */
	public User(Integer id, String name, List<UserAccount> accounts) {
		this.id = id;
		this.name = name;
		this.accounts = accounts;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the accounts
	 */
	public List<UserAccount> getAccounts() {
		if (accounts == null) {
			accounts = new ArrayList<UserAccount>();
		}
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(List<UserAccount> accounts) {
		this.accounts = accounts;
	}
	
	
}

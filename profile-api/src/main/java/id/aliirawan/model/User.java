package id.aliirawan.model;

import java.util.List;

/**
 * Model class for User
 * An user can have multiple accounts
 * 
 * @author aliirawan
 * @see id.aliirawan.model.UserAccount
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
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(List<UserAccount> accounts) {
		this.accounts = accounts;
	}
	
	
}

package id.aliirawan.model;

/**
 * Model class for user account
 * 
 * @author aliirawan
 *
 */
public class UserAccount {

	public final static String ACCOUNT_TYPE_GMAIL = "gmail";
	
	public final static String ACCOUNT_TYPE_INSTAGRAM = "instagram";
	
	public final static String ACCOUNT_TYPE_FACEBOOK = "facebook";
	
	private Integer id;
	
	private String type;
	
	private String accountName;

	/**
	 * @param id
	 * @param type
	 * @param accountName
	 */
	public UserAccount(Integer id, String type, String accountName) {
		super();
		this.id = id;
		this.type = type;
		this.accountName = accountName;
	}

	/**
	 * Get the id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Set the id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the type
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the type
	 * @param type the type to set, one of this value ACCOUNT_TYPE_GMAIL, ACCOUNT_TYPE_FACEBOOK, ACCOUNT_TYPE_INSTAGRAM
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Get the account name
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * Set the account name
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	
	
}

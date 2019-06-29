/**
 * 
 */
package id.aliirawan.services.cxf.useraccount.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import id.aliirawan.services.cxf.api.UserAccountService;
import id.aliirawan.services.cxf.api.model.UserAccount;

/**
 * @author aliirawan
 *
 */
public class UserAccountServiceImpl implements UserAccountService {

	private List<UserAccount> accounts;
	
	public UserAccountServiceImpl() {
		// Create dummy data
		accounts = new ArrayList<UserAccount>(); 
		accounts.add(new UserAccount(100, UserAccount.ACCOUNT_TYPE_GMAIL, "myemail@gmail.com"));
		accounts.add(new UserAccount(200, UserAccount.ACCOUNT_TYPE_INSTAGRAM, "myinstagram"));
		accounts.add(new UserAccount(300, UserAccount.ACCOUNT_TYPE_FACEBOOK, "myfacebook"));
	}
	
	@Override
	public List<UserAccount> findAllByUserId(Integer userId) {
		return accounts.stream().filter(a -> a.getId().equals(userId)).collect(Collectors.toList());
	}

}

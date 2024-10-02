package com.javahongkong.bootcamp.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Account implementation for commercial (business) customers.<br>
 * <br>
 *
 * Private Variables:<br>
 * {@link #authorizedUsers}: List&lt;Person&gt;<br>
 */
public class CommercialAccount {
	private List<Person> authorizedUsers;

	public CommercialAccount(Company company, Long accountNumber, int pin, double startingDeposit) {
		new CommercialAccount(company, accountNumber, pin, startingDeposit);
	}

	/**
	 * @param person The authorized user to add to the account.
	 */
	protected void addAuthorizedUser(Person person) {
		this.authorizedUsers.add(person);
	}

	/**
	 * @param person
	 * @return true if person matches an authorized user in
	 *         {@link #authorizedUsers}; otherwise, false.
	 */
	public boolean isAuthorizedUser(Person person) {
		boolean pass = false;
		if (this.authorizedUsers.contains(person))
				pass = true;
		return pass;
	}
}
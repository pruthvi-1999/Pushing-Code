package gitBank;

public class Customer {

	int id;
	String name;
	float balance;
	boolean locked;
	public static String Organization;

	/*
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public float getBalance() { return balance; }
	 * 
	 * public void setBalance(float balance) { this.balance = balance; }
	 * 
	 * public boolean getLocked() { return locked; }
	 * 
	 * public void setLocked(boolean locked) { this.locked = locked; }}
	 */

	public Customer(int id, String name, float balance, boolean locked) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.locked = locked;

	}
}


package gitBank;

public class Test {

	public static void main(String[] args) {

		/*
		 * Customer obj1 = new Customer(); obj1.setId(11); obj1.setName("raj");
		 * obj1.setBalance(777); obj1.setLocked(true); System.out.println(obj1.getId());
		 * System.out.println(obj1.getName()); System.out.println(obj1.getBalance());
		 * System.out.println(obj1.getLocked());
		 * 
		 * Obj1.id = 23; Obj1.name = "raj"; Obj1.balance = 564; Obj1.locked = true;
		 * 
		 * System.out.println(Obj1.id); System.out.println(Obj1.name);
		 * System.out.println(Obj1.balance); System.out.println(Obj1.isLocked);
		 */
		
		Customer obj1 = new Customer(13, "raj", 235, true);
		
		System.out.println(obj1.id);
		System.out.println(obj1.name);
		System.out.println(obj1.balance);
		System.out.println(obj1.locked);
	}

}

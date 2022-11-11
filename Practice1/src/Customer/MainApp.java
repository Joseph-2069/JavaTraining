package Customer;

public class MainApp {
	public static void main(String[] args) {
		Customer c1 = new Customer(1,"Bhuvam",9588223344l,"Vikaspuri");
		Customer c2 = new Customer(2,"Joey",9582004009l,"Janakpuri");
		Customer c3 = new Customer(3,"Akshay",9580909920l,"Wazirpur");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		purchaseOrder p1 = new purchaseOrder(3,"Akshay",9580909920l,"Wazirpur",101,"04-11-2022",30,3);
		purchaseOrder p2 = new purchaseOrder(1,"Bhuvam",9588223344l,"Vikaspuri",101,"04-11-2022",30,3);
		
	}
	}
	
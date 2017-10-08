package unl.cse.company;

public class GenericsDemo {

	public static void main(String args[]) {

		// TODO: Make 2 different types of employees (change as appropriate to your design)
		Employee e1 = new Permanent("Jessica","Jung"); 
		Permanent e2 = new Permanent("Jerry","Johnson");
		Temporary e3 = new Temporary("Josh","Kwina", 30);
		Temporary e4 = new Temporary("James","Mores", 45);
		
		// TODO: Add them to non-generic company c1 and generic company c2.

		CompanyList c1 = new CompanyList();
		c1.addToArray(e1);
		c1.addToArray(e2);
		c1.addToArray(e3);
		c1.addToArray(e4);
		c1.print();

		CompanyList<Permanent> c2 = new CompanyList<Permanent>();
		c2.print();

		// TODO: Create a product and try adding to c1 and c2
		Product p1 = new Product("USB", "Hardware", 4.5, 18);
		Product p2 = new Product("Adobe", "Software", 105.78, 20);
		c1.addToArray(p1);
		c1.addToArray(p2);
	}

}

package unl.cse.company;

import java.io.File;
import java.io.IOException;

public class PortfolioDemo {

	public static void main(String[] args) {

	//TODO: Create employees and products with details, export to JSON 
	// and compute their productivity (change as appropriate to your design)
	Serializable serializableEmployee = new Temporary("Smith","John", 20); 
	Serializable serializableProduct = new Product("Laptop", "Hardware", 134.56, 7);



	try {
    	serializableEmployee.serializeToJSON(serializableEmployee, new File("data/Employee.json"));
    	serializableProduct.serializeToJSON(serializableProduct, new File("data/Product.json"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	CompanyPortfolio customerPortfolio = (CompanyPortfolio) serializableEmployee;
	CompanyPortfolio productPortfolio = (CompanyPortfolio) serializableProduct;
	customerPortfolio.computeProductivity();
	productPortfolio.computeProductivity();
	
}
}

package unl.cse.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class Product implements  Serializable, CompanyPortfolio{
	private String name;
	private String type;
	private double cost;
	private int count;
	
	Gson gson;
	
	
	/**
	 * @param name
	 * @param type
	 * @param cost
	 * @param count
	 */
	public Product(String name, String type, double cost, int count) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.count = count;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}




	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}




	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}




	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}




	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}




	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}




	@Override
	public double computeProductivity() {
		// TODO Auto-generated method stub
		return this.cost * this.count / (24*7);
	}
	@Override
	public void serializeToJSON(Serializable jsonSerializable, File file) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter jsonPrintWriter = null;

		try {
			jsonPrintWriter = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String product = gson.toJson(this);
		jsonPrintWriter.write(product + "\n");
		jsonPrintWriter.flush();
		
	}  
	
	
}

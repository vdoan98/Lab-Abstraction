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

public class Temporary extends Employee implements Serializable,CompanyPortfolio{
	
	private final double HOURLY_RATE = 15.0;
	private double hours;
	Gson gson;
	

	public Temporary(String firstName, String lastName, double hours) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
		this.hours = hours;
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
		String employee = gson.toJson(this);
		jsonPrintWriter.write(employee + "\n");
		jsonPrintWriter.flush();
		
	} 

	@Override
	public double computeProductivity() {
		// TODO Auto-generated method stub
		return this.computeSalary() /(24*7);
	}

	@Override
	public String getName() {
 		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return this.hours * HOURLY_RATE;
	}


}

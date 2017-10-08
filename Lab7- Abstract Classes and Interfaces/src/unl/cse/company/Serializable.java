package unl.cse.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public interface Serializable {
	
	public void serializeToJSON(Serializable jsonSerializable, File file) throws IOException;

}

package datadriven;
import java.io.*;
import java.util.*;

public class Test1 {
	
	public class ReadPropertiesFileTest {
	   public void main(String args[]) throws IOException {
	      Properties prop = readPropertiesFile("credentials.properties");
	      System.out.println("username: "+ prop.getProperty("username"));
	      System.out.println("password: "+ prop.getProperty("password"));
	   }
	   public Properties readPropertiesFile(String fileName) throws IOException {
	      FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      return prop;
	   }
	}

}

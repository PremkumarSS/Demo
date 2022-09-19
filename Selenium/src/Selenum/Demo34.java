package Selenum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Demo34 {
	@Test
	public void state() throws FileNotFoundException, IOException
	{Properties p=new Properties();
	p.load(new FileInputStream("./p.propertes"));
	String a = p.getProperty("baseurl");
	System.out.println(a);
	
	}

}

package junitpkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class Responsecode {
String link="https://www.Google.com";
@Test()
public void test() throws IOException 

{
	URL ob=new URL(link);
	HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	int code=con.getResponseCode();
	System.out.println(code);
	
	
	
	
	
}
}

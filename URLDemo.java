import java.net.*;
import java.io.*;
import java.net.URL;

class URLDemo
{
	public static void main(String ar[]) throws MalformedURLException, IOException
	{
		URL u = new URL("http://admissions.puchd.ac.in/");
		
		System.out.println("Authority = " + u.getAuthority());
		System.out.println("Content = " + u.getContent());
		System.out.println("Default Port = " + u.getDefaultPort());
		System.out.println("Port number = " + u.getPort());
		System.out.println("File name = " + u.getFile());
		System.out.println("Host name = " + u.getHost());
		System.out.println("Path = " + u.getPath());
		System.out.println("Protocol = " + u.getProtocol());
		System.out.println("Query String = " + u.getQuery());
	
		System.out.println("\n\n");
		InputStream is = u.openStream();
		int ch;
		while(( ch=is.read()) != -1)
		{
			System.out.print((char)ch);
		}
		is.close();
	}
}

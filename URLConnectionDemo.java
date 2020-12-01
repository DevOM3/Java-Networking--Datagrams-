import java.net.*;
import java.util.*;
import java.io.*;

class URLConnectionDemo
{
	public static void main(String ar[]) throws MalformedURLException, IOException
	{

		URL u = new URL("http://admissions.puchd.ac.in/");
		URLConnection url_con = u.openConnection();

		System.out.println("Allow User interaction? : " + url_con.getAllowUserInteraction());
		System.out.println("Content Type is : " + url_con.getContentType());
		System.out.println("URL is : " + url_con.getURL());
		System.out.println("Involvement of DoInput is : " + url_con.getDoInput());
		System.out.println("Involvement of DoOutput is : " + url_con.getDoOutput());
		System.out.println("Last modified date is : " + new Date( url_con.getLastModified()) );
		System.out.println("Content Encoding is : " + url_con.getContentEncoding());

		System.out.println("\nHeader information");
		Map<String, List<String>> header = url_con.getHeaderFields();
		for(Map.Entry<String, List<String>> mp : header.entrySet())
		{
			System.out.print(mp.getKey() + " : ");
			System.out.println(mp.getValue().toString() );
		}
	
		System.out.println("\nSource code");

		// Following code can print source code
		BufferedReader br = new BufferedReader(new InputStreamReader(url_con.getInputStream()));
		String i;
		while( (i=br.readLine()) != null )
		{
			System.out.println(i);
		}
	}
}

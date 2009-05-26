import java.net.*;
import java.io.*;
public class ClientSide
{
	public static void Link(String ip,int port)
	{
		try
		{
			Socket client = new Socket(ip,port);
			InputStream in = client.getInputStream();
			for(int chin = in.read(); chin>0; chin = in.read())
			{
				System.out.print((char)chin);
			}
			client.close();
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	}
	
	public static void main(String[] args)
	{
		String ip = args[0];
		ClientSide ss = new ClientSide();
		ss.Link(ip,9999);
	}
}
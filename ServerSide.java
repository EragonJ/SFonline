import java.net.*;
import java.io.*;
public class ServerSide
{
	//use port 9999 to connect
	public final static int usePort = 9999;
	public static void main(String[] args)
	{
		ServerSocket ss;
		Socket sc;
		PrintWriter op;
		try
		{
			ss = new ServerSocket(usePort);
			try
			{
				while(true)
				{
					sc = ss.accept();
					op = new PrintWriter(sc.getOutputStream());
					op.println("Hi");
					op.flush();
					sc.close();
				}
			}
			catch(IOException e)
			{
				ss.close();
				System.err.println(e);
			}
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	}
}
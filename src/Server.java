import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.net.*;
import java.io.*;


public class Server {
	public static void main(String args[]) {
		try {
		LocateRegistry.createRegistry(23120);
		Bulbizarre bulbizarre = new Bulbizarre(15,"Quguy");
		Naming.rebind("//localhost:23120/Bulbizarre", bulbizarre);
		} catch (RemoteException re) {
			System.out.println("Remote Exception");
		} catch (MalformedURLException malURL) {
			System.out.println("Malformed URL");
		}
	}
}

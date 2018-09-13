import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;



public class Bulbizarre extends UnicastRemoteObject implements Pokemon {
	public String name;
	public int age;
	public String[] faim = {"Affam�", "Plut�t faim", "Ok", "Rassasi�"};
	private int id_faim = 1;
	public String[] hygiene = {"Mortifere", "Sale", "Ok", "Propre"};
	private int id_hygiene = 1;
	public String[] soif = {"Assoif�", "Soif", "Ok", "D�salt�r�"};
	private int id_soif = 1;
	
	
	protected Bulbizarre(int iage,String iname ) throws RemoteException {
		super();
		
		age=iage;
		name=iname;
	}






	@Override
	public void feed() throws RemoteException {
		id_faim = 3;
		
	}



	@Override
	public void clean() throws RemoteException {
		id_hygiene = 3;
		
	}



	@Override
	public void drink() throws RemoteException {
		id_soif = 3;
		
	}



	@Override
	public String getStatus() throws RemoteException {
		
		return "Stqtut du pokemon";
	}
	

}

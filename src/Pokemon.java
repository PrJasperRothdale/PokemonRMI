
public interface Pokemon extends java.rmi.Remote{
	public void feed() throws java.rmi.RemoteException;
	public void clean() throws java.rmi.RemoteException;
	public void drink() throws java.rmi.RemoteException;
	public String getStatus() throws java.rmi.RemoteException;
}

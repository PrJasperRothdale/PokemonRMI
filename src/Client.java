import java.rmi.Naming;

public class Client {
	Pokemon bulbizarre = (Pokemon)Naming.lookup("//localhost:23120/Bulbizarre");
}

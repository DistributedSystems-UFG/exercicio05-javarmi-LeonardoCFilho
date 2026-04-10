package example.hello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.ExportException;

public class Server1 {

    public Server1() {}

    public static void main(String args[]) {
        try {
            Registry registry;
            try {
                registry = LocateRegistry.createRegistry(1099);
                System.out.println("Registry criado");
            } catch (ExportException e) {
                System.out.println("Registry ja existe, conectando...");
                registry = LocateRegistry.getRegistry("localhost", 1099);
            }

            HelloImplem helloObj = new HelloImplem(5678);
            registry.rebind("MyHello", helloObj);

            System.err.println("MyHello pronto na porta 5678");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
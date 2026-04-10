package example.hello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.ExportException;

public class Server2 {

    public Server2() {}

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

            CalculadoraImplem calcObj = new CalculadoraImplem(5679);
            registry.rebind("MyCalculadora", calcObj);

            System.err.println("MyCalculadora pronta na porta 5679");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
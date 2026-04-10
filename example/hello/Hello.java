package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;
    String greeting() throws RemoteException;
    String sayGoodbye() throws RemoteException;
    // Movi soma() para calculadora
}
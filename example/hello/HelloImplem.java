package example.hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImplem extends UnicastRemoteObject implements Hello {

    public HelloImplem(int port) throws RemoteException {
        super(port);
    }

    public String sayHello() throws RemoteException {
        return "Hello, world!";
    }

    public String greeting() throws RemoteException {
        // Bem generico mesmo
        return "Welcome! How are you today?";
    }

    public String sayGoodbye() throws RemoteException {
        return "Goodbye, world!";
    }
}
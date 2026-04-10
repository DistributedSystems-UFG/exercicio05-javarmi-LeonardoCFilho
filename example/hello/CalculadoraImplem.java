package example.hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImplem extends UnicastRemoteObject implements Calculadora {

    public CalculadoraImplem(int port) throws RemoteException {
        super(port);
    }

    public int soma (int a, int b) throws RemoteException { // Movido
        return a + b;
    }

    public int subtracao(int a, int b) throws RemoteException {
        return a - b;
    }
}
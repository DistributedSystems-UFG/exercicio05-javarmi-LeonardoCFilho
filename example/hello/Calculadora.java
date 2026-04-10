package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
    int soma(int a, int b)       throws RemoteException;
    int subtracao(int a, int b)  throws RemoteException;
}
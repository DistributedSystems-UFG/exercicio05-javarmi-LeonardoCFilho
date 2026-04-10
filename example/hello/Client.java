package example.hello;

import java.rmi.Naming;

public class Client {

    private Client() {}

    public static void main(String[] args) {
        System.out.println("Iniciando cliente\n\n");

        String host = (args.length < 1) ? null : args[0];

        try {
            Hello hello = (Hello) Naming.lookup("rmi://" + host + "/MyHello"); // <ip>:5678
            
            System.out.println("********************************* Conectado ao MyHello *********************************");
            System.out.println(hello.sayHello());
            System.out.println(hello.greeting());
            System.out.println(hello.sayGoodbye());
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }

        try {
            Calculadora calc = (Calculadora) Naming.lookup("rmi://" + host + "/MyCalculadora");

            System.out.println("****************************** Conectado ao MyCalculadora ******************************");
            System.out.println("soma (Calculadora)      50 + 30: " + calc.soma(50, 30));
            System.out.println("subtracao (Calculadora) 50 - 30: " + calc.subtracao(50, 30));
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
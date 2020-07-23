package ir.ac.kntu.cs2d.server;

import ir.ac.kntu.ScannerSingleton;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8192);
        System.out.println("hello,type 1 for start:");
        ScannerSingleton scannerSingleton = ScannerSingleton.getInstance();
        if (!scannerSingleton.nextLine().equals("1")){
            serverSocket.close();
            return;
        }
        new Thread(()->{
            Socket socket;
            do {
                try {
                    socket = serverSocket.accept();
                    clientHandler(socket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (!serverSocket.isClosed());
        },"Client Handler").start();
        System.out.println("enter any thing to close server:");
        scannerSingleton.nextLine();
        serverSocket.close();
    }

    private static void clientHandler(Socket socket) throws IOException {

    }

    private ServerMain() {
    }
}

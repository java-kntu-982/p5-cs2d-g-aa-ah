package ir.ac.kntu.cs2d.client;

import ir.ac.kntu.ScannerSingleton;
import ir.ac.kntu.gamelogic.CTPlayer;
import ir.ac.kntu.gamelogic.Player;
import ir.ac.kntu.gamelogic.TPlayer;

import java.io.IOException;
import java.net.Socket;

public class ClientMain {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",8192);
        ScannerSingleton scannerSingleton = ScannerSingleton.getInstance();
        Player player;
        System.out.println("press 1 for t and 2 for ct:");
        String choice = scannerSingleton.nextLine();
        if (choice.equals("1")){
            player = new TPlayer(0, 0);
        } else {
            player = new CTPlayer(100, 100);
        }
    }

    private ClientMain() {
    }
}

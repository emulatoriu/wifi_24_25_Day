package logic;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ConnectionService {
    private final ServerSocket serverSocket;
    private final UserInputService userInputService;


    public ConnectionService(ServerSocket serverSocket, UserInputService userInputService) {
        this.serverSocket = serverSocket;
        this.userInputService = userInputService;
    }

    public void connect() {
        try {
            while(true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected");
                InputStream inputStream = clientSocket.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                PrintWriter outgoing = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader incoming = new BufferedReader(inputStreamReader);

                Thread clientThread = new ClientThread(incoming, outgoing, userInputService);
                clientThread.start();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
            }
        }
    }
}

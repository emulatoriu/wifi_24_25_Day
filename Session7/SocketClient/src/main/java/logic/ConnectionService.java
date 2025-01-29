package logic;

import data.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ConnectionService {
    private final UserInputService userInputService;
    private final Socket socket;
    private final BufferedReader incoming;
    private final PrintWriter outgoing;

    public ConnectionService(UserInputService userInputService, Socket socket, BufferedReader incoming, PrintWriter outgoing) {
        this.userInputService = userInputService;
        this.socket = socket;
        this.incoming = incoming;
        this.outgoing = outgoing;
    }

    public void connect() {
        String messageToSend = "";
        String messageReceived = "";
        while(!messageReceived.equalsIgnoreCase(Constants.END_OF_CONNECTION)) {
            messageToSend = userInputService.getUserInput();
            outgoing.println(messageToSend);
            try {
                messageReceived = incoming.readLine();
                if(messageReceived == null) break;
                System.out.println("Server replied: %s".formatted(messageReceived));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

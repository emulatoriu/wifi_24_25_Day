package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ClientThread extends Thread {
    private final BufferedReader incoming;
    private final PrintWriter outgoing;
    private final UserInputService userInputService;

    public ClientThread(BufferedReader incoming, PrintWriter outgoing, UserInputService userInputService) {
        this.incoming = incoming;
        this.outgoing = outgoing;
        this.userInputService = userInputService;
    }

    @Override
    public void run() {
        try {
            String clientMessage = incoming.readLine();
            while(clientMessage != null && !clientMessage.equalsIgnoreCase("byebye")) {
                System.out.println("Clientmessage: %s".formatted(clientMessage));
                String messageToClient = userInputService.getUserInput();
                outgoing.println(messageToClient);
                clientMessage = incoming.readLine();
            }
            System.out.println("client disconnected");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            outgoing.close();
            try {
                incoming.close();
            } catch (IOException e) {
            }

        }
    }
}

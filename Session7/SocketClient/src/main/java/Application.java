import logic.ConnectionService;
import logic.UserInputService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInputService userInputService = new UserInputService(scanner);
        try(Socket clientSocket = new Socket("6.tcp.ngrok.io:12390", 22);
            BufferedReader incoming = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outgoing = new PrintWriter(clientSocket.getOutputStream(), true);
            ) {
            ConnectionService connectionService =
                    new ConnectionService(userInputService, clientSocket, incoming, outgoing);
            connectionService.connect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

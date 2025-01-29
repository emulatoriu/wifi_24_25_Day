import logic.ConnectionService;
import logic.UserInputService;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInputService userInputService = new UserInputService(scanner);
        try {
            ServerSocket serverSocket = new ServerSocket(22);
            ConnectionService connectionService = new ConnectionService(serverSocket, userInputService);
            connectionService.connect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

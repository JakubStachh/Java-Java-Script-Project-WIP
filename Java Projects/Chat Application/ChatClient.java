import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to chat server. Type messages:");

            Thread receiveThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = reader.readLine()) != null) {
                        System.out.println("Server: " + message);
                    }
                } catch (IOException e) {
                    System.out.println("Connection lost.");
                }
            });
            receiveThread.start();

            while (true) {
                String message = scanner.nextLine();
                writer.println(message);
            }
        } catch (IOException e) {
            System.out.println("Could not connect to server.");
        }
    }
}

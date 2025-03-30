import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static List<PrintWriter> clients = new ArrayList<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Chat Server Started...");
            while (true) {
                new ClientHandler(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            System.out.println("Server error.");
        }
    }

    static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter writer;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                writer = new PrintWriter(socket.getOutputStream(), true);
                synchronized (clients) {
                    clients.add(writer);
                }
                String message;
                while ((message = reader.readLine()) != null) {
                    for (PrintWriter client : clients) {
                        client.println(message);
                    }
                }
            } catch (IOException e) {
                System.out.println("Client disconnected.");
            } finally {
                synchronized (clients) {
                    clients.remove(writer);
                }
            }
        }
    }
}

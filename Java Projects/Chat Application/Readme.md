# Chat Application

## 📝 **Overview**

This chat application consists of two parts: the **Chat Server** and the **Chat Client**. The server allows multiple clients to connect and communicate in real-time. Each message sent by one client is broadcasted to all other connected clients. The client interacts with the server to send and receive messages.

---

## 💡 **Features**

- **Real-time Messaging**: Clients can send and receive messages from each other in real-time.
- **Multi-client Support**: The server can handle multiple clients at once, allowing multiple users to chat.
- **Simple User Interface**: The client allows users to type and send messages, and the server broadcasts these messages to all connected clients.

---

## ⚙️ **How It Works**

### **1. Server Setup**:
The server listens on port 5000 for incoming connections from clients. Once a client connects, it adds the client to a list and starts a new thread for handling the client’s messages.

### **2. Client Setup**:
The client connects to the server on `localhost` at port `5000`. The client sends messages to the server and continuously listens for incoming messages from the server (which it then displays to the user).

### **3. Message Broadcasting**:
The server broadcasts any received messages from one client to all other connected clients. This allows for a group chat functionality.

---

## 📜 **Code Explanation**

### **ChatServer.java**:

- **ServerSocket**: Listens for incoming client connections on port 5000.
- **ClientHandler**: A thread is spawned for each client to handle their messages.
- **Clients List**: The server maintains a list of all connected clients (PrintWriter objects) to broadcast messages.
- **Message Handling**: When a client sends a message, the server reads it and forwards it to all clients in the list.

### **ChatClient.java**:

- **Socket**: The client connects to the server through a socket on `localhost` at port `5000`.
- **Input/Output Streams**: The client sends messages using a `PrintWriter` and listens for messages from the server using a `BufferedReader`.
- **Multithreading**: A separate thread listens for incoming messages from the server while the main thread handles user input for sending messages.

### **Flow of Communication**:
1. The client connects to the server.
2. The client sends messages to the server.
3. The server broadcasts the message to all connected clients.
4. All clients (including the sender) receive and display the message.

---

## 🧑‍💻 **Code**:

### **ChatServer.java**

```java
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
```

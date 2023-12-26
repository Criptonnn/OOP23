package week12.Lab;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

    private List<ClientHandler> clientList = new ArrayList<>();
    public void start(int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is running");
            while(true) {
                Socket clientSocket = serverSocket.accept();
//                InputStream inputStream = clientSocket.getInputStream();
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clientList.add(clientHandler);

                Thread thread = new Thread(clientHandler); // ClientHandler implementa Runnable pa radi
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void broadcastMessage(String message, ClientHandler sender) {
        for(ClientHandler client : clientList) {
            if(client != sender) {
                client.sendMessage(message);
            }
        }
    }

    private class ClientHandler implements Runnable{
        private Socket socket;
        private BufferedReader reader;
        private PrintWriter writer;

        public ClientHandler(Socket socket) {
            this.socket = socket;
            try {
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                writer = new PrintWriter(socket.getOutputStream(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                writer.println("Enter username: ");
                String username = reader.readLine();
                System.out.println(username + " has entered the chat");
                broadcastMessage(username + " has entered the chat", this);

                while(true) {
                    String clientMessage;
                    while((clientMessage = reader.readLine()) != null) {
                        broadcastMessage(clientMessage, this);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    this.socket.close();
                    clientList.remove(this);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

        public void sendMessage(String message) {
            writer.println(message);
        }
    }
}

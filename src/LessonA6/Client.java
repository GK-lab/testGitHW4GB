package LessonA6;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        startTextClient();

}
    private static void startTextClient() {
        try (Socket socket  = new Socket("localhost", 8180);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream());
             Scanner sc2 = new Scanner(System.in)){
            String clientMessage2 = "";

            Thread serverReader = new Thread(() -> {
                String serverMessage2 = "";
                try {
                    while(!socket.isClosed()) {
                        serverMessage2 = in.readLine();
                        System.out.println(serverMessage2);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            serverReader.start();
            do{
                clientMessage2 = sc2.nextLine();
                out.println(clientMessage2);
                out.flush();
            }while(!clientMessage2.equalsIgnoreCase("stop"));

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


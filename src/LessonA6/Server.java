package LessonA6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String ... args) {
        startTextServer();
    }

    private static <sc1> void startTextServer() {
        try(ServerSocket serverSocket = new ServerSocket(8180)){
            System.out.println("Server is listening");
            try(Socket socket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream());
                Scanner sc1 = new Scanner(System.in);
           ){
                String serverMessage1 = "";

                Thread clientReader = new Thread(() -> {
                    String message = "";
                    try {
                        while(!socket.isClosed()) {
                            message = in.readLine();
                            System.out.println(message);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                clientReader.start();


                do{
                    serverMessage1 = sc1.nextLine();
                    out.println(serverMessage1);
                    out.flush();

                }while(!serverMessage1.equalsIgnoreCase("stop"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

import java.net.*;
import java.io.*;

public class Networking {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.github.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
        
            StringBuilder response = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
                )) {
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
            }
            
            System.out.println("response: " + response.toString());
            
        } catch (Exception e) {
            System.out.println("error in URL connection: " + e.getMessage());
        }

        new Thread(() -> startServer()).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startClient();
    }

    private static void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("server started on port 5000");
            Socket clientSocket = serverSocket.accept();
            System.out.println("client passed!");
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println("hello from server!");
            
        } catch (IOException e) {
            System.out.println("server error: " + e.getMessage());
        }
    }

    private static void startClient() {
        try (Socket socket = new Socket("localhost", 5000)) {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );
            String message = in.readLine();
            System.out.println("message from server: " + message);
            
        } catch (IOException e) {
            System.out.println("client error: " + e.getMessage());
        }
    }
}

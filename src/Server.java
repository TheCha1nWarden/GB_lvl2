import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class Server {
    private ServerSocket serverSocket;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private Scanner scanner = new Scanner(System.in);

    public Server() {
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("the server is running");
            socket = serverSocket.accept();
            System.out.println("client connected");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            Thread t0 = new Thread(() -> {
                while (true) {
                    try {
                        out.writeUTF(scanner.next());
                    } catch (IOException e) {
                        System.out.println("Lost connection");
                        break;
                    }
                }
            });
            t0.start();

            while (true) {
                System.out.println(in.readUTF());
            }


        }
        // конечно наверное неочень хорошо в блок try пихать весь код, ведь из-за этого сложнее будет установить причину
        // выброса исключения, но думаю, что в данном примере домашки это несильно критично xD
        // не хочется просто засорять код этими заглушками try/catch
         catch (IOException e) {
             System.out.println("Lost connection");
        }

    }
}

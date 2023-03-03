import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10000);

        System.out.println("Startuji server pog champ");
        Socket socket = server.accept();

        System.out.println("krok2");
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        //respíonse header
        out.println("HTTP/25.0 200");
        out.println("Content-Type: text/text/pero");
        out.println();//konec headeru

        out.println("ahoj more webServer na poke");//content

        socket.close();


    }

}


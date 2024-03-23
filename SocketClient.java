import java.io.BufferedReader;//imported object
import java.io.InputStreamReader;//imprted object
import java.io.PrintWriter;
import java.net.Socket;//imported client socket
import java.nio.Buffer;//imported object
public class SocketClient {
    public static void main(String[] args) {
        try{System.out.println("Client Started!");
        Socket socket = new Socket("localhost",9000);
        //We want to read a string form the keyboard w are going to use a buffer reader
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        //now we want to ask the client
        System.out.println("Enter a string");
        String s = userInput.readLine();
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        out.println(s); 
        //now it will read data from the server
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(in.readLine());
    }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
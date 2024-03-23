import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;//this imports the SERVERSOCKET
import java.net.Socket;//THIS IMPORTS THE SOCKET OBJECT4
import java.io.PrintWriter;

public class SocketServer {
    public static void main(String[] args) {
    try{
        System.out.println("Waiting for client..");
        ServerSocket socket= new ServerSocket (9000);
        Socket soc = socket.accept();
        System.out.println("Connection established!");
        //read the string which the client has sent and notice there isnt a System.in
        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        String str = in.readLine();
        //now we are going to read it from the client
        PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
        out.println("server says"+str);
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
}

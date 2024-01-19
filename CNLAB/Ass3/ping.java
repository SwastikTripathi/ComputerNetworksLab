import java.net.*;
import java.io.*;
public class ping
{
    public static void main(String args[]){
        System.out.println("Pinging status");
        try{
            InetAddress IPA= InetAddress.getByName("localhost");
            System.out.println("Sending ping request to "+IPA);
            boolean status=IPA.isReachable(50000);
            if(status){
                System.out.println("Status:Host is reachable");
            }
            else{
                System.out.println("Status: Host is not reachable");
            }
        }
        catch(IOException e){
            System.out.println("Host does not exist");
        }
    }
}

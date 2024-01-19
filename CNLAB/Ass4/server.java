import java.net.*; 
import java.io.*; 
import java.util.*; 
public class server{ 
public static void main(String args[]){ 
try{ 
ServerSocket ss = new ServerSocket(8020); 
Socket s = ss.accept(); 
DataInputStream dis = new DataInputStream(s.getInputStream()); 
DataOutputStream dout = new DataOutputStream(s.getOutputStream()); 
String str = ""; 
while(!str.equals("exit")){ 
str = (String)dis.readUTF(); 
System.out.println("\n CLIENT: "+str); 
System.out.println("\n ENTER:"); 
Scanner sc = new Scanner(System.in); 
String n = sc.nextLine(); 
dout.writeUTF(n); 
} 
} 
catch(Exception e){ 
System.out.println("\n [Ended...]"); 
} 
} 
} 


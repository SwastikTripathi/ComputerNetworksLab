import java.net.*; 
import java.io.*; 
import java.util.*; 
public class client{ 
public static void main(String args[]){ 
try{ 
//ServerSocket ss = new ServerSocket(8020); 
Socket s = new Socket("localhost",8020); 
// DataInputStream dis = new DataInputStream(s.getInputStream()); 
DataOutputStream dout = new DataOutputStream(s.getOutputStream()); 
DataInputStream dis = new DataInputStream(s.getInputStream()); 
String str = "";
while(!str.equals("exit")){ 
//str = (String)dis.readUTF(); 
// System.out.println("\n CLIENT: "+str); 
System.out.println("\n ENTER: "); 
Scanner sc = new Scanner(System.in); 
String m = sc.nextLine(); 
dout.writeUTF(m); 
str = (String)dis.readUTF(); 
System.out.println("\n SERVER"+str); 
} 
} 
catch(Exception e){ 
System.out.println("\n [Ended...]"); 
} 
} 
}


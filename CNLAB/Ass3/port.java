import java.io.*;
import java.net.*;
import java.util.*;
public class port
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the starting port no.: ");
int start= sc.nextInt();
System.out.println("Enter the ending port no.: ");
int end=sc.nextInt();
int count=0;
System.out.println();
for(int i=start;i<=end;i++)
{
    try{
        Socket s=new Socket("localhost",i);
        System.out.println("Port "+i+" is available");
        count++;
    }
    catch(Exception e)
    {
        //System.out.println("Port "+i+" is not available");
    }
}
System.out.println();
System.out.println("Number of available ports = "+count);
}
}

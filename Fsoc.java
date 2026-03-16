import java.io.*;
import java.util.*;
public class Fsoc implements Runnable 
{
public void run()
{
System.out.println("Now thread is running .....");
}
public static void main(String args[])
{
Runnable r1 = new Fsoc();
Thread th1=new Thread(r1,"My new Thread");
th1.start(); //moves the thread is active state
String str = th1.getName();
System.out.println(str);
}
}
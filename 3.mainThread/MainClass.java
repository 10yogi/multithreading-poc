import java.io.*;
import java.lang.*;

public class MainClass extends Thread{
  public static void main(String[] args){
    Thread t = Thread.currentThread();
    System.out.println("current thread : "+ t.getName());
    t.setName("Geeks");
    System.out.println("After name change: "+t.getName());
    System.out.println("Main thread priority : "+t.getPriority());
    t.setPriority(MAX_PRIORITY);
    System.out.println("Main thread new priority: "+ t.getPriority());
    for(int i = 0;i<5;++i){
      System.out.println("Main Thread");
    }
    ChildThread ct = new ChildThread();
    System.out.println("Child thread priority: "+ ct.getPriority());
    ct.setPriority(MIN_PRIORITY);
    System.out.println("Child thread New Priority: "+ ct.getPriority());
    ct.start();
  }
}
class ChildThread extends Thread{
  public void run(){
    for(int i = 0;i<5;++i){
      System.out.println("Child thread");
    }
  }
}
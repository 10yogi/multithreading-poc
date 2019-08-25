import java.io.*;
import java.lang.*;

class InThread implements Runnable{
  public void run(){
    try{
      Thread.sleep(1500);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    System.out.println("State of thread1 while it called join method on thread 2"+
     MainClass.thread1.getState()
    );
    try{
      Thread.sleep(200);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
  }
}

public class MainClass implements Runnable{
  public static Thread thread1;
  public static MainClass obj;

  public static void main(String[] args){
    obj = new MainClass();
    thread1 = new Thread(obj);
    System.out.println("state of thread1 after creating it "
    +thread1.getState());
    thread1.start();
    System.out.println("State of thread1 after calling .start"
    +thread1.getState());
  }
  public void run(){
    Thread inThread1 = new Thread(new InThread());
    System.out.println("state of inThread1 after creating it"+
    inThread1.getState());
   
    inThread1.start();
    System.out.println("state of inThread after calling .start"+
    inThread1.getState());

    try{
      Thread.sleep(200);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    System.out.println("state of thread2 after calling .sleep on it "+inThread1.getState());
    try{
      inThread1.join();
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    System.out.println("State of thread2 when it has finished it"+inThread1.getState());
  }
}
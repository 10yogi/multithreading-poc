import java.io.*;
import java.lang.*;

class ThreadGen extends Thread{
  public void run(){
    try{
      System.out.println(
        "Thread"
      +Thread.currentThread().getId()
      +"is running"
      );
    }
    catch(Exception e){
      System.out.println("EXception is caught");
    }
  }
}

public class MultithreadingDemo{
  public static void main(String [] args){
    int n = 8;
    for(int i = 0;i<8;++i){
      ThreadGen thread1 = new ThreadGen();
      thread1.start();
    }
  }
}
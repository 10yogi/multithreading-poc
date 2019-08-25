import java.io.*;
import java.lang.Runnable;
import java.lang.*;

class MultiThread2 implements Runnable {
  public void run(){
    try{
      System.out.println(
        "Thread" + 
        Thread.currentThread().getId()+
        "is running"
      );
    }catch(Exception e){
      System.out.println("Exception is caught");
    }
  }
}

class MainClass{
  public static void main(String []args){
    int n = 8;
    for(int i = 0;i<8;++i){
      Thread thread1 = new Thread(new MultiThread2());
      thread1.start();
    }
  }
}
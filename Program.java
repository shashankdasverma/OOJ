import java.util.*;

class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;
    private int Stime;
    
    RunnableDemo( String name,int Stime) {
       this.threadName = name;
       this.Stime = Stime;
    }
    
    public void run() {
       try {
          for(int i = 4; i > 0; i--) {
             System.out.println(threadName);
             Thread.sleep(Stime);
          }
       } catch (InterruptedException e) {
          System.out.println(threadName + " interrupted.");
       }
       System.out.println(threadName);
    }
    
    public void start () {
       if (t == null) {
          t = new Thread (this, threadName);
          t.start ();
       }
    }
 }
 
 public class Program {
 
    public static void main(String args[]) {
       RunnableDemo R1 = new RunnableDemo("BMS College of Engineering",10000);
       R1.start();
       
       RunnableDemo R2 = new RunnableDemo("CSE",2000);
       R2.start();
    }   
 }
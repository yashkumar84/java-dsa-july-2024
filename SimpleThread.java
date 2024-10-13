public class SimpleThread extends Thread{
  public void run(){
    for(int i = 1;i<=5;i++){
      System.out.println(Thread.currentThread().getName() + ": " + i);
      try{
        Thread.sleep(1000);
      }catch(InterruptedException e){
        System.out.println(e.getMessage());
      }
    }
  }
  public static void main(String[] args) {
    SimpleThread thread1 = new SimpleThread();
    SimpleThread thread2 = new SimpleThread();

    thread1.setName("Thread 1");
    thread2.setName("Thread 2");

    thread1.start();
    thread2.start();
    
  }
  
}

public class DeadLock {
  private  Object lock1= new Object();
  private Object lock2 = new Object();

  public void method1(){
    synchronized(lock1){   
      System.out.println("entering method1()");
      System.err.println(" trying to invoke method2( from method1())");
     method2();
    }
   }

    public void method2(){
      synchronized (lock2){
        System.out.println("entering method1()");
        System.err.println(" trying to invoke method2( from method1())");
        method1();
    }
  }

  public static void main(String[] args) {
    DeadLock example = new DeadLock();
    Thread thread1 = new Thread(() -> example.method1());
    Thread thread2 = new Thread(() -> example.method2());

    thread1.start();
    thread2.start();

    System.out.println("main thread ends");

  }
}

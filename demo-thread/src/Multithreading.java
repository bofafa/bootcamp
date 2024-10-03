public class Multithreading {
  public static void main(String[] args) {
    

    for (int i =0; i<=3; i++){
      Multithreading myThing = new Multithreading(i);
      Thread myThread= new Thread (myThing);
      myThread.start();
      myThread.join();
    }
  }
}

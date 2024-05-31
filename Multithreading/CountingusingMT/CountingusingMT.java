
public class CountingusingMT extends Thread{
    public void run() {
       for (int i = 0; i <= 10; i++) {
           System.out.println("Thread"+" "+i);
       }
   }

   public static class ct20 extends Thread {
       public void run() {
           for (int i =11 ; i <= 20; i++) {
               System.out.println("Thread"+" "+i);
           }
       }
   }
public static void main(String[] args) {
   CountingusingMT objA= new CountingusingMT();
   ct20 objB = new ct20();
   objA.start();
   objB.start();
   objA.setPriority(9);
   objB.setPriority(6);
   }
}
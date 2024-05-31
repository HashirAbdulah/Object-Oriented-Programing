
public class TableUsingMT extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("3" + "*" + i + "=" + 3 * i);
            if (i == 1) {
                try {
                    Thread.sleep(5000);
                    } 
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static class table5 extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("5" + "*" + i + "=" + 5 * i);
                
            }
        }
    }

    public static class table2 extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("2" + "*" + i + "=" + 2 * i);
            }
        }
    }

    public static void main(String[] args) {
        TableUsingMT objA = new TableUsingMT();
        table5 objB = new table5();
        table2 objC = new table2();
        objA.start();
        objB.start();
        objC.start();
        objA.setPriority(10);
        objB.setPriority(9);
        objC.setPriority(7);
    }
}

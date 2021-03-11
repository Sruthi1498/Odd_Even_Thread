public class OddEvenMain {
    private static final int max= 20;
    private static final int thread = 2;

    public static void main(String[] args) throws InterruptedException {
        OddEven o = new OddEven(thread, max);

        Thread t1 = new Thread(new OddEven1(o,1),"thread 1");
        Thread t2 = new Thread(new OddEven1(o,0),"thread 2");
        t1.start();
        Thread.sleep(4000);
        t2.start();
    }

}

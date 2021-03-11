public class OddEven {
private int num = 1;
private int thread;
private int max;

public OddEven(int thread, int max)
{
    this.thread = thread;
    this.max = max;
}

public void print(int res)
{

    synchronized (this){
    while(num<=max-1)
    {
        while (num%2 != res) {
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" "+num++);
        notifyAll();
    }
    }
}
}
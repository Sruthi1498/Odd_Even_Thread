public class OddEven1 implements Runnable{

    private OddEven ob;
    private int result;

    public OddEven1(OddEven ob, int result){
        this.ob = ob;
        this.result = result;
    }
    @Override
    public void run() {
        ob.print(result);
    }
}

package lesThreads;

public class MonThread extends Thread{

    private String name;

    public MonThread(String name) {
        this.name = name;
    }

    public void run(){
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread());
    }
}

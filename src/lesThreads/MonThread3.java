package lesThreads;

import java.util.List;

public class MonThread3 extends Thread{

    String name;
    List<String> list;

    public MonThread3(String name, List<String> list) {
        this.name = name;
        this.list = list;
    }

    @Override
    public void run() {
       while (!Main.isFinish()){
           Main.incremtCpt();
           this.list.add(name);
           Thread.yield();
           try {
               Thread.sleep(10);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }

}

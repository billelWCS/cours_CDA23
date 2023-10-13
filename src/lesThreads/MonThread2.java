package lesThreads;

import java.util.List;

public class MonThread2 extends Thread{
    List<Integer> list;
    int i;

    public MonThread2(List<Integer> list, int i) {
        this.list = list;
    }

    @Override
    public void run() {
        addInt(list, i);
    }

    synchronized static void addInt (List<Integer> list, int i){
        list.add(i);
    }

}

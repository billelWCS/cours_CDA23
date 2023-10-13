package lesThreads;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String [] args){

        MonThread th1 = new MonThread("Cédric");
        MonThread th2 = new MonThread("Eliott");
        MonThread th3 = new MonThread("Alex");

        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i< 3; i++){
            System.out.println("je suis le main !");
        }

        Map<int[], Integer> map = new HashMap<>();
        int[] tab1 = {1,2,3,4};
        int[] tab2 = {1,2,44,4};
        int[] tab3 = {1,55,3,6};

        map.put(tab1, 0);
        map.put(tab2, 0);
        map.put(tab3, 0);



    }
}

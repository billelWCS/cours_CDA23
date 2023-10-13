package lesThreads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main (String [] args){

//        MonThread th1 = new MonThread("Cédric");
//        MonThread th2 = new MonThread("Eliott");
//        MonThread th3 = new MonThread("Alex");
//
//        th1.start();
//        th2.start();
//        th3.start();
//
//        try {
//            th1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        for (int i = 0; i< 3; i++){
//            System.out.println("je suis le main !");
//        }
//
//        Map<int[], Integer> map = new HashMap<>();
//        int[] tab1 = {1,2,3,4};
//        int[] tab2 = {1,2,44,4};
//        int[] tab3 = {1,55,3,6};
//
//        map.put(tab1, 0);
//        //calculer la somme du tableau
//        //insérer la somme dans la valeur : map.put(tab1, somme)
//        map.put(tab2, 0);
//        map.put(tab3, 0);

//        System.out.println("avant");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("après");
//
//        System.out.println(Thread.currentThread());

//        List<Integer> list = new ArrayList<>();
//
//        List<MonThread2> thread2List = new ArrayList<>();
//        for (int i = 0; i <10000; i++){
//            thread2List.add(new MonThread2(list, i));
//        }
//
//        for (MonThread2 th : thread2List){
//            th.start();
//        }
//
//        for (MonThread2 th : thread2List){
//            try {
//                th.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println(list.size());

        List<String> list = new ArrayList<>();

        MonThread3 th1 = new MonThread3("Cédric", list);
        MonThread3 th2 = new MonThread3("Alex", list);
        MonThread3 th3 = new MonThread3("Eliott", list);

        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list);
    }

    static int cpt = 0 ;

    public synchronized static boolean isFinish (){
        return cpt >= 10 ;
    }

    public synchronized static void incremtCpt (){
        cpt++;
    }

}

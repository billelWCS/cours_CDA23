package lundi;

import java.util.ArrayList;
import java.util.List;

public class LesCollections {
    public static void main (String [] args){

//        Listes
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());

        list.add("Cedric");
        list.add("Alexandre");
        list.add("Eliott");
        list.add(2, "Billel");

//        list.add(19, "Test");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Pierre");
        list2.add("Marine");

        list.addAll(list2);
//        list.clear();

        if (list.isEmpty()){
            System.out.println("list vide");
        }

        ArrayList<String> list3 = list;
        ArrayList<String> list4 = (ArrayList<String>) list.clone();

        list.add("Yohan");
//        String name = list.get(1);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);

        System.out.println(list.remove("Axel"));
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);

        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(7);
        numbersList.add(10);

        int sum = 0;
        for (Integer elt : numbersList){
           sum += elt ;
        }
//        for (int i = 0; i< numbersList.size() - 1; i++){
//            sum =+ numbersList.get(i);
//        }
        System.out.println("la somme est : " + sum);

        int var = 0;
        if (var % 5 == 0){
            System.out.println("divisible");
        }


    }
}

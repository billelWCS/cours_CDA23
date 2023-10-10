package lundi;

import java.util.ArrayList;
import java.util.Arrays;
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

        int indexOfEliott = list.indexOf("Eliot");
        System.out.println("index of : " + indexOfEliott);

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

        ArrayList<Integer> numbersToDelete = new ArrayList<>();

        for (Integer number : numbersList){
            if (number % 5 == 0){
               numbersToDelete.add(number);
            }
        }
        numbersList.removeAll(numbersToDelete);
        System.out.println(numbersList);

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

//        Création d'une liste de tableaux
        ArrayList<Integer[]> listOfTabs = new ArrayList<>();
//        Création des tableaux
        Integer[] tab1 = {1,3,22,44};
        Integer[] tab2 = {1,3,44,44, 66, 44};
        Integer[] tab3 = {1,31,22,44};
        Integer[] tab4 = {1,355,22,44};
//          Ajout des tableaux à la list
        listOfTabs.add(tab1);
        listOfTabs.add(tab2);
        listOfTabs.add(tab3);
        listOfTabs.add(tab4);

//        Création d'une list de lists
        List<List<Integer>> listOfLists = new ArrayList<>();
//          Créations des lists
        List<Integer> l1 = new ArrayList<>(Arrays.asList(tab1));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(tab2));
        List<Integer> l3 = new ArrayList<>(Arrays.asList(tab3));
        List<Integer> l4 = new ArrayList<>(Arrays.asList(tab4));
//          Ajout des lists dans la list
        listOfLists.add(l1);
        listOfLists.add(l2);
        listOfLists.add(l3);
        listOfLists.add(l4);

        tab4[1] = 999;
        Integer val = listOfTabs.get(3)[1];
        System.out.println("valeur : " + val);

        l4.set(1, 999);
        Integer val2 = listOfLists.get(3).get(1);
        System.out.println("valeur 2 : " + val2);


        int sumNb;
        ArrayList<Integer> sumTabs = new ArrayList<>();

        for (Integer[] tab : listOfTabs){
            sumNb = 0;
            for (int value : tab){
                sumNb += value;
            }
            sumTabs.add(sumNb);
        }
        System.out.println(sumTabs);


    }

}

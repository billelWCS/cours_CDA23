package lundi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LesMaps {

    public static void main (String [] args){

        Map<String,Integer> map = new HashMap<>();

        map.put("Eliott", 20);
        map.put("Alexandre", 21);
        map.put("Cédric", 22);

//        System.out.println(map.get("Alexandre"));
        map.put("Eliott", 22);
        System.out.println(map.get("Eliott"));

        map.put("Billel", 10);
        System.out.println("la taille de la map est : " + map.size());
        System.out.println(map.remove("billel"));

        System.out.println(map);
        map.replace("Billel", 22);
        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            entry.setValue(entry.getValue()+5);
        }
        System.out.println(map);

        Map<int[], Double> map2 = new HashMap<>();

        int[] tab1 = {1,2,4,7};
        int[] tab2 = {12,23,3,7};
        map2.put(tab1, 0.0);
        map2.put(tab2, 0.0);
        for (Map.Entry<int[], Double> entry : map2.entrySet()){
            for (int val : entry.getKey()) {
                entry.setValue(entry.getValue()+val);
            }
            entry.setValue(entry.getValue()/entry.getKey().length);
        }

        System.out.println(tabToString(tab1));
    }

    static String tabToString (int [] tab ){
//        String res = "{";
//        for (int val : tab){
//            res += val+", ";
//        }
//        res = res.substring(0, res.length()-2);
//        res += "}";
//        return res;
        Integer[] tabInteger = new Integer[tab.length];
        for (int i=0; i<tab.length; i++){
            tabInteger[i] = tab[i];
        }
        List<Integer> list = new ArrayList<>(List.of(tabInteger));
        return list.toString();
    }
}

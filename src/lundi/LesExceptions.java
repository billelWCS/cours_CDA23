package lundi;

public class LesExceptions {

    public static void main (String [] args){

//        int [] tab = new int[3];
//
//        try {
//            int test;
//            tab[index()] = 12;
//            System.out.println(tab[index()]);
//        }catch(Exception e){
//            System.out.println("l'index est supèrieure à la taille du tableau");
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("Je suis le traitement d'après");

        int [] tab = new int[3];
        int index = 11;
        int val = 33;

        try {
            insertValue(tab, index, val);
        } catch (MyException e) {
            System.out.println(e.text);
        }


    }

    static void insertValue(int[] tab, int index, int val) throws MyException {
        if (tab.length > index){
            tab[index] = val;
        }else{
            throw new MyException();
        }
    }

    static int index(){
        return 12;
    }
}

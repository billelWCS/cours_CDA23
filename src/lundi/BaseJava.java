package lundi;

public class BaseJava {

    public static void main (String [] args){

        final int ValMAx = 100;

        // Les types
        int myInt;
        myInt = 14;


        int myOtherInt = 15;

        long myLong = 1;
        long myOtherLong = 1234567890;

        double myDouble = 3.14;
        char myChar = '&';

        boolean myBool = false;

        int sum = 14 + 15 ;
        double sumDouble = 14.3 * 2;

        double divResult = 10 / 3 ;

        boolean condition =  sum == 13;
        boolean bool1 =  true;
        boolean bool2 =  false;

        boolean and =  bool1 && bool2;
        boolean or = bool1 || bool2;
        boolean negation =  !bool1;

        boolean egal =  sum == myInt;
        boolean different =  sum != 13;

        boolean inf =  sum < myInt;
        boolean sup =  sum > myInt;
        boolean infEgal =  sum <= myInt;
        boolean supEgal =  sum >= myInt;

        String str = "Je suis une chaine de charactère !";
        String [] words = str.split(" ");

        System.out.println(words[words.length-1]);


        int[] myIntTab = new int[5] ;

        myIntTab[0] = 3;

        char[] myCharTab = new char[3];

//        Eliott, Cedric, Alexandre
        String[] myStringTab = { "Eliott", "Cedric", "Alexandre"};

        String var = myStringTab[1];
        System.out.println(var);

        Animal chat = new Animal();
//        System.out.println(chat.toString());

        Jour j1 = Jour.Lundi;
        Jour j2 = Jour.Dimanche;

        Integer myInteger = 1 ;

        String nb = "23.33";
        double nbEnInt =  Double.parseDouble(nb);

        String j1EnString = j1.name();

        String[] tab = {"10", "20", "30"};
        int [] intTab = {Integer.parseInt(tab[0]), Integer.parseInt(tab[1]), Integer.parseInt(tab[2]) };

        System.out.println((intTab[0] + intTab [1]) == intTab[2]);

        int val1 = 12;
        int val2 = 15;

//        if (val2 == val1)
//            System.out.println("val1 et val2 sont :");
//        System.out.println("égaux");


        if (val1 <= val2)
            System.out.println("true");
        else
            System.out.println("false");

        System.out.println("----------------------");

        String day = "Lundi";
        switch (day){
            case "Lundi" :
                System.out.println("On est lundi !");
                System.out.println("autre ligne !");
                break;
            case "Dimanche" :
                System.out.println("On est le WE !");
                break;
            default:
                System.out.println("Autre jour !");
        }

        System.out.println("------------------------");
        System.out.println(sayHello());

        String msg = "ceci est un text";
        afficheMessge(msg);

        System.out.println(addition(11, 23));

//        Les boucles
//        while

        int i = 0;
//        while (i< 10){
////            traitement
//            System.out.println("intération : "+i);
//            i++;
//        }

//        do While
        int j = 0;
//        do {
//            System.out.println("intération : "+j);
//            j++;
//        }while (false);

//        for

        for (i = 9; i >= 0 ; i--){
            System.out.println("itération : "+ i);
        }

//        for (i=0; i< words.length; i++){
//            System.out.println(words[i]);
//        }

//        for each
        for (String word : words ){
            System.out.println(word);
        }

        int[] numbers = new int[50];

        for (i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
        }

        sum = 0;

//        numbers[0] : 1
//        numbers[1] : 2
//        numbers[2] : 3
//        numbers[3] : 4
//        numbers[4] : 5
//        ...
//        numbers[49] : 50


        for (int valeur : numbers){
            sum+= valeur;
//            sum = sum + valeur;
        }
        System.out.println(sum);

    }

    static String sayHello (){
        System.out.println("je suis dans la fonction !");
        return "Hello !";
    }

    static void afficheMessge (String text){
        System.out.println(text);
    }

    static int addition (int nb1, int nb2){
        return nb1 + nb2;
    }

    static int test (boolean bool){
        if (bool)
            return 1;
        return 10;
    }

}

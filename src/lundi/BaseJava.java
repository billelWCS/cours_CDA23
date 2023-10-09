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
    }
}

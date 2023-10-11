package orienteObjet.heritage;

public class Main {
    public static void main (String [] args){

        Parent parent = new Parent(1,2);

        Enfant enfant = new Enfant(1,2,3);

        Parent enfant2 = new Enfant(1,2,3);
//        Enfant test = new Parent(1,2);

        affichage(parent);
        affichage(enfant);
        affichage(enfant2);

        affichage2(enfant);
//        affichage2(parent);
//        affichage2((Enfant) parent);
        affichage2((Enfant) enfant2);

        affichage3(new SportCar("name", "modele", 90));

    }

    static void affichage (Parent parent){
        System.out.println(parent.getAttribut1());
    }

    static void affichage2 (Enfant enfant){
        System.out.println(enfant.getAttribut1());
    }

    static void affichage3 (Vehicule vehicule){
        System.out.println("cc");
    }
}

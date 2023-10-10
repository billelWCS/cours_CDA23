package orienteObjet;

public class Main {

    public static void main (String[] args){
        Personne billel = new Personne("Billel", "ABBES", 1992);
        System.out.println(billel.cpt );
        Personne alex = new Personne("Alex", "ABBES", 1992);
        System.out.println(billel.cpt );
        System.out.println(alex.cpt );

        System.out.println(Personne.cpt );

        Personne p2 = new Personne( "Nom" , "Margot", 1993);
        billel.seMarier(billel);

        Voiture bmw = new Voiture("BMW", "Noir", 2018, billel);
        Voiture peugot = new Voiture("208", "Noir");

        System.out.println(peugot.annee);
        System.out.println(peugot.category);
    }
}

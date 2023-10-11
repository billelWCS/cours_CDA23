package foody;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] arguments){
        Restaurant chezCreative = new Restaurant("Chez Cheative");

        Livreur livreur1 = new Livreur("David");
        Livreur livreur2 = new Livreur("Pierre");

        chezCreative.registerObserver(livreur1);
        chezCreative.registerObserver(livreur2);

        Plat p1 = new Plat();
        Plat p2 = new Plat();
        List<Plat> plats = new ArrayList<>();
        plats.add(p1);
        plats.add(p2);

        Client cedric = new Client("Cederic");
        Commande commande = cedric.commander(plats, chezCreative);

        chezCreative.prendreCommande();
        chezCreative.terminerCommande(commande);

    }
}

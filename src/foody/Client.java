package foody;

import designPattern.observateur.Observer;
import designPattern.observateur.Subject;

import java.util.ArrayList;
import java.util.List;

public class Client extends Subject implements Observer {
    private String name;
    private List<Commande> commandes = new ArrayList<>();

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Commande commander(List<Plat> plats, Restaurant restaurant){
        Commande commande = new Commande(plats, restaurant, this);
        commandes.add(commande);
        restaurant.recevoirCommande(commande);
        restaurant.update(commande);
        return commande;
    }

    @Override
    public void update(Object data) {
        Commande commande = (Commande) data;
        switch (commande.getEtat()){
            case EnCoursDePreparation :
                    System.out.println(name+" : La commande chez "+commande.getRestaurant().getNom()+" a été prise");
                    break;
            case EnAttenteDeLivraison :
                System.out.println(name+" : La commande chez "+commande.getRestaurant().getNom()+" est en attente de livraison");
                break;
        }
    }
}

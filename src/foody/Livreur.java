package foody;

import designPattern.observateur.Observer;

public class Livreur implements Observer {
    private String name;

    public Livreur(String name) {
        this.name = name;
    }

    @Override
    public void update(Object data) {
        Restaurant restaurant = (Restaurant) data;
        System.out.println("Livreur "+name+" : une commande en attente de livraison chez "+restaurant.getNom());
    }
}

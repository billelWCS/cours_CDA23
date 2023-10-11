package foody;

import java.util.List;

public class Commande {
    private List<Plat> plats;
    private Restaurant restaurant;
    private Client client;
    private Etat etat = Etat.EnAttenteDePreparation;

    public List<Plat> getPlats() {
        return plats;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Client getClient() {
        return client;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Commande(List<Plat> plats, Restaurant restaurant, Client client) {
        this.plats = plats;
        this.restaurant = restaurant;
        this.client = client;
    }

    public String toString (){
        return "la commande de "+client.getName();
    }
}

package foody;

import designPattern.observateur.Observer;
import designPattern.observateur.Subject;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Subject implements Observer {
    private String nom;
    private List<Commande> commandesEnAttentes = new ArrayList<>();
    private List<Commande> commandesEnPreparation = new ArrayList<>();
    private List<Commande> commandesTerminees = new ArrayList<>();

    public Restaurant(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void recevoirCommande (Commande commande){
        this.commandesEnAttentes.add(commande);
    }

    @Override
    public void update(Object data) {
        System.out.println(nom+" a reçu "+data);
    }

    public void prendreCommande(){
        Commande commande = this.commandesEnAttentes.remove(0);
        this.commandesEnPreparation.add(commande);
        commande.setEtat(Etat.EnCoursDePreparation);
        commande.getClient().update(commande);
    }

    public void terminerCommande(Commande commande){
        if (this.commandesEnPreparation.remove(commande)){
            this.commandesTerminees.add(commande);
            commande.setEtat(Etat.EnAttenteDeLivraison);
            commande.getClient().update(commande);
            notifyObservers(commande.getRestaurant());
        }
        else
            System.out.println("une erreur est survenue !");
    }
}

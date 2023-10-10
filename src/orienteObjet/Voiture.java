package orienteObjet;

import jdk.jfr.Category;

public class Voiture {

    // les attributs
    String modele = "modele";
    String Couleur = "couleur";
    int annee = 2023;
    String category = "voiture";
    Personne proprio;

    // un ou des contructeurs
    public Voiture (){}

    public Voiture (String modele, String coleur, int annee, Personne proprio){
        this.modele = modele;
        this.Couleur = coleur;
        this.annee = annee;
        this.proprio = proprio;
    }

    public Voiture (String modele, String couleur){
        this.modele = modele;
        this.Couleur = couleur;
        this.annee = 2023;
    }

    // des méthodes et fonctions
}

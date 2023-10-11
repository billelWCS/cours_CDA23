package orienteObjet.heritage;

public class Voiture extends Vehicule{
    private String modele;

    public Voiture(String name, String modele) {
        super(name);
        this.modele = modele;
    }
}

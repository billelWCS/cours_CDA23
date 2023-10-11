package orienteObjet.heritage;

public class SportCar extends Voiture{
    private int nbChevaux;

    public SportCar(String name, String modele, int nbChevaux) {
        super(name, modele);
        this.nbChevaux = nbChevaux;
    }


}

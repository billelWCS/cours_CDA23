package orienteObjet.lesInterfaces;

public class Footballer extends IndividuAbs{

    public Footballer(String firstname, String lastname) {
        super(firstname, lastname);
    }

    @Override
    public String getCoordonnees() {
        return "Je suis le footbaleur : "+firstname+" "+lastname;
    }
}

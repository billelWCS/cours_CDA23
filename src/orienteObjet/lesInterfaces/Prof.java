package orienteObjet.lesInterfaces;

public class Prof extends IndividuAbs{


    public Prof(String firstname, String lastname) {
        super(firstname, lastname);
    }

    @Override
    public String getCoordonnees(){
        return "Je suis le prof : "+firstname+" "+lastname;
    }


}

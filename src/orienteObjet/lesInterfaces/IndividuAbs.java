package orienteObjet.lesInterfaces;

public abstract class IndividuAbs {
    protected String firstname;
    protected String lastname;

    public IndividuAbs(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public abstract String getCoordonnees();

    public void sayHello(){
        System.out.println("hello !");
    }
}

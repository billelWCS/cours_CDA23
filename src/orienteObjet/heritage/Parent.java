package orienteObjet.heritage;

public class Parent {
    private int attribut1;
    private int attribut2;
    protected int protectedAttribute;

    public Parent(int attribut1, int attribut2) {
        this.attribut1 = attribut1;
        this.attribut2 = attribut2;
    }

    public int getAttribut1() {
        return attribut1;
    }

    public int getAttribut2() {
        return attribut2;
    }
}

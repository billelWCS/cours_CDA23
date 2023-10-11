package orienteObjet.heritage;

public class Enfant extends Parent{
   private int attribut3;


    public Enfant(int attribut1, int attribut2, int attribut3) {
        super(attribut1, attribut2);
        this.attribut3 = attribut3;
    }

    public Enfant(int attribut1, int attribut2) {
        super(attribut1, attribut2);
        this.attribut3 = 0;
    }

    public Enfant(){
        super(0,0);
        this.attribut3 = 0;
    }

    public int getAttribut3() {
        return attribut3;
    }
}

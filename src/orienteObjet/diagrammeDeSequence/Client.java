package orienteObjet.diagrammeDeSequence;

import java.util.List;

public class Client {
    private int id;
    private List<Compte> comptes;

    public Client(int id, List<Compte> comptes) {
        this.id = id;
        this.comptes = comptes;
    }

    public int getId() {
        return id;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public Compte compte (int noC) {
        for (Compte compte : comptes){
            if (noC == compte.getNo())
                return compte;
        }
        return null;
    }

    @Override
    public String toString(){
        return this.id+" : "+ this.comptes;
    }
}

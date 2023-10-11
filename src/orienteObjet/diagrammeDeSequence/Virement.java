package orienteObjet.diagrammeDeSequence;

public class Virement {
    private Compte c1;
    private Compte c2;
    private int mnt;

    public Virement(Compte c1, Compte c2, int mnt) {
        this.c1 = c1;
        this.c2 = c2;
        this.mnt = mnt;
    }

    public boolean effectuer (){
//        boolean retrait = this.c1.retirer(this.mnt);
//        if (!retrait)
//            return false;
//        boolean depot = this.c2.deposer(this.mnt);
//        return depot;

        if (this.c1.retirer(this.mnt) && this.c2.deposer(this.mnt))
            return true;
        return false;
    }

}

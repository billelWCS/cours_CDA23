package orienteObjet.diagrammeDeSequence;

public class Compte {
    private int no;
    private int solde;

    public Compte(int no, int solde) {
        this.no = no;
        this.solde = solde;
    }

    public int getNo() {
        return no;
    }

    public int getSolde() {
        return solde;
    }

    public boolean retirer(int mnt) {
        System.out.println("je suis dans retirer");
        if (solde >= mnt){
            this.solde -= mnt;
            return true;
        }
        return false;
    }

    public boolean deposer(int mnt) {
        System.out.println("je suis dans deposer");
        try {
            this.solde += mnt;
            return true;
        }catch (Exception e){
            return false;
        }
    }

   @Override
    public String toString (){
        return this.no+" : "+this.solde;
    }
}

package orienteObjet;

public class Personne {

    private String nom;
    private String prenom;
    private int age;
    static int cpt = 0;

    public Personne(String nom, String prenom, int anneDeNaiss) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = 2023 - anneDeNaiss;
        cpt++;
    }

    public String getNom (){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void seMarier (Personne personne){
        if (this != personne){
            System.out.println(this.prenom + " s'est marié avec " + personne.prenom);
        }else{
            System.out.println(this.prenom + " s'est marié avec lui même");
        }

    }
}

package orienteObjet.exercice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etudiant {

    private String name;
    private Map<String, List<Integer>> listDesNotes = new HashMap<>();
    private double moyenne = 0;

    public Etudiant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void addNote (String matiere, Integer note){
        this.listDesNotes.get(matiere).add(note);
        this.refreshMoyenne();
    }

    private void refreshMoyenne (){
        this.moyenne = 0;
        for (Map.Entry<String, List<Integer>> entry : this.listDesNotes.entrySet()){
//            List<Integer> listDesNoteDeCetteMatiere = entry.getValue();
//            double moyennePourCetteMatiere = calculMoyenne(listDesNoteDeCetteMatiere);
//            this.moyenne += moyennePourCetteMatiere;
            this.moyenne += calculMoyenne( entry.getValue());
        }
        this.moyenne /=  this.listDesNotes.size();
    }

    private double calculMoyenne (List<Integer> list){
        double res = 0.0;
        for (Integer value : list){
            res += value;
        }
        return res/list.size();
    }
}

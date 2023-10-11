package orienteObjet.diagrammeDeSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String [] args){

        Compte c1 = new Compte(1, 1000);
        Compte c2 = new Compte(2, 90);
        Compte[] tab = {c1, c2};
        List<Compte> comptes = new ArrayList<>(Arrays.asList(tab));

        Client client = new Client(111, comptes);

        List<Client> clients = new ArrayList<>();
        clients.add(client);

        SGB.setClients(clients);
        System.out.println(client.getComptes());

        if(SGB.effectuerVirementP(111, 1, 2, 5)){
            System.out.println("Le virement s'est bien passé !");
        }else{
            System.out.println("Le virement s'a pas pu être effectuer !");

        }
        System.out.println(client.getComptes());

    }
}

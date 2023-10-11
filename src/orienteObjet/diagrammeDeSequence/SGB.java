package orienteObjet.diagrammeDeSequence;

import java.util.List;

public class SGB {
    private static List<Client> clients;

    public static boolean effectuerVirementP (int id, int noC1, int noC2, int mnt){
        Client client = chercherClient(id);
        Compte c1 = client.compte(noC1);
        Compte c2 = client.compte(noC2);
        Virement virement = new Virement (c1, c2, mnt);
        boolean res = virement.effectuer();
        return res;
    }

    public static Client chercherClient (int id){
        for (Client client : clients){
            if (client.getId() == id)
                return client;
        }
        return null;
    }

    public static void setClients(List<Client> clients) {
        SGB.clients = clients;
    }
}

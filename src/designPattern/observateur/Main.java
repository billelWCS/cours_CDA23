package designPattern.observateur;

public class Main {
    public static void main (String[] args){
        Twisto twisto = new Twisto();

        Client client = new Client();
        Employe employe = new Employe();
        twisto.registerObserver(client);
        twisto.registerObserver(employe);
        twisto.seMettreEnGreve();
        System.out.println("*********** le lendemain ***************");
        twisto.terminerLaGreve();
    }
}

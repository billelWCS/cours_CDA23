package designPattern.observateur;

public class Twisto extends Subject{
    public void seMettreEnGreve(){
        notifyObservers(true);
    }

    public void terminerLaGreve(){
        notifyObservers(false);
    }
}

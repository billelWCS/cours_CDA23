package designPattern.observateur;

public class Client implements Observer{
    @Override
    public void update(Object data) {
        if ((boolean)data)
            System.out.println("le reseau twisto n'est plus disponible");
        else
            System.out.println("de nouveau opérationnel !");
    }

}

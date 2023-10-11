package designPattern.observateur;

public class Employe implements Observer{
    @Override
    public void update(Object data) {
        if ((boolean)data)
            System.out.println("Rentrez chez vous");
        else
            System.out.println("Au bolout !");
    }
}

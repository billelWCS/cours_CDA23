package orienteObjet.lesInterfaces;

public class Main {
    public static void main (String [] args){

        IndividuAbs individuAbs = new IndividuAbs("Joe", "David") {
            @Override
            public String getCoordonnees() {
                return "Je suis un individu normal : "+firstname+" "+lastname;
            }
        };

        Prof prof = new Prof("Billel" , "Abbes");
        sePresenter(prof);
        prof.sayHello();

        Footballer footballer = new Footballer("David", "Beckham");
        sePresenter(footballer);
        footballer.sayHello();

        sePresenter(individuAbs);

//        Animal animal = new Animal("animal");
//        crier(animal);

        Chat chat = new Chat ("cuteChat");
        crier(chat);

        Chien chien = new Chien("chien");
        crier(chien);

    }

    public static void sePresenter (IndividuAbs individu){
        System.out.println(individu.getCoordonnees());
    }

    public static void crier(Animal animal){
        System.out.println("je suis : "+animal.getName());
    }

}

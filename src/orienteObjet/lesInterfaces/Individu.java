package orienteObjet.lesInterfaces;

public interface Individu {
    String getCoordonnees();

    default void sayHello(){
        System.out.println("Hello");
    }

}

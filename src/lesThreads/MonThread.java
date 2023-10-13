package lesThreads;

public class MonThread extends Thread{

    private String name;

    public MonThread(String name) {
        this.name = name;
    }

    public void run(){
        for (int i = 0; i< 3; i++){
            System.out.println("je suis le thread "+name);
        }
    }
}

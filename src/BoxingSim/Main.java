package BoxingSim;

public class Main {
    public static void main(String[] args) {
        Fighter Sassuke = new Fighter("Sassuke" , 15 , 100, 90, 30);
        Fighter Naruto = new Fighter("Naruto" , 20 , 120, 100, 20);
        Ring r = new Ring(Sassuke,Naruto , 100, 90);
        r.run();
    }
}

package qa.guru;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 2);
        Cat murky = new Cat("Murka", 3);

        barsik.setGav();
        murky.runAway();

        System.out.println("Cat number is: "+ Cat.getCatNumber());

    }
}

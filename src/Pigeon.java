public class Pigeon extends Bird{

    public Pigeon(String name, String color) {
        super(name, color);
    }
    public static void main(String[] args){

        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();

    }

    public void eatPizza() {
        System.out.println("Delicious pizza!");
    }
}

public class Bird {

    protected String name;
    protected String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args){

        Bird myBird = new Bird("Tweety", "Yellow");
        myBird.speak();
        myBird.fly();
    }

    public void speak() {
        System.out.println("My name is " + name + " and I am a " + color + " bird.");
    }

    public void fly() {
        System.out.println("I'm " + name + " and I can fly high in the blue sky!");
    }
}

public class Main {

    public static void main(String[] args){

//        Bird myBird = new Bird("Tweety", "Yellow");
//        myBird.speak();
//        myBird.fly();

        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();

        Parrot chiluka = new Parrot("Chiluka", "Red & Green");
        chiluka.speak();

    }
}

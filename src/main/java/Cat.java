public class Cat extends Animal {

    private int lives;

    public Cat(String name, int lives) {
        super(name);
        this.lives = lives;
    }

    @Override
    public void greeting() {
        System.out.println("Hi, I'm a cat named " + this.name); // we can use name because it's in our superclass!
    }
}

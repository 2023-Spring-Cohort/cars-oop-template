public class Animal {
    // the access modified "protected" allows our code to be seen by
    // our subclasses as well as this class, but no one else
    protected String name;

    public Animal(String name){
        this.name = name;

    }

    public void greeting() {
        System.out.println("Hi, I'm " + name);
    }
}

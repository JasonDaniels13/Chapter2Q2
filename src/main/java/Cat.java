

public class Cat extends Animal {

    public Cat() {
        super("Cat");

    }
    @Override
    public String sound(){
        return "meow";

    }
    @Override
    public String move() {
        return "cat running";

    }

}

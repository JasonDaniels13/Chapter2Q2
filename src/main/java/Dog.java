

public class Dog extends Animal{

    public Dog(){
        super("Dog");
    }

    @Override
    public String move()
    {
        return "Dog walking";
    }

    @Override
    public String sound(){
        return "Whoof";

    }
}

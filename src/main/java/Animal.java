import Interfaces.Move;
import Interfaces.Sound;

public abstract class Animal implements Move, Sound {

    private String type;

    public Animal(String type){
        this.type = type;

    }

    public String getAnimalType() {
        return type;
    }

    public void setAnimalType(String type) {
        this.type = type;
    }




}

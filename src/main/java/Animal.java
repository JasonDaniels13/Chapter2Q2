import Interfaces.Move;
import Interfaces.Sound;

public abstract class Animal implements Move, Sound {

    private String animalType;

    public Animal(String animalType){
        this.animalType = animalType;

    }

    public String getAnimalType() {
        return animalType;
    }


}

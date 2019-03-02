import Interfaces.Move;
import Interfaces.Sound;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try{

            System.out.println("Enter Cat or Dog to see their move and sound action...");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input;

            while((input = br.readLine())!=null)
                if (input.toLowerCase().equals("cat")) {

                Cat cat = new Cat();
                doSpeak(cat);
                doMove(cat);


            } else if (input.toLowerCase().equals("dog")) {

                Dog dog = new Dog();
                doSpeak(dog);
                doMove(dog);

            }
        }catch(IOException io){
            io.printStackTrace();
        }

    }


    private static void doMove(Move mover){
        System.out.println(mover.move());
    }

    private static void doSpeak(Sound speak){

        System.out.println(speak.sound());
  }
}